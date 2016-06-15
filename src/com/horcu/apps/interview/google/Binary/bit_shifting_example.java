package com.horcu.apps.interview.google.Binary;

/**
 * Created by hcummings on 6/14/2016.
 */
public class bit_shifting_example {

    public static void main(String [] args){

        System.out.println(findNumberOfBits(2,30));
    }

    public static int findNumberOfBits(int x, int y)
    {
        int bitCount = 0;

        int z = x ^ y;  //Binary x and y

        while (z != 0)
        {
            //increment count if last binary digit is a 1:
            bitCount += z & 1;
            z = z >> 1;  //shift Z by 1 bit to the right
        }

        return bitCount;
    }
}
