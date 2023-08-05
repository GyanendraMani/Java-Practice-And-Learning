package Arrays;

import java.io.*;
import java.util.Scanner;

public class ArrayThreeDimentionalRun {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int totalTestCases, eachTestCaseValues;
        System.out.print("Tota test cases: ");
        totalTestCases = scanner.nextInt();

        int[][] arrayMain = new int[totalTestCases][];

        for (int i = 0; i < arrayMain.length; i++) {

            System.out.print("Each test case values: ");
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];

            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print("enter values: ");
                arrayMain[i][j] = scanner.nextInt();
            }

        }

        // start excuting output
        for (int i = 0; i < arrayMain.length; i++) {

            int nEvenNumbers = 0, nOddNumbers = 0;

            System.out.println("TestCase " + i + 1 + " with " + arrayMain[i].length + " values:");

            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print(arrayMain[i][j] + " ");

                // even & odd counter updated as
                // eligible number is found
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumbers++;
                } else {
                    nOddNumbers++;
                }
            }
            System.out.println();

            // Prints total numbers of
            // even & odd
            System.out.println(
                    "Total Even numbers: " + nEvenNumbers
                            + ", Total Odd numbers: " + nOddNumbers);

        }

    }
}
