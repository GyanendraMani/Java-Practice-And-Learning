import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age> 18) {
            System.out.println("You are adult");
        }else {
            System.out.println("Ypu are not a adult");
        }
    }
}
