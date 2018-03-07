public class Main {
	public static void main(String[] args) throws Exception {
		/*
		 * new SimpleThread("SamosThread").start(); Runnable r2 = new SimpleRunnable();
		 * Thread t2 = new Thread(r2, "Ikaria"); t2.start();
		 */
		Thread t1 = new Thread(new MyRunnable(), "t1");
		Thread t2 = new Thread(new MyRunnable(), "t2");
		Thread t3 = new Thread(new MyRunnable(), "t3");
		t1.start();
		try {
			t1.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All threads are dead, exiting main thread");

	}
}
