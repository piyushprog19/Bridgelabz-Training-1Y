import java.util.Scanner;
import java.util.Arrays;
class vowels{
	public int[] count(String a){
		int[] arr = new int[2];
		for(int i=0;i<a.length();i++){
			if((a.charAt[i]>='a' && a.charAt[i]<='z')||(a.charAt[i]>='A' && a.charAt[i]<='Z')){
				if(a.charAt[i]=='A'||a.charAt[i] == 'a'||a.charAt[i]=='I'||a.charAt[i] == 'i'||a.charAt[i]=='O'||a.charAt[i] == 'o'||a.charAt[i]=='U'||a.charAt[i] == 'u'||a.charAt[i]=='E'||a.charAt[i] == 'e'){
					arr[0]++;
				}
				arr[1]++;
			}
		}
		return arr;
	}
	public static void main(String[] args){
		vowels v = new vowels();
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		System.out.print("vowels and consonants are :- ");
		System.out.println(Arrays.toString(v.count(a)));
	}
}