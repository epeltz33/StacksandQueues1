package adts;

import interfaces.StackInterface;
import nodes.LLNode;

public class LLStack<E> implements StackInterface<E> {

    private LLNode<E> top;

    public LLStack() {
        top = null;
    }

    public void push(E data) {
        LLNode<E> newNode = new LLNode<>(data);
        newNode.setNext(top);
        top = newNode;
    }

    public E pop() {
        if (top == null) {
            return null;
        }
        E data = top.getData();
        top = top.getNext();
        return data;
    }

    public E peek() {
        if (top == null) {
            return null;
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        LLNode<E> current = top;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return sb.toString();
    }
}