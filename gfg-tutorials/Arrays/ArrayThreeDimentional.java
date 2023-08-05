package Arrays;

public class ArrayThreeDimentional {
    public static void main(String args[]) {
        int[][][] arr = new int[10][20][30];
        arr[0][0][0] = 1;
        System.out.println("arr[0][0][0] = " + arr[0][0][0]);

        int[][][] arr2 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } }, { { 9, 10 }, { 11, 12 } } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println("arr2[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + arr2[i][j][z]);
                }

            }

        }

    }

}
