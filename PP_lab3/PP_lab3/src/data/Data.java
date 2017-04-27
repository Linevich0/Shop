package data;

public class Data {
	public final static int range = 3; 

	
	public static Vector f1(Vector a, Vector b, Vector c, Matrix ma, Matrix md) {
		return Vector.multiply_Vector_Matrix(Vector.multiply_Int_Vector(Vector.getMinVectorInt(Vector.sumVectors(a, b)), Vector.sumVectors(b, c)), Matrix.multMatrices(ma, md)); 
	}
	
	public static Matrix f2(Matrix mk, Matrix ml, Matrix mm) {
		return  Matrix.sort(Matrix.sumMatrices(mk, Matrix.multMatrices(ml, mm)));
	}
	
	public static int f3(Matrix ms, Matrix mt, Matrix mw, Vector q, Vector v) {
		return Vector.getMaxVectorInt(Vector.sumVectors(Vector.multiply_Vector_Matrix(q, Matrix.multMatrices(ms, mt)), Vector.multiply_Vector_Matrix(v, mw)));
	}
}
