package arrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hash {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(40);//does not allow duplicate elements
        set.add(null);
        set.add(null);
        set.add(50);
        set.add(60);
        set.add(70);
        System.out.println("HashSet :- " + set);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(40);
        set2.add(40);
        set2.add(null);
        set2.add(null);
        set2.add(50);
        set2.add(60);
        set2.add(70);
        System.out.println("LinkHashSet :- " + set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(100);
        set3.add(221);
        set3.add(321);
        set3.add(400);
        set3.add(410);
        set3.add(700);
        set3.add(120);
        System.out.println("TreeSet :- " + set3);
    }
}
