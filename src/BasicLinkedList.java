public class BasicLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public BasicLinkedList(){
        this.size=0;
    }


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

    public Node insertFirst1(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        return head;
    }


    public Node insertLast1(int val){
        Node node = new Node(val);
        Node temp=head;

        if(head==null){
             head=node;
//             node.next=null;
             return head;
        }

        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
//        node.next=null;

        return head;
    }

    public Node insertKposition1(int val,int pos){
        Node node = new Node(val);
        Node temp=head;
        int count=1;
        if(pos==1){
            node.next=head;
            head=node;
            return head;
        }
//        Node prev=null;

        while (temp.next!=null){
            count+=1;
//            prev=temp;
            if(count==pos){
                node.next=temp.next; //3 ki next is 4
                temp.next=node; //2 ki after is 3
            }
            temp=temp.next;
        }
        return head;

    }

    public Node insertElement1(int val,int element){
        Node node = new Node(val);
        Node temp=head;
        if(head==null){
            node.next=head;
            head=node;
            return head;
        }

        while (temp.next!=null){
            if(temp.value==element){
                node.next=temp.next;
                temp.next=node;
                break;
            }
            temp=temp.next;

        }
       return head;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+ "-->");
            temp=temp.next;
        }

        System.out.println("END");
    }

//    public void display(){
//        Node temp=head;
//        while (temp!=null){
//            System.out.println(temp.value+" -->");
//            System.out.print("END");
//        }
//    }

    public static void main(String[] args) {
        BasicLinkedList demo1=new BasicLinkedList();
        demo1.insertElement1(0,1);
        demo1.insertLast1(1);
        demo1.insertLast1(2);
        demo1.insertLast1(3);
        demo1.insertLast1(4);
        demo1.insertLast1(5);
        demo1.display();
        demo1.insertElement1(-154,1);
        demo1.insertElement1(9,3);
//        demo1.insertElement1(10,5);
        demo1.insertElement1(156669,5);
//        demo1.insertKposition1(6,4);
//        demo1.insertKposition(4,4);
//        demo1.insertKposition1(0,1);

//        demo1.insertLast1(1);
//        demo1.insertLast1(2);
//        demo1.insertLast1(3);
//        demo1.insertLast1(4);
//        demo1.insertLast1(5);
        demo1.display();
    }

}
