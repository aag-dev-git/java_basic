package typesof_classes;

abstract class Vehicle {

	/*
	 * Abstract class has no any access modifier and can not create objects in class
	 * 
	 * we can not create objects of abstract class But we can create a reference
	 * variable of an abstract class. The reference variable is used to refer to the
	 * objects of derived classes (subclasses of abstract class).
	 * 
	 * we can initialize variables in abstract class;
	 * 
	 * if you want to implement specific methods in child of abstract then you have
	 * to make child class as abstract class;
	 * 
	 * If you have declared parameterized constructor abstract class then you have
	 * to implement that constructor in child class;
	 */

	protected int a = 10;

	// can declare constructor
	Vehicle() {
	}

	abstract void start();// abstarct method

	// public method (concrete methods)
	/*
	 * These methods can be used as-is by subclasses, or they can be overridden if
	 * necessary.
	 * 
	 * Concrete methods allow you to define default behavior in an abstract class,
	 * so subclasses don't have to implement that functionality if they don't need
	 * to change it.
	 */
	public void m1() {
		System.out.println("public method ");
	}

	/*
	 * private static method
	 * 
	 * Static methods can be useful in an abstract class for utility functions or
	 * operations that do not depend on object state.
	 * 
	 * They cannot be overridden by subclasses, as they are not tied to an instance.
	 */
	private static void m2() {
		System.out.println("Static method");
	}

}