import java.util.Scanner;
class grade{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int marks = in.nextInt();
		if(marks>=80 && marks<=100){
			System.out.println("Grade A");
			System.out.print("level 4,above agency-normalized students");
		}
		else if(marks>=70 && marks<80){
			System.out.println("Grade B");
			System.out.print("level 3,at agency-normalized students");
		}
		else if(marks>=60 && marks<70){
			System.out.println("Grade C");
			System.out.print("level 2,below,but approaching agency-normalized students");
		}
		else if(marks>=50 && marks<60){
			System.out.println("Grade D");
			System.out.print("level 1,well below agency-normalized students");
		}
		else if(marks>=40 && marks<50){
			System.out.println("Grade E");
			System.out.print("level 1,too below agency-normalized students");
		}
		else if(marks>=0 && marks<=39){
			System.out.println("Grade F");
			System.out.print("Remedial Standards");
		}
	}
}