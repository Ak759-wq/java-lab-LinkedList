
import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Create linked list
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int x = sc.nextInt();

        // Delete occurrences from head
        while (head != null && head.val == x) {
            head = head.next;
        }

        // Delete occurrences from remaining list
        Node temp = head;

        while (temp != null && temp.next != null) {

            if (temp.next.val == x) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        // Display linked list
        if (head == null) {
            System.out.println("Empty");
        } else {

            temp = head;

            while (temp != null) {
                System.out.print(temp.val);

                if (temp.next != null) {
                    System.out.print(" ");
                }

                temp = temp.next;
            }
        }

        sc.close();
    }
}
