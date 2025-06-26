package com.walking.Lesson_29;




//Реализуйте обобщенный тип, хранящий параметризованное поле.
// Также в классе Main реализуйте параметризованый метод, принимает первым параметром объект вашего дженерика,
// вторым — объект типа, которым параметризован объект первого параметра.
// Метод должен возвращать значение поля дженерика,
// если оно != null, в противном случае — возвращать второй параметр.
public class Main {
    public static void main(String[] args) {
        Generic<String> generic1 = new Generic<>("Jopa");
        System.out.println(getOrDefoult(generic1, "default"));

    }

    private static <T> T getOrDefoult(Generic<T> obj, T defaultValue){
        T value = obj.getValue();
        if (value != null){
            return value;
        }else {return defaultValue;}
    }

}



