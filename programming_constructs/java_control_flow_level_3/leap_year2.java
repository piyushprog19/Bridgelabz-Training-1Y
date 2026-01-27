import java.util.Scanner;
class leap_year2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(year>=1582){
			if((year%4==0 && year%100!=0) || year%400==0){
				System.out.print("it is a leap year");
			}
			else{
				System.out.print("it is not leap year");
			}
		}
	}
}