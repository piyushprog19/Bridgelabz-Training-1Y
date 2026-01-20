import java.util.Scanner;
class grading{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] stud_m = new int[10];
		for(int i=0;i<10;i++){
			stud_m[i] = in.nextInt();
		}
		for(int i=0;i<10;i++){
			if(stud_m[i]>0 && stud_m[i]<51){
				System.out.println("student 1 is fail");
			}
			else if(stud_m[i]>=51 && stud_m[i]<61){
				System.out.println("student" + i + "is pass with d");
			}
			else if(stud_m[i]>=61 && stud_m[i]<71){
				System.out.println("student" + i + "is pass with c");
			}
			else if(stud_m[i]>=71 && stud_m[i]<=100){
				System.out.println("student" + i + "is pass with good");
			}
			
		}
	}
}