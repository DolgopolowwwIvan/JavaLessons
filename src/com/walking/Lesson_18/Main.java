package com.walking.Lesson_18;

import com.walking.Lesson_18.Model.Animal;
import com.walking.Lesson_18.Model.Cat;
import com.walking.Lesson_18.Model.Cow;
import com.walking.Lesson_18.Model.Dog;

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
    private static void sound(Animal animal) {
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
            System.out.println("Unknown animal!");
        }

    }
}
