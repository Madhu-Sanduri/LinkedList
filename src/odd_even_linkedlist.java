import java.util.ArrayList;
import java.util.List;

public class odd_even_linkedlist {
    private static List<Integer> list;
    public Node head;
    public Node tail;
    public int size;

    public odd_even_linkedlist(){
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

    public Node solution(Node head){
        list = new ArrayList<>();

        Node temp=head;

        /***********for odd iterations**********************/
        while(temp!=null && temp.next!=null){
            list.add(temp.value);
            temp=temp.next.next;
        }

//        while (temp!=null && temp.next!=null){
//            list.add(temp.value);
//            temp=temp.next.next;
//        }
        if(temp!=null) list.add(temp.value); //when the size is odd it will go through it

        /***********for even iterations**********************/
        temp=head.next;
        while ( temp.next!=null && temp.next.next!=null ){
            list.add(temp.value);
            temp=temp.next.next;
        }
        list.add(temp.value);
//        head=null;
        System.out.println(list);
        return head;
    }

/*----------------------------------------------------------------------------------------------------------------------------------------------*/
    public Node insertLast(int value){
        Node node = new Node(value);
        size++;
        if(head==null){
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

    public void display(){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }

/*----------------------------------------------------------------------------------------------------------------------------------------------*/


    public static void main(String[] args) {
        odd_even_linkedlist demo = new odd_even_linkedlist();
        int []a={1,2,3,4,5,6};
        for(int i:a){
            demo.insertLast(i);
        }
        demo.display();
        System.out.println(demo.size);

        demo.solution(demo.head);
        demo.head=null;
        for(int i:list){
            demo.insertLast(i);
        }
        demo.display();
    }
}
