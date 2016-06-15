package com.horcu.apps.interview.google.Euler;

/**
 * Created by ray on 6/12/16.
 */

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class project_euler_q5 {

    public static void main(String[] args){

        long startTime = System.nanoTime();
        boolean cpIsDivisible;

        int lowRange = 1;
        int highRange = 20;
        int currentPositiveNumber = highRange;
        int answer = 0;

        do {
            cpIsDivisible = true;
            for(int a =lowRange; a <= highRange; a++){
                if(!(currentPositiveNumber % a == 0)) {
                        cpIsDivisible = false;
                   // System.out.println("current number is " + currentPositiveNumber);
                   // System.out.println(currentPositiveNumber + " is not divisible by " +  a);
                        break;

                }
            }

            if(cpIsDivisible)
                answer = currentPositiveNumber;

            currentPositiveNumber ++;
        }
        while (!cpIsDivisible);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        double seconds = (double) duration / 1000000000.0;

        System.out.println("It took " + seconds + " seconds to complete");
        System.out.println(answer +  " is divisible by all numbers in range" + lowRange + " to " +  highRange);
    }
}
