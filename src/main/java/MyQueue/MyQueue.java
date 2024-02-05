package MyQueue;

public class MyQueue<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;


    public void add(T value) {
        Node<T> newNode = new Node(value);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        }
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
        size++;
    }

    public void remove(int index) {
        Node<T> current = first;
        int currentIndex = 1;

        while (current != null && index != currentIndex) {
            current = current.next;
            currentIndex++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException();
        }
        if (currentIndex == 1) {
            first = current.next;
            current.next.prev = null;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }


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

    public void clear() {
        first = null;
    }

    public Node<T> peek() {
        return first;
    }


    public Node<T> poll() {
        Node<T> result = first;
        if (result == null) {
            throw new IndexOutOfBoundsException();
        }

        first = first.next;
        return result;
    }

    public void display() {
        Node<T> current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }


    public boolean isEmpty() {
        return first == null;
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
