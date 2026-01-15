import java.util.Scanner;
 class first {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		double inch = (height/2.54);
		double feet = (inch/12);
		System.out.print(height + feet + inch);
	}
}