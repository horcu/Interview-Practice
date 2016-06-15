package com.horcu.apps.interview.google.Math;

/**
 * Created by ray on 6/12/16.
 */

//factorial of 5. How many combinations are there

public class factorial {


    public static void main(String[] args) {
        int fact = 6, runningProduct = 0;

        for (int a = fact; a > 0; a--) {
            runningProduct = a== fact? fact: runningProduct*a;
        }
        System.out.println( runningProduct);
    }
}
