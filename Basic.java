package Recursion;

/**
 * Created by kindrahensley on 11/12/16.
 */
public class Basic {

 /*   public static int add (int a, int b){
        return (a+b);

        //recursion - calling method from itself
        //factorial: n! = n x (n-1) x (n-2) x ... x 2 x 1
        // 5 factorial: 5! = 5 x 4 x 3 x 2 x 1


    }

    public static void main (String [] args) {
        int sum = add (23, 10);
    }
 */

 public static int factorial (int n){
     if (n <= 1)
         return 1;
     else return (n * factorial (n-1));
 }

 public static void main (String [] args){
     System.out.println (factorial(5));
     System.out.println (factorial(4));
 }
}