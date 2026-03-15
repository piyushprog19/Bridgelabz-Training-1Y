import java.util.Scanner;
class interest{
	public static void main(String[] args){
		interest s = new interest();
		Scanner in = new Scanner(System.in);
		int principle = in.nextInt();
		double rate = in.nextDouble();
		int time = in.nextInt();
		s.interest(principle,rate,time);
	}
	void interest(int principle,double rate,int time){
		System.out.println(principle*rate*time/100);
	}
}