import java.util.Scanner;
class simple_interest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float rate,prin;
		int time;
		System.out.print("rate is : ");
		rate = in.nextFloat();
		System.out.print("prin is : ");
		prin = in.nextFloat();
		System.out.print("time is : ");
		time = in.nextInt();
		double SI = (prin * rate * time/100);
	}
}	
	