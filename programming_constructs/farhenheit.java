import java.util.Scanner;
class farhenheit{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float celsius;
		System.out.print("celsius is : ");
		celsius = in.nextFloat();
		double Farhenheit = (celsius*(9/5)) + 32;
		System.out.print("farhenheit is " + Farhenheit);
		
	}
}