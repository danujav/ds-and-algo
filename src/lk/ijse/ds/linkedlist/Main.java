package lk.ijse.ds.linkedlist;

/*
    @author DanujaV
    @created 11/22/23 - 2:01 PM   
*/

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnding(500);

        ll.insertAtBeginning(10);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(30);

        ll.insertAtEnding(40);

        ll.traverse();  //[30, 20, 10, 500, 40]

        ll.insertAtPosition(50, 2);

        ll.traverse();  //[30, 20, 50, 10, 500, 40]

        ll.deleteAtBeginning();

        ll.traverse();  //[20, 50, 10, 500, 40]

        ll.deleteAtEnding();

        ll.traverse(); //[20, 50, 10, 500]

        ll.deleteAtPosition(2);

        ll.traverse(); //[20, 50, 500[
    }
}
