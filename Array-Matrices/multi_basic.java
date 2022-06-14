
import java.util.Arrays;

class test {

    public static void main(String[] args) {

        // static 2D Array
        int arr[][] = { { 45, 20, 10 }, { 46, 10, 46 }, { 78, 10, 15 }, { 54, 78, 99 } };

        int row = arr.length;
        int col = arr[0].length;

        // printing the 3d array

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        // Array to string - foreach loop

        System.out.println("\nString Format");

        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }

}
