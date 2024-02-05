package MyLinkedList;

import java.util.LinkedList;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    private int size;


    public MyLinkedList() {
        size = 0;
        first = null;
        last = null;
    }


    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            first = newNode;
        } else {
            last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;

        }
        last = newNode;
    }


    public void remove(int index) {
        Node<T> current = first;
        int currentIndex = 1;

        while (currentIndex != index && current != null) {
            currentIndex++;
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        if (currentIndex == 1) {
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
        int nElements = 0;
        Node<T> current = first;
        while (current != null) {
            current = current.next;
            nElements++;
        }
        return nElements;
    }

    public Node<T> get(int index) {
        Node<T> current = first;
        int currentIndex = 1;
        while (current != null) {
            current = current.next;
            currentIndex++;
            if (currentIndex == index) {
                break;
            }
        }
        return current;

    }

    public boolean isEmpty() {
        return first == null;
    }


    public void displayLink() {
        Node current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }


}
