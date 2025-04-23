package com.walking.Lesson_21_2.Model;

import com.walking.Lesson_21_2.Model.Model.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    //    Используя поле класса Animal, определяем, какой настоящий класс обрабатываемого объекта
    private static void sound(Animal animal) throws UnknownAnimalException {
        if(animal instanceof Cat){
            ((Cat) animal).meow();
        }
        else if(animal instanceof Dog){
            ((Dog) animal).woof();
        }
        else if(animal instanceof Cow) {
            ((Cow) animal).moo();
        }
        else{
            throw new UnknownAnimalException("Такого животного не существует!!!");
        }

    }
}
