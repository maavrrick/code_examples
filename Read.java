package file_read;
import java.io.BufferedReader; //reads the data
import java.io.FileReader;     //read the file
import java.io.IOException;   //handles the exceptions thrown by file reader

/**
 * Created by kindrahensley on 11/13/16.
 */
public class Read {
    //how to read a text file using java

    public static void main (String [] args){
        BufferedReader br = null;
        try {

            br = new BufferedReader (new FileReader ("/Users/kindrahensley/Documents/2011.txt"));
            //FIGURE OUT HOW TO CALL A FILE FROM MY MAC THAT IS NOT IN THE SAME PROJECT -> DONE!! :)

            //read it from somewhere
            String line;

            while ((line = br.readLine())!= null){
                System.out.println (line);
            }
        }catch (IOException e){
          } finally {
            try {
                br.close();
            } catch (IOException e){
                e.printStackTrace();
            }
          }
    }
}
