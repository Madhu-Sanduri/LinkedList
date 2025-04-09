
public class elementInsertionAtFirst {

    private Node head;
    private Node tail;
    private int size;

    private class Node{
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

    public elementInsertionAtFirst(){
        size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;

    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+ "-->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        elementInsertionAtFirst demo=new elementInsertionAtFirst();
        demo.insertFirst(10);
        demo.insertFirst(11);
        demo.insertFirst(14);
        demo.insertFirst(17);
        demo.insertFirst(18);

        demo.display();
    }

}
