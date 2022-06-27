
// Merge sort 
// Time Complexity - O(n log n)

import java.util.Scanner;

class Main{

	// Merging function -- Conquering 
	void merge(int arr[], int si, int mid, int ei){
		int merged[] = new int [ei-si+1];
		
		int id1 = si;
		int id2 = mid+1;
		int x = 0;

		while(id1 <= mid && id2 <= ei){
			if(arr[id1] <= arr[id2]){
				merged[x++] = arr[id1++];
			} else {
				merged[x++] = arr[id2++];
			}
		}

		while(id1 <= mid){
			merged[x++] = arr[id1++];
		}

		while(id2 <= ei){
			merged[x++] = arr[id2++];
		}

		for(int i=0, j=si; i<merged.length; i++ ,j++){
			arr[j] = merged[i];
		}
	}
	
	// Merge Sort algorithm -- Divide
	void mergeSort(int arr[], int si, int ei){
		if(si >= ei){
			return;
		}

		int mid = si+(ei-si)/2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid+1, ei);
		merge(arr, si, mid, ei);
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
		ob.mergeSort(arr, 0, arr.length-1);
		ob.printArr(arr);
	}
}