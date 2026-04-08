package Collections;

import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<String> bleach = new LinkedList<>();
        bleach.add("Yoruichi");
        bleach.add("Kenpachi Zaraki");
        bleach.add("Shunshui Kyoraku");
        bleach.add("Sosuke Aizen");
        bleach.add("Yhwach");
        bleach.add("Unohona Retsu");
        bleach.add("Ichigo Kurosaki");
        System.out.println("The strongest one in terms of brute strength :- " + bleach.get(1));
        System.out.println("The one who possess highest amount of reiatsu :- " + bleach.get(3));
        System.out.println("The son of Soul king :- " + bleach.get(4));
        System.out.println("The bloodthirsty first Kenpachi :- " + bleach.get(5));
        System.out.println("The one who have most broken bankai in series :- " + bleach.get(2));
        System.out.println("The Thunder god :- " + bleach.getFirst());
        System.out.println("Most powerfull character in series in all terms :- " + bleach.getLast());
    }
}
