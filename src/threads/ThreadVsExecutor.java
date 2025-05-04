package threads;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadVsExecutor {

    /*
     * The Executor framework in Java is a high-level API for managing threads,
	 * introduced in Java 5 (in java.util.concurrent). It helps you decouple task
	 * submission from the mechanics of how each task will be run (e.g. using which
	 * thread, how many threads, etc).
	 * 
     * ============================================
     *  Difference Between Thread and Executor Framework
     * ============================================
     *
     * Feature             | Thread                                | Executor Framework
     * ------------------- | --------------------------------------| ----------------------------------------------
     * Thread Management   | You manage everything manually        | Automatically managed
     *
     * Task Submission     | new Thread(runnable).start()          | executor.submit(callable)
     *
     * Return Values       | No return value from Runnable         | Callable can return values via Future
     *
     * Thread Pooling      | No pooling (1 thread per task)        | Reuses threads (better performance)
     *
     * Scalability         | Harder to scale efficiently           | Designed to handle many tasks
     *
     * ============================================
     *  Use Thread for simple or quick tasks.
     *  Use Executor framework for better performance, thread reuse,
     *  and handling many tasks more efficiently.
     * ============================================
     */

    public static void main(String[] args) throws Exception {

        // Example using Thread
        Thread threadExample = new Thread(() -> {
            System.out.println("Running task using Thread");
        });
        threadExample.start();

        // Example using Executor & Callable
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> callableTask = () -> {
            Thread.sleep(1000);  // Simulate a task
            return "Result from Callable using Executor!";
        };

        Future<String> future = executor.submit(callableTask);

        // Now get the result (blocks until result is available)
        String result = future.get();
        System.out.println(result);

        executor.shutdown();
    }
}
