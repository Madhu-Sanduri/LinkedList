public class Middle_Of_LL {
    private Node head;
    private Node tail;
    private int size;

    public Middle_Of_LL(){
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

    public Node insertAtLast(int val){
        Node node=new Node(val);
        Node temp=head;
        if(head==null){
            return head=node;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        return head;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public static int size(Node head){
        Node temp=head;
        int size=0;
        while (temp!=null){
            size++;
            temp=temp.next;
        }

        return size;
    }

    public int solution(Node head,int k){

        int pos=size((head)/2)+1;

        int count=0;
        Node temp=head;
        while (temp.next!=null){
            count++;
            if(count==pos){
                return temp.value;
            }
            temp=temp.next;
        }
        return -1;
    }



    public static void main(String[] args) {
        Middle_Of_LL demo2=new Middle_Of_LL();
        demo2.insertAtLast(1);
        demo2.insertAtLast(2);
        demo2.insertAtLast(3);
        demo2.insertAtLast(4);
        demo2.insertAtLast(5);
        demo2.insertAtLast(6);
        demo2.display();
        System.out.println(size(demo2.head));
        System.out.println(demo2.solution(demo2.head, size(demo2.head)));
//        demo2.insertAtLast(1);
//        demo2.insertAtLast(2);
//        demo2.insertAtLast(3);
//        demo2.insertAtLast(4);

//        demo2.solution(demo2.head, 4);
    }
}
