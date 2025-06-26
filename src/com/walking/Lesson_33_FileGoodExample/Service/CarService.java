package com.walking.Lesson_33_FileGoodExample.Service;


import com.walking.Lesson_33_FileGoodExample.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public static String readCatalogWithFileReader (String filePath){
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            int data = reader.read();
            while ((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
            return content.toString();
        }catch (FileNotFoundException e){
            return e.getMessage();
        }
        catch (IOException e){
            return  e.getMessage();
        }
    }

    public static Car[] convertFileToCars (String filePath){
        String line = readCatalogWithFileReader(filePath);
        if (line.startsWith("Ошибка")){
            throw new RuntimeException(line);
        }

        //Разбиваем на строки
        String[] lines = line.split("\n");

        List<Car> cars = new ArrayList<>();
        for(String l: lines){
            if(!l.trim().isEmpty()){
                try {
                    cars.add(parseCar(l));
                }catch (Exception e){
                    e.getMessage();
                }
            }
        }

        return cars.toArray(new Car[0]);
    }




}
