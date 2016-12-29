package try_catch;

/**
 * Created by kindrahensley on 11/13/16.
 */
public class Finally {

    // The finally block always executes when the try block exits.
    // This ensures that the finally block is executed even if an unexpected error occurs.


    public static int retInt() {
        int a = 100;

        try {
            return a;
            //System.exit (1); //system.exit exits from program; this is the only situation where finally block is not called
        } catch (ArithmeticException e) {
            System.out.println ("Catch block is called");
            System.out.println (e); // prints "java.lang.ArithmeticException: / zero
            return a;
        } finally {
            System.out.println ("Finally block is called");
        }
    }

    public static void main (String []args ){
        System.out.println (retInt());
    }
        /*try {
            int a = 100/0;
            System.exit (1); //system.exit exits from program; this is the only situation where finally block is not called
        } catch (ArithmeticException e) {
            System.out.println ("Catch block is called");
            System.out.println (e); // prints "java.lang.ArithmeticException: / zero
        } finally {
            System.out.println ("Finally block is called");
        }
    }*/
}
