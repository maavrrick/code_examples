
import java.io.File; //contains number of classes to inputs/output to a file; or use java.io.* as a wildcard
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by kindrahensley on 11/13/16.
 */
public class Create {
    public static void main (String [] args) {
        File test = new File ("fileName.txt");

        //check if file name already exists
        if (!test.exists()) {
            try {
                test.createNewFile();

                PrintWriter pw = new PrintWriter(test);
                pw.println("This is my file content");
                pw.println (700);
                pw.close();
                System.out.println ("Done");

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

//file is saved to Desktop > IntelliJ > Java > fileName.txt