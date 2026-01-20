import java.util.Scanner;
class perimeter{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		int l,b;
		l = in.nextInt();
		b = in.nextInt();
		int p = 2*(l + b);
		System.out.print(p);
    }
}