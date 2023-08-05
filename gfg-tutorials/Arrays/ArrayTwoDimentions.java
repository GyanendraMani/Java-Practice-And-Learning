package Arrays;

public class ArrayTwoDimentions {

    public static void main(String args[]) {
        int rows = 4;
        int columns = 4;

        int[][] arr = new int[rows][columns];

        int value = 1;

        // initializing values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        // accessing values of 2d array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = { { 1, 2 }, { 3, 4 } };
        // System.out.println("arr2" + arr2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("arr2[" + i + "][" + j + "] = " + arr2[i][j]);
            }
        }

    }

}
