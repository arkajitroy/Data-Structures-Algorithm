
class test {

    public static void main(String[] args) {

        int arr[][] = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[2];

        int count = 0;

        // just taking input from 0-1 as the array elements

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        // printing the jagged array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
