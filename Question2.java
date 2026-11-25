
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

public class Question2{

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


}
}
