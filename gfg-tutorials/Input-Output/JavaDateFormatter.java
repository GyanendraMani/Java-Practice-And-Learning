// Java program to demonstrate working of SimpleDateFormat

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDateFormatter {
    public static void main(String args[])
            throws ParseException {
        // Formatting as per given pattern in the argument

        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());
        System.out.println("formatted date : " + str);

        str = "02/18/2000";
        
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);

        System.out.println("Parsed Date : " + date);

    }
}
