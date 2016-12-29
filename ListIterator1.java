package arrays;
import java.util.*;


/**
 * Created by kindrahensley on 11/12/16.
 */
public class ListIterator1 {

    public static void main (String [] args){
        ArrayList <String> names = new ArrayList <String>();
        names.add ("Mark");
        names.add ("Tom");
        names.add ("John");
        names.add ("Jack");
        names.add ("Patrick");

        ListIterator <String> itr = names.listIterator();

        while (itr.hasNext()) // returns boolean (t or f)
            System.out.println (itr.next()); //returns object


        System.out.println ("------------------");

        while(itr.hasPrevious())
            System.out.println(itr.previous());

    }
}
