package typesof_classes;

final class Final_Class {
	/*
	 * A final class is a class that cannot be inherited or subclassed. Once a class
	 * is declared final in Java, it is a sort of constant and it becomes immutable.
	 * Hence to make a class immutable, we have to declare it as final. Inside final
	 * class we can declare all args like normal class.
	 * 
	 * The JVM can optimize method calls for final classes because it knows that no
	 * subclass can override methods. This can potentially lead to better
	 * performance.
	 * 
	 * String is one of the most famous final classes in Java. Since strings are immutable in
	 * Java, the String class is declared as final to prevent subclassing and
	 * modification of its behavior.
	 * 
	 * All wrapper classes in Java (like Integer, Character, Boolean, etc.) are
	 * final to ensure that their behavior cannot be altered.
	 */

	static void display() {
		System.out.print("Method for Base class.");
	}

	public static void main(String[] args) {
		System.out.println("In final Class");

		display();
	}
}
