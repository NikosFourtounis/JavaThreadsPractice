public class Main {
	public static void main(String[] args) throws Exception {
		new SimpleThread("SamosThread").start();
		Runnable r2 = new SimpleRunnable();
		Thread t2 = new Thread(r2, "Ikaria");
		t2.start();

	}
}
