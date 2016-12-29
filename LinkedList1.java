package arrays;
import java.util.LinkedList;

/**
 * Created by kindrahensley on 11/12/16.
 */
public class LinkedList1 {

    public static void main (String [] args) {

        //linked lists are similar to arrays - contain lists of values, can contain duplicate elements
        //different in terms of performance and usage
        // hash sets contains unique elements, not able to hold duplicate elements

        LinkedList <String> name = new LinkedList<String>();
        name.add ("Patrick");
        name.add ("Mark");
        name.add ("Tom");
        name.add ("John");

        name.addFirst ("Jack");  // adds to the top of the list
        name.addLast ("Kindra"); // adds to the bottom of the list
        name.set (1, "Alan"); // changes the value of the element in said index
        name.remove(2); //removes only the element in that particular index
        name.removeLast (); // removes last name from the list
        name.removeFirst ();  // remove first name from the list
        //name.clear (); //removes all data from the list
        name.add (1, "index 1");

        for (String x : name )
            System.out.println (x);

        System.out.println (name.size()); // get size of the list

    }
}
