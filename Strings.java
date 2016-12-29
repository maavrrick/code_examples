package lesson2;

/**
 * Created by kindrahensley on 11/3/16.
 */
public class Strings {

    public static void main (String [] args){

        String myString = "Hello Kindra, you are beautiful.";
        int myStringLength = myString.length();
        String myStringinLowerCase = myString.toLowerCase();
        String myStringUpper = myString.toUpperCase();


        System.out.println (myString);
        System.out.println (myStringLength);
        System.out.println (myStringinLowerCase);
        System.out.println (myStringUpper);
        System.out.println (myString.replace('e', '3'));
    }
}
