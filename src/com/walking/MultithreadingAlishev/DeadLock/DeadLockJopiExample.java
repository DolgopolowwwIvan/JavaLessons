package com.walking.MultithreadingAlishev.DeadLock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockJopiExample {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();

        Thread thread1 = new Thread(runner::firstThread);
        Thread thread2 = new Thread(runner::secondThread);

        thread1.start();
        thread2.start();

        System.out.println(thread1);
        
        thread1.join();
        thread2.join();

        runner.finished();
    }
}

class Runner {
    private final Account account1 = new Account();
    private final Account account2 = new Account();

    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    private final Random random = new Random(2222);

    // Создадим метод, с помощью которого будем правильно
    // переключать локи между потоками

    public void takeLock(Lock lock1, Lock lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        /*
    Представь, что тебе нужно зайти в две комнаты,
    в каждой из которых есть дверь с замком.
    Ты не хочешь ждать и стучаться, если дверь заперта.
    Ты просто подходишь и пробуешь повернуть ручку:

    Если дверь открыта (tryLock() вернул true) — ты заходишь внутрь и запоминаешь,
    что ты в этой комнате (firstLockTaken = true).

    Если дверь заперта (tryLock() вернул false) — ты не стоишь и не ждешь,
    а просто идёшь дальше и запоминаешь, что в эту комнату ты не зашел (secondLockTaken = false).

    Что происходит в этом коде:
    Метод takeLock пытается одновременно "открыть" оба замка (lock1 и lock2).
    Он не будет "стоять и ждать" ни перед одним из них. Он просто проверит оба и
    сразу сообщит результат (через переменные firstLockTaken и secondLockTaken),
    какие замки удалось открыть, а какие — нет.

    Зачем это нужно?
    Чтобы избежать взаимной блокировки (когда ты ждешь у одной двери,
    а ключ от нее лежит в другой комнате, в которую ты не можешь попасть).
    Этот способ безопаснее, но после него нужно обязательно проверить:

    Если оба замка открылись — отлично, работай.

    Если хотя бы один не открылся — нужно аккуратно закрыть обратно те,
    что открылись (вызвать unlock()), иначе они так и останутся занятыми и никто другой не сможет в них войти.

    */

        while (true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }

                // Если мы взяли первый лок
                if (firstLockTaken) {
                    lock1.unlock();
                }

                // Если мы взяли второй лок
                if (secondLockTaken) {
                    lock2.unlock();
                }

                //Мы выходим из метода только тогда, когда мы успешно взяли два лока
            }

            // Спим, чтобы дать время другим потокам взять освободившиеся локи
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void firstThread() {
        for (int i = 0; i < 10000; i++) {

            takeLock(lock1, lock2);

            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }

        }
    }

    public void secondThread() {
        for (int i = 0; i < 10000; i++) {

            /*
                Так выглядит deadlock, потоки принимаются в
                разном порядке, а значит вечно ожидают друг друга

                lock2.lock();
                lock1.lock();
             */

            takeLock(lock2, lock1);

            try {
                Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    public void finished() {
        System.out.println("Account1 balance: " + account1.getBalance());
        System.out.println("Account2 balance: " + account2.getBalance());
        System.out.println("Total balance: " + (account1.getBalance() + account2.getBalance()));
    }
}

class Account {
    private int balance = 10000;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withRaw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withRaw(amount);
        acc2.deposit(amount);
    }
}
