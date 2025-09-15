package com.walking.Lesson_52.tearyPt1;

public class HighOrderFunctionExample {
    public static void main(String[] args) {
        Operator operator = new Operator();

        OperatorAction creditCardAction = () -> System.out.println("credit");

        OperatorAction phoneChange = () -> System.out.println("phone");

        operator.call(creditCardAction);
        operator.call(phoneChange);
    }
}
