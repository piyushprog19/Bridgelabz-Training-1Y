import java.util.Scanner;
import java.util.Arrays;
class fizzbuzz{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String[] arr = new String[num];
		arr[0] = "0";
		if(num<0){
			System.out.print("invalid");
			return;
		}
		for(int i=1;i<num;i++){
			if(i%3==0){
				arr[i] = "fizz";
			}
			else if(i%5==0){
				arr[i] = "buzz";
			}
			else if(i%3==0&&i%5==0){
				arr[i] = "fizzbuzz";
			}
			else{
				arr[i] = String.valueOf(i);
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}