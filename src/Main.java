public class Main {
	public static void main(String[] args) throws Exception {
		new SimpleThread("SamosThread").start();
		new SimpleThread("IkariaThread").start();
	}
}
