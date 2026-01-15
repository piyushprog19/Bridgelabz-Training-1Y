import java.util.Scanner;
class Harry{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int birth_year,current_year;
		System.out.print("birth year is");
		birth_year = in.nextInt();
		System.out.print("current year is");
		current_year = in.nextInt();
		int age = (current_year - birth_year);
		System.out.print("age is " + age);
	}
}