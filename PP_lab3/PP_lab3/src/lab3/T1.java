package lab3;

import data.Data;
import data.Matrix;
import data.Vector;

public class T1 implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Task 1 started");
		this.task1();
		System.out.println("Task 1 finished\n");
	}
	

	private void task1() {
		System.out.println("Enter vector A:");
		Vector a = Vector.read();
		a.print();
		System.out.println();
		
		System.out.println("Enter vector B:");
		Vector b = Vector.read();
		b.print();
		System.out.println();
		
		System.out.println("Enter vector C:");
		Vector c = Vector.read();
		c.print();
		System.out.println();
				
		System.out.println("Enter matrix MA:");
		Matrix ma = Matrix.read();
		ma.print();
		System.out.println();
		
		System.out.println("Enter matrix MD:");
		Matrix md = Matrix.read();
		md.print();
		System.out.println();
		
		Vector d = Data.f1(a, b, c, ma, md);
		System.out.println("F1 result:");
		d.print();
	}
}
