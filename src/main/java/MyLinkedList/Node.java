package MyLinkedList;

public class Node<T> {
    T value;
    Node<T> next;
    Node<T> prev;

    public Node(T value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value " + value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }

}
