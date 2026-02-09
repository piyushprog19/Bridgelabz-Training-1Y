package level_1;
import java.util.Scanner;
class vote{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = in.nextInt();
			}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=18){
				System.out.println("student " + i + " can vote");
			}
			else if(arr[i]<0){
				System.out.println("invalid age");
			}
			else{
				System.out.println("student " + i + " cannot vote");
			}
		}System.out.println("invalid age");
	}
}