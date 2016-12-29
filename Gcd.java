package Interview;

import java.util.*;
/**
 * Created by kindrahensley on 11/13/16.
 */


public class Gcd
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the First number : ");
            int n1=sc.nextInt();

            System.out.print("Enter the Second number : ");
            int n2=sc.nextInt();


        while(n1 != n2)
        {
            if(n1 > n2)
                n1 = n1-n2;
            else
                n2 = n2-n1;
        }
        System.out.print("GCD = " + n1);
    }
}

/* Alternatively, using no user input:
package com.tutorialspoint;

import java.math.*;

public class BigIntegerDemo {

public static void main(String[] args) {

        // create 3 BigInteger objects
	BigInteger bi1, bi2, bi3;

	// assign values to bi1, bi2
	bi1 = new BigInteger("18");
	bi2 = new BigInteger("24");

	// assign gcd of bi1, bi2 to bi3
	bi3 = bi1.gcd(bi2);

	String str = "GCD of " + bi1 + " and " + bi2 + " is " +bi3;

	// print bi3 value
	System.out.println( str );
    }
}
 */