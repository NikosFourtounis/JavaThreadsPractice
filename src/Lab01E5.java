package lab01;

class PowThread extends Thread {

	private int[] array;
	private int index;

	// constructor method
	public PowThread(int[] arr, int ind) {
		array = arr;
		index = ind;
	}

	// compute and store in the array the specified number squared
	public void run() {
		array[index] = array[index] * array[index];
	}

}

public class Lab01E5 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int[] a = new int[500];
		int startNum;
		// validate argument
		try {
			startNum = Integer.parseInt(args[0]);

			// Initialise array of integers
			a[0] = startNum;
			for (int i = 1; i < 500; i++) {
				a[i] = a[i - 1] + 1;
			}

			// create array of threads
			PowThread threads[] = new PowThread[500];

			for (int i = 0; i < 500; i++) {
				threads[i] = new PowThread(a, i);
				threads[i].start();
			}

			// Display the  final state of the array
			for (int i = 0; i < 500; i++) {
				System.out.println(i + " " + a[i]);
			}

		} catch (NumberFormatException e) {
			System.err.println("Argument" + args[0] + " must be an integer.");
			System.exit(1);
		}

	}

}
