package com.walking.Lesson_12.counterAggregation.model;

public class Counter {

    private final String name;
    private final String units;

    private int value;

    public Counter(String name, String units){
        this.name = name;
        this.units = units;
        value = 0;
    }

    public Counter(String name,String units,int value){
        this.name = name;
        this.units = units;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }

}
