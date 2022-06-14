
// Implementing the Linked List using java collection

import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        
        LinkedList <String> list = new LinkedList<>();
        
        // adding the value in the linked list
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("this");
        list.addFirst("This");
        System.out.println(list);

        //size of the list
        System.out.println("Size of the List "+list.size());

        // Printing the whole list
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.print(" NULL ");

        // remove from the list
        list.removeFirst();
        System.out.println("\n"+list);

        list.removeLast();
        System.out.println("\n"+list);

    }
}