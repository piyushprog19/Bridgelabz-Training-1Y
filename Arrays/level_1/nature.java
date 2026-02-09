import java.util.Scanner;
class nature{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i] = in.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				System.out.println(arr[i] + " is positive");
				if(arr[i]%2==0){
					System.out.println(arr[i] + " is even");
				}
			}
		}
		if(arr[0]==arr[arr.length-1]){
			System.out.println(" first and last elements are equal");
		}
		else if(arr[0]>=arr[arr.length-1]){
			System.out.println(" first element is greater than last element");
		}
		else if(arr[0]<=arr[arr.length-1]){
			System.out.println(" first element is lesser than last element");
		}
	}
}