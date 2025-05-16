package threads;

public class PrintNumberUsingThreads {

	private static final int MAX = 10;
	private int number = 1;

	public static void main(String[] args) {

		PrintNumberUsingThreads printer = new PrintNumberUsingThreads();

		Thread oddThread = new Thread(() -> printer.printOdd());
		Thread evenThread = new Thread(() -> printer.printEven());

		// Start both threads
		oddThread.start();
		evenThread.start();

	}

	public synchronized void printOdd() {

		while (number <= MAX) {

			// Locking this block so only one thread runs at a time
			synchronized (this) {
				if (number % 2 != 0) {

					System.out.println("Odd: " + number);
					number++;

					// Wake up the other thread (even)
					notify();
				} else {

					try {
						// Wait if it's not this thread's turn
						wait();
					} catch (InterruptedException e) {
						System.err.print(e);
					}

				}
			}
		}
	}

	public synchronized void printEven() {

		while (number <= MAX) {

			synchronized (this) {
				if (number % 2 == 0) {

					System.out.println("Even: " + number);
					number++;

					notify();
				} else {

					try {
						wait();
					} catch (InterruptedException e) {
						System.err.print(e);
					}
				}
			}
		}
	}

}
