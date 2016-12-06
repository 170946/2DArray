public class Exercise1{
	public static void main(String[] args){
		int[][] x = new int[3][4];
		for(int r = 0; r < x.length; r++){
			for(int c = 0; c < x[r].length; c++){
				x[r][c] = (int)(Math.random() * 9) + 1;
				if (c == x[r].length - 1) System.out.println(x[r][c]);
				else System.out.print(x[r][c] + " ");
			}
		}
	}
}