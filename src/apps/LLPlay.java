package apps;
import nodes.LLNode;

public class LLPlay {

    public static void main(String[] args) {
        LLNode<Character> newNode = new LLNode<>('A');
        LLNode<Character> head = newNode; // head points to the first node in the list

        newNode = new LLNode<>('T');
        newNode.setNext(head);
        head = newNode;

        newNode = new LLNode<>('A');
        newNode.setNext(head);
        head = newNode;

        newNode = new LLNode<>('D');
        newNode.setNext(head);
        head = newNode;

        LLNode<Character> ptr = head;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getNext();
        }
        System.out.println(); // Add a newline at the end
    }
}