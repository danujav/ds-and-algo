package lk.ijse.ds.queue;

/*
    @author DanujaV
    @created 11/22/23 - 12:40 PM   
*/

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.deQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);

        System.out.println("size: " + queue.size()); //3

        queue.deQueue();

        System.out.println("size: " + queue.size()); //2

        System.out.println("Peek: " + queue.peek());

        queue.printQueue();

        queue.deQueue();

        queue.printQueue();


    }
}
