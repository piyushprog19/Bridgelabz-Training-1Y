import java.util.Scanner;
 class handshake {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int handshakes = (n*(n-1)/2);
		System.out.print(handshakes);
	}
}