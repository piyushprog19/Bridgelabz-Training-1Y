import java.util.Scanner;
class leap_year{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(year>=1582){
			if(year%4==0){
				if(year%100!=0){
				System.out.print("it is a leap year");
				}
				else{
					System.out.print("it is not a leap year");
				}
			}
			else if(year%400==0){
				System.out.print("it is a leap year");
			}
			
		}
	}
}