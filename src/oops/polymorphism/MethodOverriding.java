package oops.polymorphism;

class Parent1 {
	void bike() {
		System.out.println("Parent's Bike..." + "\n");
	}

	final void m1() {
		System.out.println("final method...");
	}

	public static void staticMethod() {
		System.out.println("Parent1 Static Method");
	}
}

class Child1 extends Parent1 {

	/*
	 * Why Static Methods Can't Be Overridden
	 * 
	 * ✔ Because they are **class-level** methods, not object-level.
	 * 
	 * ✔ Java resolves static methods using the **class type at compile time**, not
	 * the object at runtime.
	 * 
	 * ✔ Hence, runtime polymorphism doesn't apply.
	 */

//	@Override unable to use annotation
	public static void staticMethod() {
		System.out.println("Parent1 Static Method");
	}

	@Override
	void bike() {
		System.out.println("Child's Bike..." + "\n");
	}

}

public class MethodOverriding {
	public static void main(String[] args) {
		Parent1 child = new Child1();
		System.out.println("By ref of Parent create child obj");
		child.bike();

		System.out.println("By create child obj");
		Child1 child1 = new Child1();
		child1.bike();
		child.m1();
	}
}