package com.gla.Arrays;
import java.util.Scanner;
public class calculator {

    public int sub(int n1,int n2){
        return n1-n2;
    }
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }
    public int mul(int n1,int n2){
        return n1*n2;
    }

    public static void main(String[] args) {
        calculator c1 = new calculator();
        int ans;
        int a;
        Scanner in = new Scanner(System.in);
        while(true){
            int n1 =in.nextInt();
             a = in.nextInt();
            int n2 = in.nextInt();

            switch(a) {
                case 1:
                    ans = c1.sub(n1, n2);
                    System.out.println(ans);
                    break;
                case 2:
                    ans = c1.add(n1, n2);
                    System.out.println(ans);
                    break;
                case 3:
                    ans = c1.div(n1, n2);
                    System.out.println(ans);
                    break;
                case 4:
                    ans = c1.mul(n1, n2);
                    System.out.println(ans);
                    break;
                default:
                    System.out.println("invalid");
                    return;//exits the loop when default occurs because
            }
        }
    }
}
