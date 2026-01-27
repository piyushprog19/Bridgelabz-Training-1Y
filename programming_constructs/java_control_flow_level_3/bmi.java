import java.util.Scanner;
class bmi{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("enter height and weight : ");
		float height = in.nextFloat();
		float weight = in.nextFloat();
		double bmi = ((weight*100*100)/(height*height));
		if(bmi<=18.4){
			System.out.print("underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9){
			System.out.print("normal");
		}
		else if(bmi>=25 && bmi<=39.9){
			System.out.print("overweight");
		}
		else if(bmi>=40.0){
			System.out.print("obese");
		}
	}
}