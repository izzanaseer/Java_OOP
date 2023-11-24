class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    
    public void addToFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    public void delete(int target) {
        if (head == null) {
            return;
        }
        if (head.data == target) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != target) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    
    public boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkListOP {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        
        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);

        
        list.addToEnd(4);
        list.addToEnd(5);

        
        System.out.println("Initial List:");
        list.display();

        
        System.out.println("Search for value 2: " + list.search(2));

        
        list.delete(3);
        System.out.println("List after deleting value 3:");
        list.display();
    }
}
