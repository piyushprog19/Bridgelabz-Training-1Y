package WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add("meow");
        list.add(11.212);
        list.add('A');
        System.out.println(list);
        System.out.println("At index 3:- " + (char)list.get(3));
        System.out.println(list.isEmpty());
        System.out.println(list.contains(20));
    }
}
