import java.util.Scanner;
class length{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		length l = new length();
		System.out.println(l.len(a));
		System.out.println(a.length());
	}
	public int len(String a){
		char[] arr = a.toCharArray();
		return arr.length;
	}
}