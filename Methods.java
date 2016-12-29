package lesson2;

/**
 * Created by kindrahensley on 11/3/16.
 */
public class Methods {

    //method: code that executes logic, can be called multiple times
    //should only have ONE "main" method: public static void main (String [] args) {}

    public static void main (String [] args) {
        /*myFirstMethod();
        sayHello("John");
        sayHello ("Bob");
        sayHello ("Ann");
        Add (100,203);
        Add (1,2);
        Add (4,4);*/
        int sum = Add (100,203);
        int result = sum * 2;
        System.out.println (result);

    }

    public static void myFirstMethod () {
        //public - tells java that it is accessible anywhere within the class
        //static -
        //void - return type (void since nothing is being returned)
        //myFirstMethod - method name
        // () - argument

        System.out.println ("Hello Kindra");
    }

    public static void sayHello (String name) {
        System.out.println ("Hello " + name);
    }

    public static int Add (int a, int b){ //parameter passing
        //System.out.println (a + b);
        return (a + b);
    }
}
