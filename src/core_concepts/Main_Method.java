package core_concepts;

public class Main_Method {

	// static block executes first
	static {
		System.out.println("Static block");
	}

	/*
	 * The main method is the entry point of any standalone Java application. When
	 * you run a Java program, the Java Virtual Machine (JVM) looks for the main
	 * method to start the execution.
	 * 
	 * public: The method must be accessible to the JVM, which is outside the class.
	 * 
	 * static: It can be called without creating an object of the class. JVM doesn’t
	 * create objects to call main. void: The method doesn’t return any value.
	 * 
	 * main: This is the name of the method. It must be exactly "main"
	 * (case-sensitive).
	 * 
	 * String[] args: This is an array of strings used to receive command-line
	 * arguments when running the program.
	 */

	// instead of args we can write anything
	// can interchange static and public keywords
	// can pass var-args instead of [] args

	static public void main(String... xyz) {
		main(10);
	}

	// overloaded main method
	public static void main(int a) {
		System.out.println("Overloded main method  " + a);
	}

	public void main(String str) {

	}

}
