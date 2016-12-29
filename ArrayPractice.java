package arrays;

/**
 * Created by kindrahensley on 11/3/16.
 */
public class ArrayPractice {
    //Array: same as a variable, but can store multiple variables at a time, can only store same data types
    //index of arrays start at zero (0)
    // values within the curly braces of the array are called elements

    public static void main (String [] args){
        int [] myintarray = {100,34,21,433,6,115};
        /*
        There are different ways to declare an Array:
            int myintarray2 [] = {7,8,9,3,2};
            int [] myIntArray = new int [3];
            int [] myIntArray = {1,2,3};
            int [] myIntArray = new int [] {1,2,3};
        */

        System.out.println (myintarray [4]); // calls the position

        System.out.println ( "-------------------------" );

        //incorporate a while loop to print all the elements in the array

        int index = 0;
        while (index < 6) {
            System.out.println (myintarray [index]);
            index++;
        }

    }
}
