package LeetCode.Templates;

public class Quicksort {

    public static void main(String[] args) {
        int[] array = {1,1,4,2,1,3};

        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end){
        if (end <= start){
            return;
        }

        int pivot = partition(array, start, end);

        //leftSide
        quickSort(array, start, pivot - 1);
        //rightSide
        quickSort(array, pivot + 1, end);

    }

    public static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;
        int temp;

        for (int j = start; j <= end - 1 ; j++) {
            if(array[j] < pivot){
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return  i;
    }
}
