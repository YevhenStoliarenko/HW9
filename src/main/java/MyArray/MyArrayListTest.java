package MyArray;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(10);
        Fund fund1 = new Fund(1500, "Colins");
        Fund fund2 = new Fund(1200, "Smith");
        Fund fund3 = new Fund(1000, "Mozart");
        Fund fund4 = new Fund(1203, "Wagner");
        Fund fund5 = new Fund(1458, "Roth");
        Fund fund6 = new Fund(1644, "Hoffman");
        Fund fund7 = new Fund(1390, "Goethe");
        Fund fund8 = new Fund(1777, "Schiller");
        Fund fund9 = new Fund(1423, "Friedrich");
        Fund fund10 = new Fund(1548, "Otto");
        Fund fund11 = new Fund(1548, "Markus");
        Fund fund12 = new Fund(1548, "Heiden");

        myArrayList.add(fund1);
        myArrayList.add(fund2);
        myArrayList.add(fund3);
        myArrayList.add(fund4);
        myArrayList.add(fund5);
        myArrayList.add(fund6);
        myArrayList.add(fund7);
        myArrayList.add(fund8);
        myArrayList.add(fund9);
        myArrayList.add(fund10);
        myArrayList.add(fund11);
        myArrayList.add(fund12);
        myArrayList.display();

        System.out.println("myArrayList.remove() = " + myArrayList.remove(11));
        System.out.println("myArrayList.remove() = " + myArrayList.remove(10));
        myArrayList.display();

        System.out.println("myArrayList.size() = " + myArrayList.size());

        try {
            System.out.println("myArrayList.get(0) = " + myArrayList.get(10));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is wrong");
        }

        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());


    }
}
