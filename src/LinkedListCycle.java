public class LinkedListCycle {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListCycle() {
        this.size=0;
    }

    public class Node{

        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(Node next) {
            this.next = next;
        }
    }


    public static boolean solution(Node head){
        Node fast=head;
        Node slow=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) return true;
        }

        return false;
    }


    public static void main(String[] args) {

    }
}
