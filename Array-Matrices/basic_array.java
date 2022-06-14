
// Basic introduction of array

class test{

    public static void main(String[] args) {

        int arr[] = { 33, 10, 11, 6, 5, 18 };

        // printing all the elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nLength of the array -> " + arr.length);

        // printing even elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("\nEven Numbers -> " + arr[i]);
            }
        }

        // printing odd elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print("\nOdd Numbers -> " + arr[i]);
            }
        }
    }
}