package lab01;

class SqrtSumThread extends Thread {

	double sum = 0;
	private int startNum;
	private int endNum;

	// constructor method
	public SqrtSumThread(int start, int end) {
		startNum = start;
		endNum = end;
	}

	public void run() {
		// computing the sum of each square root for the given interval
		for (int i = startNum; i <= endNum; i++) {
			sum += Math.sqrt(i);
		}
		// Print finished message
		System.out.println("Thread " + getName() + " finished");
	}

}

public class Lab01E4 {

	public static void main(String[] args) {
		long tStart = System.currentTimeMillis(); // timestamp in milliseconds
		double sum;
		// Creating 5 threads
		SqrtSumThread t1 = new SqrtSumThread(1, 100000000);
		SqrtSumThread t2 = new SqrtSumThread(100000001, 200000000);
		SqrtSumThread t3 = new SqrtSumThread(200000001, 300000000);
		SqrtSumThread t4 = new SqrtSumThread(300000001, 400000000);
		SqrtSumThread t5 = new SqrtSumThread(400000001, 500000000);

		// Start all threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		try {
			// Waiting for all threads to finish
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Compute the final sum by summing up the individual runs
		sum = t1.sum + t2.sum + t3.sum + t4.sum + t5.sum;
		long tEnd = System.currentTimeMillis(); // timestamp for ending
		// Print result by using multiple threads
		System.out.println("Running on threads, the result is " + sum);
		System.out.println("Running on threads lasted " + (tEnd - tStart) + " milliseconds");

		// Do the same but in main thread
		tStart = System.currentTimeMillis(); // timestamp in milliseconds
		sum = 0;
		for (int i = 1; i <= 500000000; i++) {
			sum += Math.sqrt(i);
		}

		tEnd = System.currentTimeMillis(); // timestamp for ending

		// Print result by using the main thread
		System.out.println("Running without threads, the result is " + sum);
		System.out.println("Running without threads lasted " + (tEnd - tStart) + " milliseconds");
	}

}
