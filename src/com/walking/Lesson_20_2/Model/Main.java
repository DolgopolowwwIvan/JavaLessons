package com.walking.Lesson_20_2.Model;

import com.walking.Lesson_20_2.Model.Model.*;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        //soundAll(animals);

    }

//    private static void soundAll(Animal[] animals) {
//        if (animals == null) {
//            throw new ArrayValidationException("Массив животных не может быть null", -1);
//        }
//
//        for (Animal animal : animals) {
//            if (animal == null) {
//                throw new ArrayValidationException("Найден null в массиве животных", -1);
//            } else {
//                sound(animal); // Предполагается, что метод sound() принимает Animal
//            }
//        }
//    }

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
