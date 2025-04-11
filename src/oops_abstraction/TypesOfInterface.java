package oops_abstraction;

//File: InterfaceTypesDemo.java

/*
* ============================
* Types of Interfaces in Java
* ============================
*
* 1. Marker Interface
* 2. Functional Interface
* 3. Normal Interface
* 4. Multiple Inheritance using Interface
* 5. Tagging Interface (similar to marker, used for metadata)
*
* Note: Since Java 8+, interfaces can also have static, default, and private methods.
*/

public class TypesOfInterface {
	public static void main(String[] args) {

		// 1. Marker Interface Usage
		Student s = new Student();
		if (s instanceof Savable) {
			System.out.println("Student is savable (marker interface applied).");
		}

		// 2. Functional Interface Usage
		Greeting g = () -> System.out.println("Hello from functional interface!");
		g.sayHello();

		// 3. Normal Interface Usage
		Tata_Tia t = new Tata_Tia();
		t.start();
		t.stop();

		// 4. Multiple Inheritance using Interface
		Bat b = new Bat();
		b.fly();
		b.walk();
	}
}

/*
 * ------------------------------------------------------------------------- 1.
 * Marker Interface (No methods) - Used to mark classes for special handling
 * (Serializable, Savable)
 * -------------------------------------------------------------------------
 */
interface Savable {
} // Marker Interface

class Student implements Savable {
} // Marks Student as "savable"

/*
 * ------------------------------------------------------------------------- 2.
 * Functional Interface (Only 1 abstract method) - Used for lambda expressions
 * or functional programming (Runnable, Comparable, Comparator)
 * -------------------------------------------------------------------------
 */
@FunctionalInterface
interface Greeting {
	void sayHello(); // Only one abstract method allowed

	// You can add default or static methods too
	default void sayBye() {
		System.out.println("Bye!");
	}
}

/*
 * ------------------------------------------------------------------------- 3.
 * Normal Interface (Multiple abstract methods) - Commonly used to define
 * blueprints for behavior
 * -------------------------------------------------------------------------
 */
interface VehicleDemo {
	void start();

	void stop();
}

class Tata_Tia implements VehicleDemo {
	public void start() {
		System.out.println("Tata started");
	}

	public void stop() {
		System.out.println("Tata stopped");
	}
}

/*
 * ------------------------------------------------------------------------- 4.
 * Multiple Inheritance using Interfaces - Java supports multiple inheritance
 * with interfaces only
 * -------------------------------------------------------------------------
 */
interface Flyer {
	void fly();
}

interface Walker {
	void walk();
}

class Bat implements Flyer, Walker {
	public void fly() {
		System.out.println("Bat is flying");
	}

	public void walk() {
		System.out.println("Bat is walking");
	}
}
