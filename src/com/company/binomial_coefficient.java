package com.company;

public class binomial_coefficient {

    /*
    keep in mind that C(n, k) = C(n, n-k)  // we can change r to n-r if r > n-r

    using 3 and 2...
    * */
    public static void main(String[] args) {

        int n = 3, k = 2;
        System.out.println(BinomialCoefficient(n, k) );
        System.out.println(BinomialCoefficient2(n, k) );

    }

   private static int BinomialCoefficient(int n, int k)
    {
        long starttime = System.currentTimeMillis();
        int res = 1;

        // Since C(n, k) = C(n, n-k)
        if ( k > n - k )
            k = n - k;

        // Calculate value of [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]

        // the function to use is
        // n!/(n-k)! * k! will give you the answer
        //translate that function to a fo loop and you have the code below

        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }

        long endtime = System.currentTimeMillis();
        long duration = (endtime - starttime);

        System.out.println("The non-dynamic way took " +  duration + " milliseconds to complete");
        return res;
    }

    // Returns value of Binomial Coefficient C(n, k) using Dynamic programming methods
    static int BinomialCoefficient2(int n, int k) {
        long starttime = System.currentTimeMillis();
        int C[][] = new int[n + 1][k + 1];
        int i, j;

        // Calculate  value of Binomial Coefficient in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= min(i, k); j++) {
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;

                    // Calculate value using previosly stored values
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }

        long endtime = System.currentTimeMillis();
        long duration = (endtime - starttime);

        System.out.println("The dynamic way took " +  duration + " milliseconds to complete");
        return C[n][k];
    }

    static int min(int a, int b)
    {
        return (a<b)? a: b;
    }
}
