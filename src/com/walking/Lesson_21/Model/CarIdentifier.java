package com.walking.Lesson_21.Model;

import java.util.Objects;

public class CarIdentifier {
    private final String number;
    private final int year;


    public CarIdentifier(String number, int year) {
        this.number = number;
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }

        CarIdentifier identifier = (CarIdentifier) o;

//        Класс Objects содержит множество методов для работы с объектами.
//        equals(), hashcode(), проверки на null, сравнения и пр.
//        Удобен в тех случаях, когда мы не уверены, что значение (или хотя бы одно из значений)
//        не равно null
        return year == identifier.year && Objects.equals(number, identifier.number);


    }

    @Override
    public int hashCode() {
        int hashcode = number.hashCode();
        hashcode += 31 * year;

        return hashcode;
    }
}
