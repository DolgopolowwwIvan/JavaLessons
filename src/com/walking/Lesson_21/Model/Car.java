package com.walking.Lesson_21.Model;

import java.util.Objects;
public final class Car {
    //    Уникальным идентификатором будем считать совокупность значений number и year

    private final CarIdentifier identifier;

    private String color;
    private boolean actualTechnicalInspection;


    //    Для ускорения поиска запишем хэшкод в отдельное поле. Это допустимо, учитывая,
//    что хэшкод мы считаем лишь по неизменяемым полям и пересчитывать его
//    при каждом вызове hashcode() бессмысленно.
//    Похожий, но чуть более изощренный принцип использует класс String

    public Car(String number, int year, String color, boolean actualTechnicalInspection) {
       this(new CarIdentifier(number,year), color, actualTechnicalInspection);
    }

    public Car(CarIdentifier identifier, String color, boolean actualTechnicalInspection){
        this.identifier = identifier;
        this.color =color;
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    public CarIdentifier getIdentifier() {
        return identifier;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActualTechnicalInspection(){
        return actualTechnicalInspection;
    }

    public void setActualTechnicalInspection(boolean actualTechnicalInspection) {
        this.actualTechnicalInspection = actualTechnicalInspection;
    }

    @Override
    public String toString() {
//        Метод formatted() у String позволяет создать строку с использованием спецификаторов
//        (как в System.out.printf()). До Java 15 вместо него использовался статический метод String.format().
//        Здесь он использован для большей наглядности кода, менее красиво, но с тем же успехом,
//        можно было обойтись обычной конкатенацией строк
        return """
                number: %s
                year: %d
                color: %s
                actualTechnicalInspection: %s
                """.formatted(
                identifier.getNumber(), identifier.getYear(), color,
                actualTechnicalInspection ? "actual" : "not actual");
    }
}