package lesson1;

/**
 * Created by kindrahensley on 11/1/16.
 */
public class HelloWorld {
    public static void main(String [] args) {
        //

        //System.out.println ("Hello World"); //print hello world

        Student kennedi = new Student();
           // kennedi is an object/instance

        kennedi.setId(1); // this value type is discouraged bc others can modify these values - use getters and setters
        kennedi.setName("Kennedi");
        kennedi.setAge(29);

        Student edan = new Student();

        edan.setId(2);
        edan.setName("Edan");
        edan.setAge(27);

        System.out.println (kennedi.getName () + " is " + kennedi.getAge() + " months old!");
        System.out.println (edan.getName() + " is " + edan.getAge() + " months old!");
    }
}
