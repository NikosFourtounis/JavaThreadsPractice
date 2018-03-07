class SimpleThread extends Thread {
	int startingNumber;
	int endingNumber;

	public SimpleThread(String str, int startingNumber, int endingNumber) {
		super(str);
		this.startingNumber = startingNumber;
		this.endingNumber = endingNumber;
	}

	public void run() {
		System.out.println("Starting --> " + getName());
		for (int i = startingNumber; i < endingNumber; i++) {
			Main.output
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Finished --> " + getName());
	}
}