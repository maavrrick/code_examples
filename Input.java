package lesson3;
import java.util.Scanner;

/**
 * Created by kindrahensley on 11/2/16.
 */
public class Input {
    //getting user input
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print ("Enter your age: ");

        int user_input = scan.nextInt();

        System.out.println ("You are " + user_input + " years old.");

    }

}
