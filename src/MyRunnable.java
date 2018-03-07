class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Thread started --> " + Thread.currentThread().getName());
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread ended --> " + Thread.currentThread().getName());
	}
}