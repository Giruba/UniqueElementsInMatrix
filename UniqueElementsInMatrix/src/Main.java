import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Print the unique elements in the matrix");
		System.out.println("---------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of rows in the matrix");
			int numberRows = scanner.nextInt();
			System.out.println("Enter the number of columns in the matrix");
			int numberColumns = scanner.nextInt();
			int[][] matrix = new int[numberRows][numberColumns];
			for(int rowIndex = 0; rowIndex < numberRows; rowIndex++) {
				for(int colIndex = 0; colIndex < numberColumns; colIndex++) {
					System.out.println("Enter the element");
					matrix[rowIndex][colIndex] = scanner.nextInt();
				}
			}
			PrintUniqueElements(matrix);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
	
	public static void PrintUniqueElements(int[][] matrix) {
		System.out.println("Printing the matrix first");
		PrintMatrix(matrix);
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int index = 0; index < matrix.length; index++) {
			for(int secIndex = 0; secIndex < matrix[0].length; secIndex++) {
				if(hashSet.add(matrix[index][secIndex]));
			}
		}
		
		System.out.println();
		System.out.println("Printing the unique elements -------> ");
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
	
	public static void PrintMatrix(int[][] matrix) {
		for(int index = 0; index < matrix.length; index++) {
			for(int secIndex = 0; secIndex < matrix[0].length; secIndex++) {
				System.out.print(matrix[index][secIndex]+" ");
			}
			System.out.println();
		}
	}
}
