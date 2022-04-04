package HashMapAndHashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Rifat");
        hashSet.add("Bin");
        hashSet.add("Siraj");


        System.out.println(hashSet.size());
        System.out.println(hashSet);

        hashSet.remove("Bin");

        System.out.println(hashSet.size());
        System.out.println(hashSet);
        hashSet.clear();

        System.out.println(hashSet.size());
        System.out.println(hashSet);
    }
}
