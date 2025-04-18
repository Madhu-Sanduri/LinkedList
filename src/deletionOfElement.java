public class deletionOfElement {

    private Node head;
    private Node tail;
    private int size;

    public deletionOfElement(){
        size=0;
    }

    public class Node{
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }



    public int deletionAtFirst(){
        int val=head.element;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;

        return val;
    }

    public int deleteValue(int val){
        Node temp=head;
        while (temp.next!=null){
            if(temp.element==val){

            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }


}
