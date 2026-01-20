import java.util.Scanner;
 class doub_op {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		System.out.println(a + b * c);
		System.out.println(a * b + c);
		System.out.print(a % b + c);
	}
}