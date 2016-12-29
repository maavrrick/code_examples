package lesson3;

/**
 * Created by kindrahensley on 11/2/16.
 */
public class IfElse {
        /*
        if (boolean expression)
           {
              execute if the boolean expression is true
            }
         */
        public static void main (String [] args){
            int x = 10;

            if (x != 20) {
                System.out.println ("True, x == 10");
            }
            else {
                System.out.println ("False, x != 10");
            }
            // Other boolean operators:
            //   == is equal to
            //   > greater than
            //   < less than
            //   != not equal to
            //    >= greater than or equal to
            //    <= less than or equal to

            //Logical Operators:
            // && AND   || OR

            int subject1 = 40;
            int subject2 = 60;

            if ((subject1 >= 35) && (subject2 >= 35)) {
                System.out.println ("PASS");
            }
                else {
                    System.out.println ("FAIL");
            }
            int subject3 = 40;
            int subject4 = 60;

            if ((subject3 >=60) || (subject4 >= 35)) {
                System.out.println ("FAIL");
            }
                else {
                    System.out.println ("PASS");
            }

        }
}
