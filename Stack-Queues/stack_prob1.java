
// Problem 01 - Push the element at the bottom of the stack
// implement this problem -- using recurssion

import java.util.*;
class Main{

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
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("\nOverview of the stack\n"+stack);

        pushBottom(99, stack);      // inserting 99 - at first
        pushBottom(100, stack);     // inserting 100 - second

        System.out.println("\nUpdated-Stack\n"+stack);
        stack.peek();
        System.out.println("\nTop of the stack -> "+stack.peek());

    }
}