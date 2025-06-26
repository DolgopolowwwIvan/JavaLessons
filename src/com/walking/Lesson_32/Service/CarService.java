package com.walking.Lesson_32.Service;


import com.walking.Lesson_32.Car;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CarService {
    private Car[] cars;

    public CarService(Car... cars){
        this.cars = cars;
    }

    public Car addCar(Car car) {
        int newArrayLength = cars.length + 1;

        Car[] newCars = new Car[newArrayLength];
        newCars[newArrayLength - 1] = car;

        cars = copyArray(cars, newCars);
        return cars[cars.length - 1];
    }

    private Car[] copyArray(Car[] oldArray, Car[] newArray) {
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }

    public Car[] getAllCars(){
        return cars;
    }

    public Car getCarByMark(String mark) {
        for (Car c : cars){
            if(c.getMark().equals(mark)){
                return c;
            }
        }
        return null;
    }

    public Car getCarByRegistration_number(String Registration_number) {
        for (Car c : cars){
            if(String.valueOf(c.getRegistration_number()).equals(Registration_number)){
                return c;
            }
        }
        return null;
    }

    public void addCarToCarCatalog(Car[] cars){
        try (FileOutputStream fos = new FileOutputStream("./resources/carCatalog.txt")) {
            for (Car car : cars) {
                String carToString = car.toString();
                byte[] buffer = carToString.getBytes();

                fos.write(buffer);

                //Разделитель переводом строки
                fos.write(System.lineSeparator().getBytes());
                System.out.println("The file has been written");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car parseCar(String line){
        // Удаляем лишние символы (если есть)
        line = line.trim().replace("Car[", "").replace("]", "");

        String[] parts = line.split(", ");
        String mark = parts[0].split("=")[1];
        String color = parts[1].split("=")[1];

        // Достаём regNum, удаляя лишние символы (если есть)
        String regNumStr = parts[2].split("=")[1].replaceAll("[^0-9]", "");
        int regNum = Integer.parseInt(regNumStr);

        return new Car(mark, color, regNum);
    }
    public static String readCarFromCatalog(String filePath){

        try (FileInputStream fin=new FileInputStream(filePath)){
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);
            String text = new String(buffer);
            return text;
        }catch (IOException e){
            return e.getMessage();
        }
    }



}
