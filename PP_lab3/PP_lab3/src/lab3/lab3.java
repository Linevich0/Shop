package lab3;


public class lab3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		Thread t3 = new Thread(new T3());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
	    t1.setPriority(Thread.NORM_PRIORITY);
	    
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}	
	}
}
