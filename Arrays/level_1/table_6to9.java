import java.util.Scanner;
class table_6to9{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[4];
		int mul=1;
		for(int i=6;i<=9;i++){
			mul = num*i;
			arr[i-6] = mul;
			System.out.println(num + " x " + i + " = " + arr[i-6]);
		}
	}
}