package features.java_8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutures {
	/*
	 * In Java 8, the CompletableFuture class was introduced in the
	 * java.util.concurrent package as part of the
	 * java.util.concurrent.CompletionStage API. It represents a future result of an
	 * asynchronous computation and provides a powerful and flexible way to handle
	 * asynchronous programming.
	 */   

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// Step 1: Run an asynchronous task that fetches user data
		// supplyAsync() runs the task asynchronously using ForkJoinPool.commonPool()

		CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> {
			simulateDelay(1000); // Simulate a delay
			return "John Doe"; // Simulated user name from a DB/API
		});

		// Step 2: Transform the result using thenApply()
		// thenApply() is used to apply a function to the result of a CompletableFuture

		CompletableFuture<String> greetingFuture = userFuture.thenApply(userName -> {
			return "Hello, " + userName + "!";
		});

		// Step 3: Consume the result using thenAccept()
		// thenAccept() is used when you just want to perform an action on the result
		// (like printing), but not return a new value
		greetingFuture.thenAccept(greeting -> {
			System.out.println("Processed greeting: " + greeting);
		});

		// Optional: Wait for completion if needed (to prevent main thread from exiting
		// early)
		greetingFuture.get(); // Blocks and waits for the final result

		// Example of handling exceptions using exceptionally()
		CompletableFuture<Object> faultyFuture = CompletableFuture.supplyAsync(() -> {
			simulateDelay(500);
			throw new RuntimeException("Something went wrong!");
		}).exceptionally(ex -> {
			// Handle the exception and return a fallback result
			return "Default User";
		});

		// Get the result (either the original or fallback)
		System.out.println("Fallback result: " + faultyFuture.get());
	}

	// Simulate delay for asynchronous task
	private static void simulateDelay(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new IllegalStateException(e);
		}
	}
}
