
// Java program to demonstrate working of DecimalFormat
import java.text.DecimalFormat;

public class JavaFormatter2 {
    public static void main(String args[]) {
        double num = 123.4567;

        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = " + ft.format(num));

        // this will print it upto 2 decimal places
        ft = new DecimalFormat("#.##");
        System.out.println("Formatted with two decimal: num = " + ft.format(num));

        // automatically appends zero to the rightmost of decimal number intead of #, we
        // use digit 0
        ft = new DecimalFormat("#.000000");
        System.out.println("append zeroes to right: num = " + ft.format(num));

        // automatically appends zero to the lefttmost of decimal number intead of #, we
        // use digit 0
        ft = new DecimalFormat("00000.00");
        System.out.println("append zeroes to left: num = " + ft.format(num));

        // formatting money in dollars format

        double income = 23456.789;
        ft = new DecimalFormat("$###,###.#######");
        System.out.println("your Formatted Dream Income : " + ft.format(income));

    }

}
