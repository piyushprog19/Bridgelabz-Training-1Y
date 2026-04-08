package stack;

import java.util.Stack;

public class Practice_1 {
    public static void main(String[] args) {
        Stack<String> Dr_Stone = new Stack<>();
        Dr_Stone.push("Senku");
        Dr_Stone.push("Suika");
        Dr_Stone.push("Dr-Xeno");
        Dr_Stone.push("Byakuya");
        System.out.println(Dr_Stone);
        System.out.println("The Smartest one in Series :- " + Dr_Stone.firstElement());
        Dr_Stone.pop();
        System.out.println(Dr_Stone);

    }
}
