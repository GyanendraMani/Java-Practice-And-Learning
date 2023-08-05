
// package Input-Output;
import java.lang.*;
import java.util.*;

public class JavaFoematter1 {
    public static void main(String args[]) {
        int x = 100;
        System.out.printf("printing simple integer: x=%d\n", x);

        System.out.printf("This will print upto 2 decimal : PI =%.2f\n", Math.PI);

        float n = 5.2f;
        System.out.printf("Automatically append 0 to rightmost part of decimal: n=%.4f\n", n);

        n = 2324435.3f;
        System.out.printf("rigth margin , occupies a width of 20 charecter: n=%20.4f\n", n);

    }

}
