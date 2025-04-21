
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

    public Node insertFirst(int value) {
        // Step 1: Create a new node with the given value
        Node node = new Node(value);

        // Step 2: Set the new node's next pointer to point to the current head
        // This links the new node to the beginning of the list
        node.next = head;

        // Step 3: Update the head to be the new node
        // Now the new node becomes the first element in the list
        head = node;

        // Step 4: If the list was empty before insertion (tail is null),
        // then the new node is both head and tail
        if (tail == null) {
            tail = head;
        }

        // Step 5: Increase the size of the linked list
        size += 1;

        return head;
    }


    public Node insertLast(int val){
        Node node = new Node(val);
        Node temp=head;

        if(head==null){
            head=node;
            node.next=null;
            return head;
        }

        while (temp.next!=null){
            temp=temp.next;

        }

        temp.next=node;
        node.next=null;


        return head;
    }

    public Node insertKposition(int val,int k){
        Node node = new Node(val);
        Node temp=head;

        if(k==1) {
            node.next=head;
            head=node;
            return head;
        }
        int count=1;
        while (temp.next!=null){
            count+=1;
            if(count==k){
                node.next=temp.next;
                temp.next=node;
            }
            temp=temp.next;
        }
        if(k>count) {
            System.out.println("Please enter a valid position");
            return null;
        }
        return head;
    }

    public Node insertAfterElement(int val,int element){
        Node node = new Node(val);
        Node temp=head;
        Node prev=null;
        if (head.value==element){
            Node temp1=head.next.next;
            head.next=node;
            node.next=temp1;
            return head;
        }

        while (temp.next!=null){
            prev=temp;
            if(temp.value==element){
                node.next=temp.next;
                prev.next=node;
            }
            temp=temp.next;
        }
        return head;
    }

    /******************************-----------Deletion Methods ---------******************************************************************************/



    public int deletionAtFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;

        return val;
    }

    public Node deleteElement(int k){
        Node temp=head;
        Node prev=null;
        int count=1;

        if(k==1){
            return head=head.next;
        }


        while (temp.next!=null){
            count+=1;
            prev=temp;
            if(count==k){
                prev.next=prev.next.next;
            }
            temp=temp.next;
        }
        return head;
    }

    public Node deleteTail(){
        Node temp=head;
        if(temp == null || temp.next==null) return null;
        while (temp.next.next!=null){
            temp=temp.next;
        }

        temp.next=null;

        return head;
    }


    public Node deleteValue(int value){
        Node temp=head;
        Node prev=null;
        if(head.value==value){
            return head=head.next;
        }

        while (temp.next!=null){
            prev=temp;
            if(temp.next.value==value){
                prev.next=prev.next.next;
            }
            temp=temp.next;
        }
        return head;
    }


    /******************************-----------Display Method ---------******************************************************************************/


    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+ "-->");
            temp=temp.next;
        }

        System.out.println("END");
    }






    public static void main(String[] args) {
        elementInsertionAtFirst demo=new elementInsertionAtFirst();
//        demo.insertLast(788);
//
//        demo.display();
//        demo.insertKposition(236,1);
//        demo.display();
//        demo.insertFirst(10);
//        demo.insertKposition(11111,1);
//        demo.display();
        demo.insertFirst(11);
        demo.insertFirst(14);
        demo.insertFirst(17);
        demo.insertFirst(18);
        demo.insertFirst(22);
        demo.insertAfterElement(55,14);
        demo.insertAfterElement(59,22);
        demo.display();
        demo.insertFirst(12);
        demo.insertKposition(11590,25);
        demo.insertFirst(19);
        demo.insertFirst(21);
        demo.display();
        demo.insertKposition(145,3);
        demo.insertKposition(1,1);
        demo.display();
//        demo.insertKposition(1,)
//        demo.insertLast(66);
//        demo.display();
//
//        demo.deleteValue(18);
//        demo.display();

       // System.out.println(demo.deletionAtFirst());
//        System.out.println(demo.deleteTail());
//        demo.display();
//        System.out.println(demo.deleteElement(1));
//        demo.display();
//        System.out.println(demo.deleteElement(2));
//        demo.display();
    }

}
