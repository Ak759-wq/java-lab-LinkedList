
import java.util.*;

class Node {
    int val;
    Node next;

    Node() {
        this.val = 0;
        this.next = null;
    }

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question-2{

    int count(Node head) {
        int c = 0;
        Node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }

        return c;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        int n = 10;

        Node tail = head;

        System.out.println("Count: " + new Question2().count(head));
    }
}
