
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

    public void insertFirst(int value) {
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
