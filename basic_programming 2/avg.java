import java.util.Scanner;
 class avg {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int sum = (a + b + c);
		System.out.print(sum/3);
	}
}