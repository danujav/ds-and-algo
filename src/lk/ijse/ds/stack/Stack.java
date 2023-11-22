package lk.ijse.ds.stack;

/*
    @author DanujaV
    @created 11/22/23 - 10:11 AM   
*/

public class Stack {
    private int[] elementData;
    private int top;    //points to the top of the stack

    public Stack(int initialCapacity) {
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            grow();
        }
        elementData[++top] = data;
    }

    public int peek() { //top
        return elementData[top];
    }

    public int pop() {
        if (isEmpty()) {
//            throw new RuntimeException("Stack is empty");
            System.err.println("Stack is empty");
            return -1;
        }
        return elementData[top--];
    }

    public boolean isFull() {
        return top == elementData.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void grow() {
        int[] temp = elementData;   //length -> 5

        elementData = new int[elementData.length * 2];  //length -> 10
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
