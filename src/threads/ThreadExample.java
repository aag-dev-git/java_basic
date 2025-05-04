package threads;

import java.util.concurrent.locks.LockSupport;

public class ThreadExample extends Thread {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();

		thread.setName("demo thread");
		thread.setPriority(MAX_PRIORITY);

		long id = thread.getId();
		int priority = thread.getPriority();
		State state = thread.getState();
		ThreadGroup threadGroup = thread.getThreadGroup();

		System.out
				.println("id -> " + id + " priority -> " + priority + " state " + state + " threadGroup" + threadGroup);
	}
}

class MyThread extends Thread {
	public void run() {
		int i = 0;
		for (; i < 6; i++) {

			System.out.println("Thread is running");

			LockSupport.parkNanos(1000000000);

			try {
				System.out.println("In sleep");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void showDemo() {
		int num = 0;
		do {
			System.out.println("In showDemo()");
			num++;

		} while (num < 5);

	}
}