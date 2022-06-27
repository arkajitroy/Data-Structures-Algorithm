
// Bubble sort 
// Time Complexity - O(n^2)

import java.util.Scanner;

class Main{
	// bubble sort algorithm
	void bubbleSort(int arr[]){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		ob.bubbleSort(arr);
		ob.printArr(arr);
	}
}