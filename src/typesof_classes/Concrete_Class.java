package typesof_classes;

public class Concrete_Class {
	/*
	 * A concrete class is any normal class in a Java program. This class will not
	 * have any abstract methods. All the methods in the concrete class are
	 * completely implemented. A concrete class can inherit from another class, even
	 * an abstract class or implement an interface. We can instantiate the concrete
	 * class and create its objects.
	 */

	public static void main(String args[]) {
		int sum = total(100, 108);
		System.out.println("Total of two integers: " + sum);
	}

	static int total(int val1, int val2) {
		return val1 + val2;
	}
}
