
import java.util.Queue;

public class queue_implementation {

    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public queue_implementation(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full! Unable to add element: " + item);
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = item;
            currentSize++;
            System.out.println("Element " + item + " is ENQUEUED to queue");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Unable to remove elements");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println("Dequeue completion.");
                front = 0;
            } else {
                System.out.println("Dequeue completion.");
            }
        }
        currentSize--;
    }

    public static void main(String[] args) {
        queue_implementation q = new queue_implementation(4);
        q.enqueue(4);
        q.dequeue();
        q.enqueue(56);
        q.enqueue(2);
        q.enqueue(67);
        q.dequeue();
        q.dequeue();
        q.enqueue(24);
        q.dequeue();
        q.enqueue(98);
        q.enqueue(45);
        q.enqueue(23);
        q.enqueue(435);
    }
}
