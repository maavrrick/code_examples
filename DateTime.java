package date_time;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by kindrahensley on 11/13/16.
 */
public class DateTime {
    public static void main (String [] args){
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println (date.getTime()); // prints in milliseconds

        System.out.println(1 + date.getMonth());// starts from zero so add 1 to it
        System.out.println(date.getDay()); //will display day in number of day of the week (i.e Sun = 0, Tues = 2)
        System.out.println(1900 + date.getYear()); //will start from 1900 so add 1900 to the code

        SimpleDateFormat sdf = new SimpleDateFormat("E M/dd/yyyy hh:mm a");
        System.out.print(sdf.format(date));


    }
}
