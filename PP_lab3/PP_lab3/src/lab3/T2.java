package lab3;

import data.Data;
import data.Matrix;

public class T2 extends Thread{

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Task 2 started");
		this.task2();
		System.out.println("Task 2 finished\n");
	}
	
	
	private void task2() {
		System.out.println("Enter MK matrix:");
		Matrix mk = Matrix.read();
		mk.print();
		System.out.println();
		
		System.out.println("Enter ML matrix:");
		Matrix ml = Matrix.read();
		ml.print();
		System.out.println();
		
		System.out.println("Enter MM matrix:");
		Matrix mm = Matrix.read();
		mm.print();
		System.out.println();
		
		Matrix mf = Data.f2(mk, ml, mm);
		System.out.println("F2 result:");
		mf.print();
	}
}
