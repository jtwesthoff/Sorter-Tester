public class LinkedListStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Full stack:");
        stack.print();
        stack.pop();
        System.out.println("Stack after popping:");
        stack.print();

    }
    static class Stack{
        private static class Node{
            int val;
            Node node;
        }
        Node first;
        Stack(){
            this.first=null;
        }

        public void push(int x){
            Node temp = new Node();
            temp.val = x;
            temp.node = first;
            first = temp;
        }

        public void pop(){
            first=(first).node;
        }

        public void print(){
            Node temp = first;
            while (temp != null){
                System.out.println(temp.val);
                temp = temp.node;
            }
        }
    }
}
