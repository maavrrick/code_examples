package lesson3;

/**
 * Created by kindrahensley on 11/2/16.
 */
public class Switch {
    public static void main (String [] args) {
        int score = 70;
        /*

        SWITCH STATEMENTS can be used instead of if, else statements.
        if ((score >= 35)) {
            System.out.println ("The condition is true");
        }
            else {
                System.out.println ("The condition is false");
        }
        */
         switch (score) {
             case 100:
             case 90:
             case 80:
                 System.out.println ("Very good!");
                 break;

             case 70:
             case 60:
                 System.out.println ("Not Bad!");
                 break;

             case 30:
                 System.out.println ("Take another shot at it!");
                 break;

             default:
                 System.out.println ("Undefined");
                 break;

         }

    }
}
