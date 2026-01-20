import java.util.Scanner;
 class total {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int unit = in.nextInt();
		int quan = in.nextInt();
		System.out.print(unit * quan);
	}
}