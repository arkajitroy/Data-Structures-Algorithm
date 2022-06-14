

import java.util.Scanner;
// import java.util.function.Function;

public class multi_adv {

    static void input_array(int arr[][], int row, int col) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("input for row-" + i + " and col-" + j + " -> ");
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

    }

    static void print_array(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Row Range");
        int row = sc.nextInt();
        System.out.println("Col Range");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        input_array(arr, row, col);

        System.out.println("\nThe Array is\n");
        print_array(arr, row, col);

        sc.close();

    }
}
