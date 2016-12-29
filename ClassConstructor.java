package lesson1;

/**
 * Created by kindrahensley on 11/8/16.
 */
public class ClassConstructor {
    //calculate the volume of a cube

    int length;
    int bredth;
    int height;

    public int getCubeVolume() {
        return (length * bredth * height);
    }

    ClassConstructor() {
        //cannot return values in contructors
        //System.out.println ("We Are In the Constructor");
            length = 10;
            bredth = 20;
            height = 30;
    }

    ClassConstructor(int l, int b, int h) {
        //cannot return values in contructors
        //System.out.println ("We Are In the Constructor");
        length = l;
        bredth = b;
        height = h;
    }
}
