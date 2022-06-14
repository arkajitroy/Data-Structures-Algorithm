
// implementing the Infix to postfix operation of Stack
// we will use Stack collection of java

import java.util.Stack;

class Main{

	// setting up the precedence by there priorities
	static int Prec(char c){
		switch(c){
		case '+':
		case '-':
			return 1; 	// lowest prece

		case '*':
		case '/':
			return 2;	// medium prece

		case '^':
			return 3;  	// highest prece
		}
		return -1;
	}

	static String inf_to_post (String eq){
		String result = new String("");		// setting a blank string

		// initializing an empty charecter stack
		Stack <Character> stack = new Stack <> (); 

		for(int i=0; i<eq.length(); i++){
			char c = eq.charAt(i);

			// if alphabet / number is found then add to output
			if(Character.isLetterOrDigit(c)){
				result += c;
			}

			else if( c == '('){
				stack.push(c);
			}

			else if( c == ')'){
				while( !stack.isEmpty() && stack.peek() != '('){
					result += stack.pop();
					stack.pop();
				}
			}

			else{
				while( !stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
					result += stack.pop();
				}
				stack.push(c);
			}
		}

		// pop all the operators from the stack
		while(!stack.isEmpty()){
			if(stack.peek() == '('){
				return "Invalid Expression";
			}
			result += stack.pop();
		}
		return result;
	}

	public static void main(String[] args) {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(exp);

		System.out.println("Result of Infix to Postfix\n"+inf_to_post(exp));

	}
}