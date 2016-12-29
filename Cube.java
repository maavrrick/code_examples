package lesson1;

/**
 * Created by kindrahensley on 11/8/16.
 */
public class Cube {
    public static void main (String [] args ){
        ClassConstructor cube1 = new ClassConstructor();

            System.out.println (cube1.getCubeVolume());

        ClassConstructor cube2 = new ClassConstructor(20, 20, 20);

            System.out.println (cube2.getCubeVolume());
    }
}
