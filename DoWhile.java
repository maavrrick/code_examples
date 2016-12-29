package loops;

/**
 * Created by kindrahensley on 11/3/16.
 */
public class DoWhile {

    public static void main (String [] args) {

        /* difference between while and do-while loop is that a while loop evaluates condition then executes
        // the do-while loop "do" first - executes, then evaluates the condition

        while loop:
                int a = 0;
                    while (a < 10)
                    {
                         System.out.println (a);
                        a++;
                    }
         */
        int e = 0;
        do {
            System.out.println (e);
            e++;

        } while (e <=-1);
    }
}
