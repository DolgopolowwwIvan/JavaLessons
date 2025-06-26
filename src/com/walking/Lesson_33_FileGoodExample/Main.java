package com.walking.Lesson_33_FileGoodExample;



import java.util.Scanner;


import static com.walking.Lesson_33_FileGoodExample.Service.CarService.convertFileToCars;

public class Main {
    public static void main(String[] args) {
        Car[] cars = convertFileToCars("./resources/carCatalog.txt");
        for (Car c: cars){
            System.out.println(c.toString());
        }

    }

    private static Car createCar() {
//        Неудачный шаг со сканером, повторно использовать метод createCar() мы не сможем.
//        Спишем на условности
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a car's mark");
        String mark = scanner.nextLine();

        System.out.println("Enter a car's color");
        String color = scanner.nextLine();

        scanner.close();

        return new Car(mark, color);
    }

    private static Car[] initCars() {
        Car car2 = new Car("Toyota", "Green");
        Car car5 = new Car("Toyota", "Green");
        Car car6 = new Car("Toyota","Green");
        Car car4 = new Car("Toyota","Green");
        Car car7 = new Car("Toyota", "Green");
        Car car8 = new Car("BMW","Green");
        Car car1 = new Car("BMW","Green");
        Car car3 = new Car("BMW","Green");
        Car car9 = new Car("BMW","Green");
        Car car10 = new Car("BMW","Green");

        return new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }
}
