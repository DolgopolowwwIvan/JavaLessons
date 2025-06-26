package com.walking.Lesson_33_FileGoodExample;
import java.util.Objects;

public class Car {
    private final String mark;
    private final String color;

    private final int registration_number;

    public Car(String mark, String color){
        this.mark = mark;
        this.color = color;

        registration_number = mark.hashCode();
    }
    public Car(String mark, String color, int registration_number){
        this.mark = mark;
        this.color = color;
        this.registration_number = registration_number;
    }


    public int getRegistration_number() {
        return registration_number;
    }

    public String getMark() {
        return mark;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode(){
        int fullHash = Objects.hash(mark);
        int sixDigitHash = Math.abs(fullHash) % 1_000_000;
        return sixDigitHash;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Car otherCar = (Car) obj;
        return Objects.equals(registration_number, otherCar.registration_number);

    }

    @Override
    public String toString() {
        return String.format("Car[mark=%s, color=%s, regNum=%d]", mark, color, registration_number);
    }
}
