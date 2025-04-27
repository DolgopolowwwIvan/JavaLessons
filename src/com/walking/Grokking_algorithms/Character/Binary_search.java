package com.walking.Grokking_algorithms.Character;

public class Binary_search {
    public Binary_search(int[] array, int item){
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];

            if (guess == item){
                System.out.println("Значение найдено" + " на индеке: " + array[guess]);
                break;
            }
            if (guess < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            if (low == high){
                System.out.println("Значение не найдено");
            }
        }
    }


}
