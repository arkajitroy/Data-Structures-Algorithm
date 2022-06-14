

// Taking Input for the array and printing the elements of array

import java.util.Scanner;

class array_input_print {

    static void input_array(int array[], int size) {
        int n = size;
        for (int i = 0; i < n; i++) {
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();

            sc.close();
        }
    }

    static void print_arr(int arr[]) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the size of the array -> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int arr[] = new int[n];

        System.out.print("Give Input to the array\n");
        input_array(arr, n);

        System.out.print("The New Array \n");
        print_arr(arr);

    }
}