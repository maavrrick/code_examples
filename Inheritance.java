package lesson4;

/**
 * Created by kindrahensley on 11/9/16.
 */
public class Inheritance {
    public static void main (String [] args){
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.set_values(10, 10); // values are pulled from the Polygon class
        tri.set_values(10, 10);

        System.out.println ("The area of the Rectangle is " + rec.area());
        System.out.println ("The area of the Triangle is " + tri.area());
    }
}
