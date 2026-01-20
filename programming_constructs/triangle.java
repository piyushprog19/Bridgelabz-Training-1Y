import java.util.Scanner;
class triangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		int b,h;
		b = in.nextInt();
		h = in.nextInt();
		double area = (0.5*b*h);
		System.out.print(area);
    }
}