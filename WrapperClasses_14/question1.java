import java.util.Scanner;
public class question1 {
    public void primToWrapp(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter th number :- ");
        int n1 = in.nextInt();
        Integer n2 = n1;
        System.out.println("Primitive :- " + n1);
        System.out.println("Wrapper :- " + n2);
    }
    public static void main(String[] args) {
        question1 q1 = new question1();
        q1.primToWrapp();
    }
}