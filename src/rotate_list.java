
public class rotate_list {

    private Node head;
    private Node tail;
    private int size;

    public rotate_list(){
        this.size=0;
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



}
