package com.walking.Multithreading.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        // При создании семафора выделяется ограниченное количество
        // разрешений на работу с ресурсом (в данном случае 3)

        // Эти разрешения являются доступами к ресурсу. Когда поток получает
        // разрешение, количество "мест" для работы уменьшается, пока он не вернет
        // это разрешение обратно в общак.
        Semaphore semaphore = new Semaphore(3);


        // Метод, который выдает разрешение
        try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();

            System.out.println("All permits have been acquired!");

            semaphore.acquire();

            System.out.println("Can't reach here...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Метод с помощью которого семафор забирает разрешение
        semaphore.release();

        // Метод, который показывает количество доступных разрешения
        System.out.println(semaphore.availablePermits());



    }
}
