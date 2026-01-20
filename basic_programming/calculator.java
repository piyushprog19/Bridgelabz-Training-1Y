import java.util.Scanner;
class calculator{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b;
		a = in.nextInt();
		char op = in.next().trim().charAt(0);
		b = in.nextInt();
		switch(op){
			case '+':
			System.out.print(a + b);
			break;
			case '-':
			System.out.print(a - b);
			break;
			case '/':
			System.out.print(a / b);
			case '*':
			System.out.print(a * b);
			break;
			default:
			System.out.print("invalid");
		}
	}
}