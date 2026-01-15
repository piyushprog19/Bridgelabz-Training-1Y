import java.util.Scanner;
class sam{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a,b,c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		double avg = ((a + b + c)/3);
		System.out.print("avg is " + avg);
	}
}