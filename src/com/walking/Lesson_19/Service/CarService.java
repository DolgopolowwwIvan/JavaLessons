package com.walking.Lesson_19.Service;


import com.walking.Lesson_19.Model.Car;

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



}
