
// Implementing the stack-data structure using array

import java.util.Scanner;
class Stack{
	private int arr[];
	private int top;
	private int capacity;

	// creating a stack
	Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
		System.out.println("New Stack created !!");
	}

	//adding elements -- push
	public void push_st(int x){
		if(isFull()){
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		System.out.println("Inserting -> "+x);
		top++;
		arr[top] = x;
	}

	//removing element -- pop
	public int pop_st(){
		if(isEmpty()){
			System.out.println("Stack Empty");
			System.exit(1);
		}
		top--;
		return arr[top];
	}

	//size of the stack
	public int size(){
		return top + 1;
	}

	//space left in stack
	public int spaceLeft(){
		return (capacity - top);
	}

	//empty stack check
	public Boolean isEmpty(){
		return top == - 1;
	}

	//full stack check
	public Boolean isFull(){
		return top == capacity - 1;
	}

	//print the stack
	public void printStack(){
		System.out.println("Size of the stack --> "+size());
		System.out.println("Space Left on stack --> "+spaceLeft());
		
		// running a reverse loop to give a better overview
		for(int i=top; i>=0; i--){
			System.out.println(arr[i]);
		}
	}

}

class Main{
	public static void main(String[] args) {
		
		System.out.println("Enter the size --> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Stack stack = new Stack(n);

		System.out.println("\n--Inserting Elements -- \n");

		stack.push_st(1);
		stack.push_st(2);
		stack.push_st(3);
		
		System.out.println("\n--Initial Stack -- \n");
		stack.printStack();

		stack.pop_st();
		System.out.println("\n--After poping -- \n");
		stack.printStack();

		stack.push_st(5);
		stack.push_st(7);
		System.out.println("\n--After updating -- \n");
		stack.printStack();

	}
}