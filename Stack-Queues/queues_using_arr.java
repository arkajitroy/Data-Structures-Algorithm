
// Queues Data structure -- (Follows - First in First out - FIFO)
// >> implementing the queues using the array

class Main{

    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        // creating a queue -- using constructor
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        // checking wheather the queue is empty or not
        public static boolean isEmpty(){
            return rear == -1;
        }

        //Enqueue -- adding the elements
        public static void enq(int data){
            // checking if the queue is full or not
            if(rear == size - 1){
                System.out.println("The Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue -- deleting the elements
        public static int deq(){
            // checking if the queue is empty
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;           
        }

        // Peek - showing the front
        public static int peek(){
            // checking if the queue is empty
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            //or else
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enq(5);
        q.enq(10);
        q.enq(15);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.deq();
        }
    }
}