import java.util.Scanner;
class handshake{
	public static void main(String[] args){
		handshake h = new handshake();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print("maximum handshakes are :- " + h.handshake(n));
	}
	int handshake(int n){
		return n*(n-1)/2;
	}
}