
// Problem 02 - Reversing a stack

import java.util.*;
class Main {

    public static void reverse(Stack <Integer> stack){
        if(stack.empty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushBottom(top, stack);
    }

    public static void pushBottom(int data, Stack <Integer> stack){

        // if the stack found empty then it will execute the push
        if(stack.empty()){
            stack.push(data);
            return;
        }
        // otherwise it will implement the code by recursive call
        int top = stack.pop();
        pushBottom(data, stack);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> stack = new Stack <Integer> ();
        stack.push(10);
        stack.push(25);
        stack.push(37);
        
        System.out.println("\nOverview of the stack\n"+stack);
        
        reverse(stack);
        System.out.println("\nReversed-stack\n"+stack);

    }
}