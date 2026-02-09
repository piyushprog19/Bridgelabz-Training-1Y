package Arrays;

class array_2{
	public static void main(String[] args){
		int[][] arr2 = {{8,8,8},{9,9,9},{10,10,10}};
		int rows = arr2.length;
		int col = arr2.length;
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr2[i][j] + "   ");
			}
			System.out.println();
		}
	}
}