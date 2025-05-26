public class ListNode {

    private Node head;
    private Node tail;
    private int size;

    public ListNode(){
        size=0;
    }


    public class Node{

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertLast(int value){
        Node node = new Node(value);

        if(head==null){
            node.next=head;
            head=node;
        }

        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
        node.next=null;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        
        node.next=head;
        head=node;

    }

    public void insertKthPosition(int value,int pos){
        Node node = new Node(value);
        if(pos==1){
            insertFirst(value);
        }
        int count=1;
        Node temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
            if(count==pos-1){
                node.next=temp.next;
                temp.next=node;
            }
        }
    }

    public void display(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        ListNode ll = new ListNode();
        ll.insertLast(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.insertFirst(6);
        ll.display();

        ll.insertKthPosition(10,3);
        ll.display();
        ll.insertKthPosition(-1,1);
        ll.display();
    }



}
