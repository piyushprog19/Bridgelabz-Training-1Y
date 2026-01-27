import java.util.Scanner;
class calc{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number and operation  : ");
            int num1 = in.nextInt();
			char ch = in.next().trim().charAt(0);
            int num2 = in.nextInt();
			int ans;
			
                if(ch == '+'){
                    ans = num1 + num2;
                }
                else if(ch == '-'){
                    ans = num1 - num2;
                }
                else if(ch == '*'){
                    ans = num1 * num2;
                }
                else if(ch == '/'){
                    ans = num1 / num2;
                }
                else{
                    ans = num1 % num2;
                }
				System.out.print(ans);
	}
}