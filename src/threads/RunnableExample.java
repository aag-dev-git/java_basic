package threads;

import java.util.concurrent.locks.LockSupport; // Importing LockSupport class for parking (pausing) threads

public class RunnableExample {

	public static void main(String[] args) {
		DemoThread demoThread = new DemoThread(); // Creating an instance of DemoThread which implements Runnable

		// Creating and starting a new thread with the Runnable object
		// Alternative way (commented out):
		// Thread th = new Thread(demoThread);
		// th.start();
		
		new Thread(demoThread).start(); // This creates and starts the thread in one line
	}
}

class DemoThread implements Runnable {

	// The run() method contains the code that will be executed by the new thread
	@Override
	public void run() {
		int i = 0;
		for (; i < 10; i++) { // Loop to repeat the actions 10 times

			System.out.println("Thread is running now"); // Output to indicate thread activity

			// Pause the thread for a short duration using LockSupport
			// parkNanos pauses the thread for the specified nanoseconds (here: 1 second)
			LockSupport.parkNanos(1000000000); // 1,000,000,000 nanoseconds = 1 second

			try {
				System.out.println("In sleep"); // Indicate the thread is about to sleep
				Thread.sleep(1000); // Sleep the thread for 1 second (1000 milliseconds)
			} catch (InterruptedException e) {
				e.printStackTrace(); // Handle interruption while sleeping
			}
		}
	}
}
