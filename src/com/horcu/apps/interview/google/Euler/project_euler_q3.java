package com.horcu.apps.interview.google.Euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 6/12/16.
 */

//THIS IS O(N)
public class project_euler_q3 {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        long limit = 600851475143L;
        long smallerNumber = FindSmallestFactor(limit);
        long currentParent = 0;
        long formerParent = 0;
        List<Long> factors = new ArrayList<Long>();

        long  largerNumber = limit / smallerNumber;

            long cnt =0;
            long largestPrime = 0;
        long largestNumber = 0;
            boolean MoreTraversingToDo = true;

            MyTree tree = new MyTree();
            while (MoreTraversingToDo) {

              //  if(tree.tree == null)
             //       tree.tree = new ArrayList<MyNode>();

             //   formerParent = currentParent;

                if(cnt ==0)
                  currentParent = limit;
                else
                  currentParent = largerNumber;

                //find the factors for the larger number
                if(cnt !=0)
                smallerNumber = FindSmallestFactor(currentParent);

                if(smallerNumber <= 0) {
                    factors.add(largerNumber);
                    break;
                }
                else
                largerNumber = currentParent / smallerNumber;

               // tree.tree.add(new MyNode(currentParent, formerParent, smallerNumber, largerNumber));

                factors.add(smallerNumber);

                largestNumber = smallerNumber > largestNumber ? smallerNumber : largestNumber;

                MoreTraversingToDo = largerNumber > smallerNumber;

                if(cnt ==0)
                cnt++;
            }

        long running = 0;

        for(int w=0; w < factors.size(); w++){
            System.out.println(factors.get(w));
           long current = factors.get(w);
            // break;
            if(w==0) {
                running = current;
                System.out.println("beginning...");
            }
            else
            {
                running = (running * factors.get(w-1));
                System.out.println(running + " * " + factors.get(w-1) + " = " +  running);
            }

            if(IsAPrimeNumber(current)) {
                largestPrime = current > largestPrime ? current : largestPrime;
            }
        }

        System.out.println("the largest prime is: " +  largestPrime);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        double seconds = (double)duration / 1000000000.0;

        System.out.println("It took " + seconds + " seconds to complete for value " + limit);
    }

    private static boolean IsAPrimeNumber(long current) {
        //check if n is a multiple of 2
        if (current%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=current;i+=2) {
            if(current%i==0)
                return false;
        }
        return true;
    }


    private static long FindSmallestFactor(long limit) {
        Long result = 0L;

        if(limit%2 ==0)
            return 2;

        for(long x = 3; x < limit; x++) {
            if (limit % x == 0) {
                 result = x;
                break;
            }
        }
        return result;
    }

    private static class MyTree{

        ArrayList<MyNode> tree;
    }
    private static class MyNode{
        private Long value;
        private Long ParentValue;
        private Long left;
        private Long right;

        public MyNode(Long value, Long parentValue, Long left, Long right){
            this.value = value;
            ParentValue = parentValue;
            this.left = left;
            this.right = right;
        }
    }
}

