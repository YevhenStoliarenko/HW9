package MyStack;

import MyLinkedList.Node;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.add("1111111");
        myStack.add("2222222");
        myStack.add("3333333");
        myStack.add("4444444");
        myStack.add("5555555");

        myStack.display();

        myStack.remove(5);

        System.out.println("After remove");

        myStack.display();

        System.out.println("myStack.size() = " + myStack.size());

        System.out.println("myStack.peek() = " + myStack.peek());

        System.out.println("myStack.pop() = " + myStack.pop());
        myStack.display();

        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());

    }
}
