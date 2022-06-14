// Implementation of the Linked List -- from scratch
// Performing the operations -- insert / del / show

// Insert -- Insert at beginning and end
// Delete -- Delete at beginning and end
// show -- Print the linked list

class Main{

    // creating a node class
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = next;
            size++;
        }
    }

    Node head;
    private int size;

    Main(){
        this.size = 0;
    }

    // adding the node -- first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);  // creating a new node that will get inserted
        if (head == null){
            head = newNode;
            return;
        }
        // assigning the positions
        newNode.next = head;
        head = newNode;
        System.out.println(data+ " is added <<");
    }

    public void addLast(String data) {
        Node newNode = new Node(data);  // creating a new node that will get inserted
        if (head == null){
            head = newNode;
            return;
        }
        
        // Traversing the list
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        System.out.println(data+ " is added <<");
    }

    // deleting the elements -- first and last

    public void delFirst() {
        if(head == null){
            System.out.println("--The list is empty--");
            return;
        }
        size--;
        // or else we will do
        head = head.next;
    }

    public void delLast() {
        if(head == null){
            System.out.println("--The list is empty--");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    // size of the linked list
    public int getSize(){
        return size;
    }

    // printing the list
    public void printList() {
        if( head == null){
            System.out.println("List is empty !!");
            return;
        }

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+ " -> ");
            curr = curr.next;
        }
        System.out.print("NULL\n\n");
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.addFirst("First");
        list.addFirst("Second");
        System.out.println("Size of the List -> "+list.getSize());
        list.printList();

        list.addLast("Third");
        System.out.println("Size of the List -> "+list.getSize());
        list.printList();

        list.addLast("Fourth");
        System.out.println("Size of the List -> "+list.getSize());
        list.printList();

        list.delFirst();
        System.out.println("Size of the List -> "+list.getSize());
        list.printList();

        list.delLast();
        System.out.println("Size of the List -> "+list.getSize());
        list.printList();
    }
}