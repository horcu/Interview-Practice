package com.horcu.apps.interview.google.Sorting;

/**
 * Created by ray on 6/13/16.
 */
public class quick_sort2 {


    public static void main(String[] args) {

        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        sort(input);

    }

    private static int array[];
    private static int length;

    public static void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private static void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
            for (int x : array) {
                System.out.print(x);
                System.out.print(" ");

            }
            System.out.println();
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

