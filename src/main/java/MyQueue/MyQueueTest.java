package MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add("111111111");
        myQueue.add("222222222");
        myQueue.add("3333333");
        myQueue.add("444444");
        myQueue.add("5555555");
        myQueue.display();

        System.out.println("myQueue.size() = " + myQueue.size());

        System.out.println("myQueue.peek() = " + myQueue.peek());

        System.out.println("myQueue.poll() = " + myQueue.poll());
        myQueue.display();

        myQueue.clear();

        System.out.println("myQueue.size() = " + myQueue.size());


    }
}
