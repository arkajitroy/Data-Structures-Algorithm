
// Implementing stack using Stack class
import java.util.*;

class Main{

	public static void main(String[] args) {

		Stack <Integer> stack = new Stack <Integer> ();

		//push-operation
		stack.push(5);
		stack.push(10);
		stack.push(15);
		
		System.out.println("\nStack\n"+stack);

		//pop-operation
		Integer elem = stack.pop();
		System.out.println("\nRemoved\n"+elem);
		System.out.println("\nUpdated-Stack\n"+stack);

		//peek-method
		elem = stack.peek();
		System.out.println("\nTop -> "+elem);		

		//push-more-elements
		stack.push(50);
		stack.push(55);
		stack.push(60);
		
		System.out.println("\nUpdated-Stack\n"+stack);

		//checking
		boolean check = stack.empty();
		System.out.println("\nIs the stack empty ? -> "+check);

		//size of the stack
		System.out.println("\nSize of the stack -> "+stack.size());

		System.out.println("\nUpdated-Stack\n"+stack);

		//search-element
		System.out.println("\nSearch for ");
		Scanner sc = new Scanner(System.in);
		int search_elm = sc.nextInt();
		int search = stack.search(search_elm);
		
		if(search == -1){
			System.out.println("Element Not Found !!");
		}else{
			System.out.println("Element Found at pos "+search);
		}

	}
}