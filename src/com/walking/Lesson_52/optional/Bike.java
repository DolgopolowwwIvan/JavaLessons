package com.walking.Lesson_52.optional;

public class Bike {

    private final String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
