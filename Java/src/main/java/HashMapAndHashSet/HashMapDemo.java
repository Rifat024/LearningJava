package HashMapAndHashSet;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap <Integer,String>();

        hashMap.put(100,"here is first String ");
        hashMap.put(101,"here is Second String ");
        hashMap.put(102,"here is Third String ");
        hashMap.put(103,"here is fourth String ");

        System.out.println(hashMap.get(101));

    }
}
