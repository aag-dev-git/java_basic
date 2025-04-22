package oops.abstraction;

/*
 * ======================== Abstract Class Evolution Timeline ========================
 *
 * Java 1.0  – Abstract classes introduced
 *             • Can have both abstract and concrete methods
 *             • Can have instance variables and constructors
 *             • Cannot be instantiated directly
 *
 * Java 5    – Generics added
 *             • Abstract classes can be made type-safe using generics
 *
 * Java 8    – Minor compatibility update
 *             • While interfaces gained default/static methods, abstract classes remained the same
 *             • Still used when partial implementation and shared code is needed
 *
 * Java 14   – Records introduced (cannot extend abstract classes)
 *
 * Java 15   – Sealed classes introduced (abstract classes can be sealed)
 *             • Restrict which classes can extend the abstract class
 *
 * Java 17   – Long Term Support (LTS); sealed class usage expanded
 *
 * Java 21   – Continued enhancement of sealed class features and pattern matching
 *
 * =====================================================================================
 */

abstract class Vehicle {

	/*
	 * Key Notes on Abstract Class:
	 * 
	 * Abstract classes can have access modifiers (like public, protected). - You
	 * cannot instantiate an abstract class directly. - You can create a reference
	 * variable of an abstract class type, which can refer to an object of a
	 * concrete subclass.
	 * 
	 * Abstract classes can have: - Instance variables - Constructors (no-arg and
	 * parameterized) - Must Have one Abstract methods (without body) - Concrete
	 * methods (with implementation) - Static methods
	 *
	 * If a subclass does not implement all abstract methods, it must also be
	 * declared abstract.
	 *
	 * Use of Concrete Methods:
	 * 
	 * - Concrete methods in an abstract class allow providing shared/common logic
	 * that subclasses can use or override.
	 * 
	 * - This promotes code reuse and reduces redundancy.
	 */

	int a = 10; // Instance variable

	// No-argument constructor
	Vehicle() {
		System.out.println("Vehicle no-arg constructor called.");
	}

	// Parameterized constructor
	Vehicle(int a) {
		this.a = a;
		System.out.println("Vehicle parameterized constructor called. Value of a: " + this.a);
	}

	// Abstract method (must be implemented in a concrete subclass)
	abstract void start();

	// Concrete method (can be used as-is or overridden by subclass)
	public void stop() {
		System.out.println("Vehicle stopped.");
	}

	// Public static method
	public static void m1() {
		System.out.println("Public static method m1()");
	}

	// Package-private static method
	static void m2() {
		System.out.println("Static method m2()");
	}
}

class Bikee extends Vehicle {
	void start() {
		System.out.println("Bike Start with Kick");
	}
}

class Car extends Vehicle {

	void start() {
		System.out.println("Car Start with Key");
	}

	static void m4() {

	}
}

public class AbstractClass {
	public static void main(String[] args) {
		// Reference of Parent abstract class given
		Vehicle bikee = new Bikee();
		bikee.start();

		Vehicle car = new Car();
		car.start();
	}
}
