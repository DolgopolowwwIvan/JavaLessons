package com.walking.Grokking_algorithms.Recursion;

public class recursionClass {

    public static void coutdown(int i){
        System.out.println(i);
        if(i <= 0){
            return;
        }
        else coutdown(i- 1);
    }

    public static void greet(String name){
        System.out.println("hello, " + name + "!");
        greet2(name);
        bye();
    }

    private static void greet2(String name){
        System.out.println("how are you, , " + name + "!");
        bye();
        System.out.println("ok bye!");
    }

    private static void bye(){
        System.out.println("ok bye!");
    }
}
