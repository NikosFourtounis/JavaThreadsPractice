class SimpleRunnable implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Starting --> " + t.getName());
		for (int i = 0; i < 3; i++) {
			System.out.println(" " + t.getName() + " Loop " + i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Finished --> " + t.getName());
	}
}
