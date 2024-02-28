public class LinkedListQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue:");
        queue.print();
        queue.dequeue();
        System.out.println("Queue after dequeue:");
        queue.print();

    }
    static class Queue{
        static class Node{
            int key;
            Node next;
            public Node(int key){
                this.key = key;
                this.next = null;
            }
        }
        Node front;
        Node back;

        public Queue(){
            this.front = this.back = null;
        }

        void enqueue(int key){
            Node temp = new Node(key);
            if(this.back == null){
                this.front = this.back = temp;
                return;
            }
            this.back.next = temp;
            this.back = temp;
        }

        void dequeue(){
            this.front = this.front.next;
        }

        public void print(){
            Node temp = this.front;
            while (temp != null){
                System.out.println(temp.key);
                temp = temp.next;
            }
        }
    }
}
