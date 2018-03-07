class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}

	public void run() {
		System.out.println("Starting --> " + getName());
		for (int i = 0; i < 3; i++) {
			System.out.println(" " + getName() + " Loop " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Finished --> " + getName());
	}
}