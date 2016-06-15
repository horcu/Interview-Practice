package com.horcu.apps.interview.google.Sorting;

/**
 * Created by hcummings on 6/13/2016.
 */
public class quick_sort {
    private int array[];
    private int length;

    public static void main(String a[]){

        quick_sort sorter = new quick_sort();
        int[] input = {24,2,45,23,31,86,20,56,12,34,45,56,67,45,23,64,81,36,74,62}; //15,75,2,56,99,88,34,53,12

        long startTime = System.currentTimeMillis();
        sorter.sort(input);
        long endTime = System.currentTimeMillis();
        long duration = ((endTime -startTime));

        System.out.println("it took " + duration + " millis to complete returnng the following:");
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
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
        }
        //print out the results per iteration so that
        // it can be viewed

        StringBuilder sb = new StringBuilder();
        for(int ix:array){
            sb.append(ix);
            sb.append(" ");
        }

        System.out.print(sb);
        System.out.println();

        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


  //  - See more at: http://www.java2novice.com/java-sorting-algorithms/quick-sort/#sthash.8uJxC4gT.dpuf
}
