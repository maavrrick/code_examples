package loops;

/**
 * Created by kindrahensley on 11/3/16.
 */
public class For {
    public static void main (String [] args){
        //for loop is similar to while or do-while loop - until condition is met

        int [] myintarray2 = {100,200,400,600,900};

        //for ( initialization, expression, increment)
        for (int i = 0 ; i < 5; i++)
        {
            System.out.println (myintarray2[i]);
        }
         /*   alternative method to using for loop

        for (int element : myintarray2)
        {
            System.out.println (element);
        }*/
    }
}
