import java.util.Scanner;
class nature{
	public static void main(String[] args){
		nature m = new nature();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print("number are :- " + m.nature(n));
	}
	int nature(int n){
		if(n<0){
			return -1;
		}
		else if(n==0){
			return 0;
		}
			return 1;
	}
}