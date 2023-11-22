package lk.ijse.ds.stack;

/*
    @author DanujaV
    @created 11/22/23 - 10:11 AM   
*/

public class Stack {
    private int[] elementData;
    private int top;    //points to the top of the stack
    
    public Stack(int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }
    
    public void push(int data) {
        elementData[++top] = data;
    }

    public int peek() { //top
        return elementData[top];
    }

    public int pop() {
        return elementData[top--];
    }
}
