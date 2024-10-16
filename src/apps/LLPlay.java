package apps;
import nodes.LLNode;
public class LLPlay {

    public static void main (String[] args) {
        LLNode<Character> newNode = new LLNode<>('A');
        LLNode<Character> head = newNode; // head points to the first node in the list

        newNode = new LLNode<>('T'); // create a new node with data 'T'
        head.setNext(head);
        head = newNode; // head now points to the new node

        newNode = new LLNode<>('A');
        head.setNext(head);
        head = newNode;

        newNode = new LLNode<>('D');
        head.setNext(head);
        head = newNode;

        LLNode<Character> ptr = head;
        while (ptr != null) {
            System.out.println(ptr.getData() + " ");
            ptr = ptr.getNext();

    }










    }
}
