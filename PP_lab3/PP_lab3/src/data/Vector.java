package data;

public class Vector {
	private int[] vector;

	private Vector(int[] vector) {
		this.vector = vector;
	}	
	
	
	public static Vector read() {
		int[] vector = new int[Data.range];		
	    for (int i = 0; i < Data.range; i++) {
	    	vector[i] = 1;
	    }
		return new Vector(vector);    
	}
	
	
	public void print() {
		for (int i = 0; i < Data.range; i++) {
			System.out.print(vector[i]);
			System.out.print(" ");
	    }
	   	System.out.println();
	}

	
	// Return a sum of vectors v1, v2
	public static Vector sumVectors(Vector v1, Vector v2) {
		int[] vector = new int[Data.range];		
		for (int i = 0; i < Data.range; i++) {
			vector[i] = v1.vector[i] + v2.vector[i];
		}
		return new Vector(vector);
	}
	
	
	public static int getMinVectorInt(Vector v) {
		int res = 999999;
		for (int i = 0; i < Data.range; i++) {
			if (v.vector[i] < res) {
				res = v.vector[i];
			}
		}
		return res;		
	}
	
	
	public static int getMaxVectorInt(Vector v) {
		int res = -999999;
		for (int i = 0; i < Data.range; i++) {
			if (v.vector[i] > res) {
				res = v.vector[i];
			}
		}
		return res;		
	}
	
	
	public static Vector multiply_Int_Vector(int a, Vector v) {
		int[] vector = new int[Data.range];
		for (int i = 0; i < Data.range; i++) {
			vector[i] = v.vector[i] * a;
		}
		return new Vector(vector);
	}
	
	
	public static Vector multiply_Vector_Matrix(Vector v, Matrix m) {
		int[] vector = new int[Data.range];
		for (int i = 0; i < Data.range; i++) {
			vector[i] = 0;
			for (int j = 0; j < Data.range; j++) {
				vector[i] = vector[i] + v.vector[j] * m.getElementByIndex(i, j);
			}
		}
		return new Vector(vector);
	}
}
