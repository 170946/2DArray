public class Exercise3{
	static public void main(String[] args){
		int[][] x = new int[10][8];
		for (int r = 0; r < x.length; r++){
			for(int c = 0; c < x[r].length; c++){
				x[r][c] = (int)(Math.random() * 50) + 50;
			}
		}
		printArray(x);
		System.out.println("Smallest: " + findSmallest(x));
		System.out.println("Average: " + findAverage(x));
		System.out.println("Mode: " + findMode(x));
		removeEvens(x);
		printArray(x);
	}
	
	//Prints a given array
	public static void printArray(int[][] myArray){
		for(int r = 0; r < myArray.length; r++){
			for(int c = 0; c < myArray[r].length; c++){
				if (c == myArray[r].length - 1) System.out.println(myArray[r][c]);
				else System.out.print(myArray[r][c] + " ");
			}
		}
	}
	
	// Returns the smallest element of a 2D array
	public static int findSmallest(int[][] y){
		int result = 100;
		for(int r = 0; r < y.length; r++){
			for(int c = 0; c < y[r].length; c++){
				if (y[r][c] < result) result = y[r][c];
			}
		}
		return result;
	}
	
	//Returns the average (as a double) of a 2D array
	public static double findAverage(int[][] y){
		int total = 0;
		int entries = 0;
		for(int r = 0; r < y.length; r++){
			for(int c = 0; c < y[r].length; c++){
				total += y[r][c];
				entries++;
			}
		}
		return (double)total/entries;
	}
	
	//Returns the largest element of a 2D array
	public static int findLargest(int[][] y){
		int result = 0;
		for(int r = 0; r < y.length; r++){
			for(int c = 0; c < y[r].length; c++){
				if (y[r][c] > result) result = y[r][c];
			}
		}
		return result;
	}
	
	//Returns the largest element of a 1D array
	public static int findLargest(int[] y){
		int result = 0;
		for(int r = 0; r < y.length; r++){
			if (y[r] > result) result = y[r];
		}
		
		return result;
	}
	
	//returns the smallest mode in a 2D array
	public static int findMode(int[][] anArray){
		int largest = findLargest(anArray);
		int[] frequencyArray = new int[largest + 1];
		
		for(int r = 0; r < anArray.length; r++){
			for(int c = 0; c < anArray[r].length; c++){
				frequencyArray[anArray[r][c]]++;
			}
		}
		
		int maxCount = findLargest(frequencyArray);
		
		for(int r = 0; r < frequencyArray.length; r++){
			if (frequencyArray[r] == maxCount) return r;
		}
		
		return -1;
	}
	
	public static void removeEvens(int[][] anArray){
		for(int r = 0; r < anArray.length; r++){
			for(int c = 0; c < anArray[r].length; c++){
				if(anArray[r][c]%2 == 0) anArray[r][c] = 11;
			}
		}
	}
}