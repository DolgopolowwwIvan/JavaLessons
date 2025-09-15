package com.walking.Lesson_52.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Bike bike = new Bike("Makita");
        Bike bike2 = new Bike("gta");

        Bike[] garage = new Bike[2];
        garage[0] = bike2;
        garage[1] = bike;

        garage[0] = null;
        Bike fisrtBike = garage[0];

        Optional<Bike> bikeOptional = Optional.ofNullable(fisrtBike);

        System.out.println(Arrays.toString(garage));
    }
}
