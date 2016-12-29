package arrays;
import java.util.ArrayList;


/**
 * Created by kindrahensley on 11/12/16.
 */
public class ArrayList1 {

    public static void main (String [] args) {
        int simple_array [] = new int [5];  // or {1,2,3,4,5}

        ArrayList <Integer> myList = new ArrayList <Integer>(5);
        myList.add (1);
        myList.add (5);
        myList.add (3);
        myList.add (25);
        myList.add (5339);

        for (Integer x : myList)
            System.out.println (x);
            System.out.println ("The size of my array list has " + myList.size() + " elements");

        //--------------------------------

        //set values in array list - changes element at index 0 (1) to 100 (new element defined below
            myList.set (0, 100);
        //to remove an array
            myList.remove (2);

        for (Integer x : myList)
            System.out.println (x);
            System.out.println ("The size of my array list has " + myList.size() + " elements");

        //--------------------------------

        // to clear all elements of the array use.clear
            myList.clear();
        for (Integer x : myList)
            System.out.println (x);
            System.out.println ("The size of my array list has " + myList.size() + " elements");

    }
}
