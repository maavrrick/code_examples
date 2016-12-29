package try_catch;

/**
 * Created by kindrahensley on 11/12/16.
 *
 * Catching and Handling Exceptions in Java using Try Catch Blocks
 */
public class Demo {

    //exception: an event, which occurs during the execution of a program that disrupts
    //    the normal flow of the programs's instructions.

    public static void main (String [] args){
        int b [] = new int [2];

        try{
            //int a = 100/0; uncomment this line and remove lines 14, 24,25,26  to execute the program

            System.out.println ("Value of b = " + b[3]);
        } catch(ArithmeticException e){

            //find out which exception is thrown by the try catch block
            System.out.println (e);
        } catch (Exception e){
            System.out.println (e);
        }

        //int a = 100/0;
        System.out.println (" ------------");
        //gives error: Exception in thread "main" java.lang.ArithmeticException: / by zero at try_catch.Demo.main (Demo.java:14)
        //this means that there is an error on line 14, an arithmetic error bc 100 cannot divde by zero

    }
}
