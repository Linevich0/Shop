package lab3;

import data.Data;
import data.Matrix;
import data.Vector;

public class T3 implements Runnable{

	@Override
	public void run() {		
		System.out.println("Task 3 started");
		this.task3();
		System.out.println("Task 3 finished\n");
	}

	
	private void task3() {
		System.out.println("Enter matrix MS:");
		Matrix ms = Matrix.read();
		ms.print();
		System.out.println();
		
		System.out.println("Enter matrix MT:");
		Matrix mt = Matrix.read();
		mt.print();
		System.out.println();
		
		System.out.println("Enter matrix MW:");
		Matrix mw = Matrix.read();
		mw.print();
		System.out.println();
		
		System.out.println("Enter vector Q:");
		Vector q = Vector.read();
		q.print();
		System.out.println();
		
		System.out.println("Enter vector V:");
		Vector v = Vector.read();
		v.print();
		System.out.println();
		
		int a = Data.f3(ms, mt, mw, q, v);
		System.out.println("F3 result:");
		System.out.println(a);
	}
}
