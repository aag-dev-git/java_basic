package features.java_8;

import java.util.concurrent.CompletableFuture;

public class CompletableFutures {

	public static void main(String[] args) {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			// Simulate a long-running task
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Hello from the future!";
		});

		// Continue with another action
		completableFuture.thenAccept(result -> {
			System.out.println(result);
		});
	}
}
