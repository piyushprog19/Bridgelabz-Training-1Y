import java.util.Scanner;
class conversion{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float miles = in.nextFloat();
		double km = (miles * 1.6);
		System.out.print("km is " + km);
	}
}