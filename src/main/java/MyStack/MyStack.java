package MyStack;

import MyQueue.MyQueue;

public class MyStack<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            first = newNode;
            return;
        }
        newNode.next = first;
        first.prev = newNode;
        first = newNode;
        size++;
    }

    public void remove(int index) {
        Node<T> current = first;
        int currentIndex = 1;
        while (current != null && currentIndex != index) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 1) {
            first.next.prev = null;
            first = first.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public void clear() {
        first = null;
    }

    public int size() {
        Node<T> current = first;
        size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    public Node<T> peek() {
        return first;
    }

    public Node<T> pop() {
        Node<T> result = first;
        if (first == null) {
            throw new IndexOutOfBoundsException();
        }
        first = first.next;
        return result;
    }


    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        Node<T> current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

}
