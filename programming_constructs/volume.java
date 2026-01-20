import java.util.Scanner;
class volume{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float radius,height;
		System.out.print("radius ");
		radius = in.nextFloat();
		System.out.print("height ");
		height = in.nextFloat();
		double volume = (3.14 * (radius * radius)/*here we can use Math.pow(radius,2) also*/ height);
		System.out.print("volume is " + volume);
	}
}