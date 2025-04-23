package com.walking.Lesson_12.counterAggregation.service;

import com.walking.Lesson_12.counterAggregation.model.Counter;

public class CounterService {
    private Counter[] counters;

    public CounterService(Counter... counters){
        this.counters = counters;
    }

    public Counter addCounter(Counter counter) {
        int newArrayLength = counters.length + 1;

        Counter[] newCounters = new Counter[newArrayLength];
        newCounters[newArrayLength - 1] = counter;

        counters = copyArray(counters, newCounters);
        return counters[counters.length - 1];
    }

    public Counter[] getAllCounters(){
        return counters;
    }

    public Counter getCounterByName(String name) {
        for (Counter c : counters){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }

    public Counter increaseCounter(String name, int value){
        Counter counter = getCounterByName(name);

        if (counter == null){
            return null;
        }
        return increaseCounter(counter, value);

    }

    public Counter increaseCounter(Counter counter, int value) {
        counter.setValue(counter.getValue() + value);

        return counter;
    }

    public Counter decreaseCounter(String name, int value){
        Counter counter = getCounterByName(name);

        if (counter == null){
            return null;
        }
        return decreaseCounter(counter, value);

    }

    public Counter decreaseCounter(Counter counter, int value) {
        counter.setValue(counter.getValue() - value);

        return counter;
    }

    public Counter incrementCounter(String name){
        Counter counter = getCounterByName(name);

        if (counter == null){
            return null;
        }
        return incrementCounter(counter);

    }

    public Counter incrementCounter(Counter counter){
        counter.setValue(counter.getValue() + 1);

        return counter;
    }

    public Counter decrementCounter(String name){
        Counter counter = getCounterByName(name);

        if (counter == null){
            return null;
        }
        return decrementCounter(counter);

    }

    public Counter decrementCounter(Counter counter){
        counter.setValue(counter.getValue() + 1);

        return counter;
    }

    public Counter reset(String name){
        Counter counter = getCounterByName(name);

        if (counter == null){
            return null;
        }
        return reset(counter);
    }

    public Counter reset(Counter counter){
        counter.setValue(0);

        return counter;
    }

    private Counter[] copyArray(Counter[] oldArray, Counter[] newArray) {
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }
}
