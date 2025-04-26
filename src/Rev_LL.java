import java.util.Stack;

public class Rev_LL {

    private Node head;
    private Node tail;
    private int size=0;

    public Rev_LL(){
        size=0;
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

    public Node lastInsertion(int val){

        Node node = new Node(val);
        if(head==null){
            node.next=head;
            return head=node;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;

        return head;
    }

    public void display(Node head){

        Node temp=head;

        while (temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

   public Node insertFirst(int val){
        Node node = new Node(val);
        Node temp=head;
        if(head==null){
            node.next=head;
            return head=node;
        }
        node.next=head;
        return head=node;
   }

   public Node rev(Node head){
       //Stack<Integer> stack = new Stack<>();
       Node temp=head;
       Node temp1=head;

       Node prev=null;
       Node next=null;

       while (temp!=null){
           next=temp.next;
           temp.next=prev;
           prev=temp;
           temp=next;
       }

       display(prev);

       return prev;


//       while (temp!=null){
//           stack.add(temp.value);
//           temp=temp.next;
//       }
//       temp=head;
//
//       while (temp!=null){
//           temp.value=stack.pop();
//           temp=temp.next;
//       }
//
//
//       return head;

   }


    public static void main(String[] args) {
        Rev_LL demo = new Rev_LL();
        demo.lastInsertion(1);
        demo.lastInsertion(2);
        demo.lastInsertion(3);
        demo.lastInsertion(4);
        demo.display(demo.head);
        demo.rev(demo.head);
//        demo.display(demo.head);
//        demo.insertFirst(1);
//        demo.insertFirst(2);
//        demo.insertFirst(3);
//        demo.insertFirst(4);
//        demo.display();
//        demo.rev(demo.head);
//        demo.display();

    }


}
