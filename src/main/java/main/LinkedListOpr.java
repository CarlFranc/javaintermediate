package main;

public class LinkedListOpr {
    private Node head;
    private Node tail;

    public void add(int newValue) {
        if (head == null)
            head = createNode(newValue, null);

        tail = head;
        while(tail.getNext() != null)
            tail = tail.getNext();

        tail.setNext(createNode(newValue, null));
    }

    public void print() {
        tail = head;
        while(tail.getNext() != null) {
            tail = tail.getNext();
            System.out.print(tail.getValue() + "\t");
        }
    }

    public void printNthElement(int num) {
        int counter = 0;
        tail = head;
        while (tail.getNext() != null) {
            if (tail.getValue() == num) {
                System.out.println("\n" + num + " is at position: " + counter );
                return;
            }
            tail = tail.getNext();
            counter++;
        }
        System.out.println("\nValue not found!");
    }

    public Node createNode(int value, Node next) {
        return new Node(value, next);
    }
}
