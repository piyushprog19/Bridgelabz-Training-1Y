import java.util.Scanner;
class Area_of_circle{
	public static void main(String[] args){
		float radius;
		System.out.print("Radius ");
		Scanner in = new Scanner(System.in);
		radius = in.nextFloat();
		double area = (3.14 * radius * radius);
		System.out.println("area is " + area);
	}
}