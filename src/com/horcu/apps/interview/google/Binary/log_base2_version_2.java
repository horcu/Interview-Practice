package com.horcu.apps.interview.google.Binary;

/**
 * Created by hcummings on 6/14/2016.
 */
public class log_base2_version_2
{
    public static double logb( double a, double b )
    {
        return Math.log(a) / Math.log(b);
    }

    public static double log2( double a )
    {
        return logb(a,2);
    }

    public static void main( String[] args )
    {
        System.out.println(log2(235));
    }
}