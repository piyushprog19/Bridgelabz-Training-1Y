import java.util.Scanner;
 class first {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int dis = in.nextInt();
		double inch = (dis/2.54);
		double feet = (inch/12);
		double yards = dis/(3*feet);
		double mile = yards/1760;
		System.out.print(yards + miles);
	}
}