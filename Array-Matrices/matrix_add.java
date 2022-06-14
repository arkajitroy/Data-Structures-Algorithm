
class matrix_add {

    static void print_arr(int arr[][]) {

        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        int mat_1[][] = { { 1, 3, 4 }, { 5, 7, 8 } };

        int mat_2[][] = { { 3, 5, 7 }, { 5, 4, 2 } };

        int add_mat[][] = new int[2][3];

        // matrices 01

        System.out.print("\nThe Matrices 01\n");
        print_arr(mat_1);

        // matrices 02

        System.out.print("\nThe Matrices 02\n");
        print_arr(mat_2);

        // addition

        System.out.print("\nThe Resultant Matrices\n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                add_mat[i][j] = mat_1[i][j] + mat_2[i][j];
                System.out.print(add_mat[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
