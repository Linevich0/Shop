package data;

public class Matrix {
	private int[][] matrix;
	

	private Matrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	
	public static Matrix read() {
		int[][] matrix = new int[Data.range][Data.range];
		for (int i = 0; i < Data.range; i++) {			
			for (int j = 0; j < Data.range; j++){
				matrix[i][j] = 1;
			}
		}
		return new Matrix(matrix);
	}
	
	
	public void print() {
		for (int i = 0; i < Data.range; i++) {
		    for (int j = 0; j < Data.range; j++) {
		    	System.out.print(matrix[i][j]);
		    	System.out.print(" ");
		    }
		    System.out.println();
		}
	}
	
	
	public static Matrix sumMatrices(Matrix m1, Matrix m2) 
	{
		int[][] matrix = new int[Data.range][Data.range];
		for (int i = 0; i < Data.range; i++) {			
			for (int j = 0; j < Data.range; j++){
				matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
			}
		}
		return new Matrix(matrix);
	}
	
	
	public static Matrix multMatrices(Matrix m1, Matrix m2) {
		int[][] matrix = new int[Data.range][Data.range];
		for (int i = 0; i < Data.range; i++) {
			for (int j = 0; j < Data.range; j++) {
				matrix[i][j] = 0;
		    	for (int k = 0; k < Data.range; k++) {
		    		matrix[i][j] += m1.matrix[i][k]  * m2.matrix[k][j];
		   		}
		  	}
		}
		return new Matrix(matrix);
	}
	
	
	public static Matrix sort(Matrix m) {
		int[][] matrix = m.matrix;
		int max, pos, buf;
		boolean fl = false;				
		
		for (int k = 0; k < Data.range; k++) {
			for (int i = 0; i < Data.range; i++) {
				max = m.matrix[k][i];
				pos = i;
				for (int j = i+1; j < matrix.length; j++) {
					if(matrix[k][j] > max) {
						max = matrix[k][j];
						pos = j;
						fl = true;
					}	
				}
				if (fl) {
					buf = matrix[k][pos];
					matrix[k][pos] = matrix[k][i];
					matrix[k][i] = buf;
				}
			}
		}
		return new Matrix(matrix);
	}
	
	
	public int getElementByIndex(int i, int j) {
		return this.matrix[i][j];
	}
}
