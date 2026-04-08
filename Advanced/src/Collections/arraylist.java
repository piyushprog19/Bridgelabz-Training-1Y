package Collections;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("meow");
        animal.add("bhau");
        animal.add("moooo");
        animal.add("chirp");
        animal.add("kaauu");
        System.out.println("My animal soundds are :- " + animal);
        System.out.println("index 1 :- " + animal.get(0));
        System.out.println("index 2 :- " + animal.get(1));
        animal.set(0,"quak quak");
        System.out.println("updated animal sounds are :- " + animal);
        animal.remove("chirp");
        System.out.println("bird sound has been removed :- " + animal);
        System.out.println("size of an animal list :- " + animal.size());
        System.out.println("is animal list is empty or not :- " + animal.isEmpty());
        System.out.println("is bhau present in animal list :- " + animal.contains("bhau"));
        System.out.println("animal list is now reversed :- " + animal.reversed());
    }
}
