package threads;

public class ThreadLifecycleExample {
	public static void main(String[] args) throws InterruptedException {
		// 1. Thread created - New state
		MyTestThread t = new MyTestThread();
		System.out.println("Thread created - New state");

		// 2. Start the thread, moving it to Runnable state
		t.start(); // Thread transitions to Runnable state

		// Sleep the main thread to simulate waiting for thread execution
		Thread.sleep(500); // Main thread is in the Sleeping state for 500ms

		// 3. Main thread waits for the thread 't' to finish, 't' enters Waiting state
		t.join(); // Main thread enters the Waiting state until thread 't' terminates
		System.out.println("Main thread finished - Terminated state");
	}
}

class MyTestThread extends Thread {
	public void run() {
		try {
			// 4. Thread starts executing - Running state
			System.out.println("Thread started - Running state");

			// 5. Thread goes into Timed Waiting state for 2 seconds (due to sleep)
			Thread.sleep(2000); // Timed Waiting for 2 seconds

			// 6. Thread resumes execution after sleeping - Running state
			System.out.println("Thread resumes after sleep");

		} catch (InterruptedException e) {
			// 7. Interrupted exception handling
			System.out.println("Thread interrupted");
		}
	}
}
