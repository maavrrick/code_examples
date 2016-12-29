package lesson5;

/**
 * Created by kindrahensley on 11/11/16.
 */


abstract public class Bank {
    //abstract restricts class to other users
    //superclass

    abstract int getInterestRate ();
    //when a class is abstract, a method should also be abstract
    //cannot have abstract method extending to other classes without calling the value (i.e getInterestRate)

}

