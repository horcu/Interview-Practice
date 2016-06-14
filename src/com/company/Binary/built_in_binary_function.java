package com.company.Binary;

/**
 * Created by hcummings on 6/14/2016.
 */
public class built_in_binary_function {

    public static void main(String[] args){

        getBinaryRepresentation(235);
        getBinaryRepresentation2(235);
        getBinaryRepresentation3(235);
    }

    public static void getBinaryRepresentation(int num){
        long starttime = System.nanoTime();
        String bin = Integer.toBinaryString(num);
        double duration = (System.nanoTime() - starttime)/ 1000000000.0;
        System.out.println(bin + " in " + duration + " secs");
    }

    public static void getBinaryRepresentation2(int num){
        long starttime = System.nanoTime();

        //variable to keep the remainder StringBuilder
        StringBuilder sb = new StringBuilder();

        //loop to iterate and calculate until condition is met
        //condition - number > 0
        while(num > 1) {
            // find the mod of the number and append the remainder
            int remainder = num%2;
           sb.append(remainder);
            num = num/2;

            if(num == 1) {
                sb.append(num);
                break;
            }
        }
        double duration = (System.nanoTime() - starttime)/ 1000000000.0;
        System.out.println(sb.reverse() + " in " + duration + " secs ");
    }

    public static void getBinaryRepresentation3(int num){
        long starttime = System.nanoTime();
        String bin = Integer.toString(num,2);
        double duration = (System.nanoTime() - starttime)/ 1000000000.0;
        System.out.println(bin + " in " + duration + " secs");
    }
}
