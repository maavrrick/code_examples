package lesson1;

/**
 * Created by kindrahensley on 11/9/16.
 */
public class AccessModifiers {

    /*
        Access Levels:  public,      protected,                    no modifier,      private
              visible: everywhere    class, package, subclass      class, package    class
     */

    private String name;
    private int age;

    //you don't the variable to be affected by any other user, so set to private or protected


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
