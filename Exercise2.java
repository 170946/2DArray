public class Exercise2{
	public static void main(String[] args){
		int[][] x = new int[3][4];
		for(int r = 0; r < x.length; r++){
			for(int c = 0; c < x[r].length; c++){
				x[r][c] = (int)(10 * Math.random());
			}
		}
		
		printArray(x);
	}
	
	public static void printArray(int[][] myArray){
		for(int r = 0; r < myArray.length; r++){
			for(int c = 0; c < myArray[r].length; c++){
				if (c == myArray[r].length - 1) System.out.println(myArray[r][c]);
				else System.out.print(myArray[r][c] + " ");
			}
		}
	}
}