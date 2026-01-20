import java.util.Scanner;
class km
{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter distance in km: ");
		int km = in.nextInt();
		double miles = km*0.62;
		System.out.println("The distance in miles is:" + miles);
	}
}