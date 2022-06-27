
// Selection sort 
// Time Complexity - O(n^2)

import java.util.Scanner;

class Main{
	// Selection Sort algorithm
	void selectionSort(int arr[]){
		for(int i=0; i<arr.length-1; i++){
			int smallest = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[smallest] > arr[j]){
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}
	// printing the array
	void printArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}
	//taking input of the array
	void arrayInput(int arr[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			System.out.print("Element of array["+i+"] -> ");
			arr[i] = sc.nextInt();
		}
	}

	// driver-code
	public static void main(String[] args) {
		Main ob = new Main();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements -> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		ob.arrayInput(arr);

		System.out.println("\n\n---Unsorted-Array---");
		ob.printArr(arr);
		System.out.println("\n\n---Sorted-Array---");
		ob.selectionSort(arr);
		ob.printArr(arr);
	}
}