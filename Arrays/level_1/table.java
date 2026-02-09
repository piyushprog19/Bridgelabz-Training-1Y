import java.util.Scanner;
class table{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = in.nextInt();
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = num*(i+1);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(num + " x " + (i+1) + " = " + arr[i]);
		}
	}
}