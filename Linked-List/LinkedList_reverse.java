
// Reverse a Linked List

class Main{
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public void revList() {    
        if( head == null || head.next == null){
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while( curr != null ){
            Node nextNode = curr.next;
            curr.next = prev;

            //update
            prev = curr;
            curr = nextNode;
        }
        head.next = null;
        head = prev;
    }

    public static void printList(Node node) {
        while (node != null){
            System.out.print(node.data+ " -> ");
            node = node.next;
        }
        System.out.print(" NULL ");
    }
    public static void main(String[] args) {
        
        Main list = new Main();
        list.head = new Node(7);
        list.head.next = new Node(8);
        list.head.next.next = new Node(9);
        
        // base - linked list
        System.out.println("Base Linked List--");
        list.printList(head);

        // reversed - linked List
        System.out.println("\nReversed Linked List--");
        list.revList();
        list.printList(head);
    }
}