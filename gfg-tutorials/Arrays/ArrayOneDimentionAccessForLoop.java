package Arrays;

public class ArrayOneDimentionAccessForLoop {
    public static void main(String args[]) {
        int[] arr;
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the all elements of the array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }

    }
}
