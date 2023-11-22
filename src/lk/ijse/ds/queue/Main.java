package lk.ijse.ds.queue;

/*
    @author DanujaV
    @created 11/22/23 - 12:40 PM   
*/

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        queue.deQueue();
    }
}
