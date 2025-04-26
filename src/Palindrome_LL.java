import java.util.Stack;

public class Palindrome_LL {

    public Node head;
    public Node tail;
    public int size;

    public Palindrome_LL(){
        size=0;
    }



    public class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }

    public Node insertLast(int val){
        Node node = new Node(val);
        if (head==null){
            node.next=head;
            head=node;

            return head;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;

        return head;
    }

    public boolean palindrome_stack(Node head){
        Stack<Integer> stack=new Stack<>();
        Node temp=head;

        while (temp!=null){
            stack.push(temp.value);
            temp=temp.next;
        }

        temp=head;

        while (temp!=null){
            if(temp.value!=stack.pop()) return false;
            temp=temp.next;
        }
        return true;
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
        Palindrome_LL demo = new Palindrome_LL();
        demo.insertLast(1);
        demo.insertLast(2);
        demo.insertLast(1);
        demo.insertLast(2);
        demo.insertLast(3);
        demo.insertLast(4);
//        demo.insertLast(5);
        demo.insertLast(4);
        demo.insertLast(4);
        demo.insertLast(3);
        demo.insertLast(2);
        demo.insertLast(1);
        demo.display();
        System.out.println( demo.palindrome_stack(demo.head));
    }
}
