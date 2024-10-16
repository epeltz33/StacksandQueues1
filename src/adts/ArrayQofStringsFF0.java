package adts;

public class ArrayQofStringsFF0<E> {
    protected E[] queue;
    protected int FRONT = 0;
    protected int rear = -1;
    protected final int DEFAULT_CAPACITY = 5;


    public ArrayQofStringsFF0() {
        queue = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayQofStringsFF0(int capacity) {
        queue = (E[]) new Object[capacity];
    }

    public void enqueue(E item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
    }

    public E dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        E item = queue[FRONT];
        queue[FRONT] = null;
        FRONT = (FRONT + 1) % queue.length;
        return item;
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[FRONT];
    }

    public boolean isEmpty() {
        return FRONT == (rear + 1) % queue.length;
    }

    public boolean isFull() {
        return FRONT == (rear + 2) % queue.length;
    }

    public String toString() {
        String result = "";
        for (int i = FRONT; i != (rear + 1) % queue.length; i = (i + 1) % queue.length) {
            result += queue[i] + " ";
        }
        return result;
    }

}
