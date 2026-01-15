import java.util.Scanner;
class profit_loss{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int cp,sp;
		cp = in.nextInt();
		sp = in.nextInt();
		int profit = (sp - cp);
		double pro_per = ((profit/cp)*100);
		System.out.println("profit is " + profit);
		System.out.println("profit percentage is " + pro_per);
	}
}