package lesson6;

/**
 * Created by kindrahensley on 11/12/16.
 */
public class BankABC implements Bank2{
    public int getInterestRate2() {
        return 5;
    }

    //cannot extend interface, must implement

 /*
      class to class - use extends
      interface to class - use implements
      interface to interface - use extends
  */
}
