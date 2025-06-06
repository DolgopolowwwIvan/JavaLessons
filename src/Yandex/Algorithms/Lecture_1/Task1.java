package Yandex.Algorithms.Lecture_1;

import T_bank.Main;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        //Мое решение O(n^2)
//        String[] alf = {"a","a","a","b","f","c","a","v","h","h","h","h","h","c","h","v",};
//
//        int len = alf.length;
//        String mostCommonSymbol = "";
//        int counter = 0;
//
//        for (int i = 0; i < len-1; i++) {
//            String targetValue = alf[i];
//            int counter2 = 0;
//            for (int j = 0; j < len-1; j++) {
//                if(targetValue.equals(alf[j])){
//                    counter2++;
//                }
//            }
//            if (counter2 > counter){
//                counter = counter2;
//                mostCommonSymbol = alf[i];
//            }
//        }
//
//        System.out.println(mostCommonSymbol);
//        System.out.println(counter);

        //Мое решение O(n^2) с множеством
//        String[] alf = {"a","a","a","b","f","c","a","v","h","h","h","h","h","c","h","v",};
//
//        Set<String> stringSet = new HashSet<>(Arrays.asList(alf));
//
//        String[] newStringSet = stringSet.toArray(new String[0]); // Правильное преобразование в массив
//        String mostCommonSymbol = "";
//        int counter = 0;
//
//        for (int i = 0; i < newStringSet.length; i++) {
//            String targetValue = newStringSet[i];
//            int counter2 = 0;
//            for (int j = 0; j < alf.length - 1 ; j++) {
//                if(targetValue.equals(alf[j])){
//                    counter2++;
//                }
//            }
//            if (counter2 > counter){
//                counter = counter2;
//                mostCommonSymbol = newStringSet[i];
//            }
//        }
//
//        System.out.println(mostCommonSymbol);
//        System.out.println(counter);
//        System.out.println(newStringSet);

        String[] alf = {"a","a","a","b","f","c","a","v","h","h","h","h","h","c","h","v",};

        Map<String, Integer> olct = new HashMap<>();
        for (int i = 0; i < alf.length -1 ; i++) {
            olct.put(alf[i], olct.getOrDefault(alf[i], 0) + 1);
        }

        System.out.println(olct);

    }
}
