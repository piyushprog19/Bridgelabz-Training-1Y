import java.util.Scanner;
class count_digits{
	public  static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count=0;
		int temp = num;
		for(;temp!=0;temp=temp/10){
			count++;
		} 
		System.out.print(count);
	}
}