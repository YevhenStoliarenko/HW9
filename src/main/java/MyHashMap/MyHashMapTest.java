package MyHashMap;

import java.util.HashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();
       myHashMap.put("1", "111111111");
       myHashMap.put("2", "2222222");
       myHashMap.put("3", "3333333");
       myHashMap.put("4", "4444444");
       myHashMap.put("5", "5555555");
       myHashMap.put("6", "6666666");
       myHashMap.put("7", "7777777");
       myHashMap.put("8", "8888888");
       myHashMap.put("9", "999999");
       myHashMap.put("10", "11110000");
       myHashMap.put("11", "111_111");

       myHashMap.display();

       myHashMap.remove("2");

        System.out.println("After remove\n-------------------------");

       myHashMap.display();

        System.out.println("myHashMap.size() = " + myHashMap.size());

        System.out.println("myHashMap.getValue(\"4\") = " + myHashMap.getValue("11"));

        myHashMap.clear();

        System.out.println("myHashMap.size() = " + myHashMap.size());

    }
}
