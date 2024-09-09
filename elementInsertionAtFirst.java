package LinkedList;

public class elementInsertionAtFirst {
    private Node head;
    private Node tail;
    private int size;

    public elementInsertionAtFirst() {
        this.size = 0;
    }

    private class Node {
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

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        elementInsertionAtFirst obj = new elementInsertionAtFirst();
        obj.insertFirst(5);
        obj.insertFirst(6);
        obj.insertFirst(9);
        obj.insertFirst(16);
        obj.insertFirst(33);
        obj.insertFirst(23);
        obj.display();
    }
}