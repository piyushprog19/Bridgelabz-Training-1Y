import java.util.Scanner;
class sumuntil{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		int i=0;
		int sum=0;
		while(true){
		int num = in.nextInt();
		 if(num<0||num==0){
				break;  
			}
			arr[i] = num;
			i++;
		}
		for(int j=0;j<i;j++){
			sum+=arr[j];
		}
		System.out.print("sum is " + sum);
	}
}