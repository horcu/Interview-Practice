package com.company;

/**
 * Created by hcummings on 6/13/2016.
 */
public class fibonacci {

    public static void main(String[] args){
         fib(10);
         fib2(10);
         fib3(10);
         fib4(10);
    }

    //
    private static int[] fib(int number) {
        int[] fibs = new int[number + 1];
       // fibs[0] = 1; fibs[1] =1; fibs[2] = 2;

        for(int x = 1; x <= number; x++ ){
            if(x ==1 || x ==2)
                fibs[x] = 1;
            else
          fibs[x]= fibs[x-1] + fibs[x -2];

            System.out.println(fibs[x]);
        }
        return fibs;
    }

    private static int fib2(int number) {

        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.println( fibonacci);
        }
        return fibonacci; //Fibonacci number
    }

    private static int fib3(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        int fibo = 1,  fib1 = 1, fib2=1;

        for(int x=3; x <= number; x++) {

            //(n-1) + (n-2)
            fibo = fib1 + fib2;

            fib1 = fib2;
            fib2 = fibo;

            System.out.println(fibo);
        }
        return fibo;
    }

    public static int fib4(int number) {
        for (int n =0, m =1; n + m <= number; m += n, n = m - n)
            System.out.println(n + m);

        return 0;
    }
}
