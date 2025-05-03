package com.walking.Grokking_algorithms.SelectionSort;

import java.util.Arrays;

import static com.walking.Grokking_algorithms.SelectionSort.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {
                483, 127, 865, 341, 592, 726, 158, 934, 670, 259,
                15, 802, 447, 963, 308, 574, 691, 820, 136, 405,
                739, 284, 951, 627, 193, 840, 362, 518, 776, 245,
                897, 430, 689, 152, 317, 564, 982, 201, 653, 378,
                812, 469, 725, 106, 390, 847, 231, 596, 913, 642,
                74, 529, 864, 207, 351, 680, 925, 142, 793, 326,
                458, 871, 604, 239, 517, 984, 165, 702, 349, 876,
                213, 540, 687, 924, 371, 658, 102, 785, 436, 269,
                753, 420, 189, 647, 312, 578, 921, 134, 860, 295,
                607, 482, 179, 834, 261, 598, 943, 120, 675, 328
        };

        int[] newArray = selectionSort(unsortedArray);

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
