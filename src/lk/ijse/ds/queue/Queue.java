package lk.ijse.ds.queue;

/*
    @author DanujaV
    @created 11/22/23 - 12:22 PM   
*/

public class Queue {
    private int[] elementData;
    private int front;
    private int rear;

    public Queue(int initialCapacity){
        elementData = new int[initialCapacity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int data) {
        if(front == -1){
            front = 0;
        }
        elementData[++rear] = data;
    }

    public int deQueue() {
        return elementData[front++];
    }

    public int peek() { //first
        return elementData[front];
    }

    public int size() {
        return rear - front + 1;
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = front; i <= rear; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}