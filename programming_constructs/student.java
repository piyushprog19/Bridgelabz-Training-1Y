import java.util.Scanner;
class student{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int pen,student;
		pen = in.nextInt();
		student = in.nextInt();
		int que = (pen/student);
		int rem = (pen%student);
		System.out.print(que + rem);
	}
}