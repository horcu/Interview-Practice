package com.horcu.apps.interview.google.Euler;

/**
 * Created by ray on 6/12/16.
 */

//A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

//Find the largest palindrome made from the product of two 3-digit numbers.


//limit = 100 - 999

    //THIS IS O(N^2)

public class project_euler_q4 {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        long upper = 999;
        long lower = 100;
        long answer = 0;

//        answer = badSort(upper,lower);
//        long endTime = System.nanoTime();
//
//        long duration = (endTime - startTime);
//        double seconds = (double) duration / 1000000000.0;
//
//
//        System.out.println("bad sort took " + seconds + " seconds to complete");
//        System.out.println("The answer is " + answer);


        startTime = System.nanoTime();
        answer = betterSort(upper,lower);
      long  endTime = System.nanoTime();

     long   duration = (endTime - startTime);
      double  seconds = (double) duration / 1000000000.0;

        System.out.println("better sort took " + seconds + " seconds to complete");
        System.out.println("The answer is " + answer);
    }

    private static long badSort(long upper, long lower){

        long answer=0;
        for (long x = upper; x >= lower; x--) {

            for(long y = lower; y <= upper; y++ ) {

                long prod = x * y;

                long reversed = ReverseNumber(prod);

                if (prod == reversed)
                    answer = prod > answer ? prod : answer;

                if(x==y)
                    break;
            }

        }
        return answer;
    }

    private static long betterSort(long upper, long lower){
        long prod = 0, count = upper;

        while(count >= lower) {
            prod = getProd(upper, count);

            if(IsAPalindrome(prod))
            break;
                count--;
        }

        System.out.println("The biggest palindrome from the product of 3 digit numbers is " + prod);
        return prod;
    }

    private static long getProd(long upper, long lower){
     return lower*upper;
    }

    private static boolean IsAPalindrome(long prod) {
        long rev = ReverseNumber(prod);
        return rev == prod;
    }

    private static long ReverseNumber(long prod) {

        long reversedNum = 0;

        long input_long = prod;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Long.MAX_VALUE || reversedNum < Long.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return  reversedNum;
    }
}
