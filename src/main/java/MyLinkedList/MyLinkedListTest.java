package MyLinkedList;

import javax.management.InstanceNotFoundException;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("111111");
        myLinkedList.add("22222222");
        myLinkedList.add("33333333");
        myLinkedList.add("4444444444");
        myLinkedList.add("555555555");
        myLinkedList.add("66666666");
        myLinkedList.add("777777");
        myLinkedList.add("888888888888");
        myLinkedList.add("999999999999");

        myLinkedList.displayLink();

        System.out.println("After remove-------------");
        try {
            myLinkedList.remove(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is wrong");
        }

        myLinkedList.displayLink();

        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("myLinkedList.get(5) = " + myLinkedList.get(5));


    }


}
