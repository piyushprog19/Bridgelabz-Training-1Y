package level_1;
import java.util.Scanner;
class height{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double[] height = new double[11];
		int sum=0;
		for(int i=0;i<height.length;i++){
			height[i] = in.nextDouble();
			sum+=height[i];
		}
		double mean = sum/11;
		System.out.print(mean);
	}
}