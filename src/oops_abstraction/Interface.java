package oops_abstraction;

/*
 * ========================== Interface Evolution Timeline ==========================
 *
 * Java 1.0  – Basic interfaces introduced (only abstract methods allowed)
 *
 * Java 5    – Added Generics support for type-safe interfaces
 *
 * Java 8    – Major upgrade:
 *             • Introduced default methods (with body, can be overridden)
 *             • Introduced static methods (with body, cannot be overridden)
 *
 * Java 9    – Introduced private and private static methods in interfaces
 *
 * Java 14   – Records introduced (records can implement interfaces)
 *
 * Java 15   – Sealed interfaces introduced (control which classes can implement)
 *
 * Java 17   – Long Term Support (LTS); sealed hierarchies and pattern matching enhanced
 *
 * Java 21   – Continued improvements for pattern matching and sealed interfaces
 *
 * ===================================================================================
 */

interface Vehicle1 {
	// Abstract methods (must be implemented)
	void name();

	void model();

	void color();

	void price();

	// Default method (has a body, can be overridden in implementation classes)
	default void fuelType() {
		System.out.println("Default Fuel Type: Petrol");
	}

	// Static method (has a body, CANNOT be overridden)
	static void showroomLocation() {
		System.out.println("Showroom Location: Main City Center");
	}
}

//Main class to test implementations
class Interface {
	public static void main(String[] args) {
		Vehicle1 v;

		v = new Tata();
		v.name();
		v.model();
		v.color();
		v.price();
		v.fuelType(); // Calls default method
		Vehicle1.showroomLocation(); // Calls static method

		System.out.println("*********************");

		v = new Suzuki();
		v.name();
		v.model();
		v.color();
		v.price();
		v.fuelType(); // Calls overridden default method
		Vehicle1.showroomLocation(); // Static method must be called with interface name
	}
}

//Tata class implementing Vehicle1
class Tata implements Vehicle1 {
	public void name() {
		System.out.println("Name : Tata Motors");
	}

	public void model() {
		System.out.println("Model : Tata Tiago");
	}

	public void color() {
		System.out.println("Color : Red");
	}

	public void price() {
		System.out.println("Price : 6.8 lac");
	}

	// Inherits default fuelType()
}

//Suzuki class implementing Vehicle1
class Suzuki implements Vehicle1 {
	public void name() {
		System.out.println("Name : Maruti Suzuki");
	}

	public void model() {
		System.out.println("Model : Swift");
	}

	public void color() {
		System.out.println("Color : White");
	}

	public void price() {
		System.out.println("Price : 4.6 lac");
	}

	// Overriding default method
	@Override
	public void fuelType() {
		System.out.println("Fuel Type: Diesel");
	}
}
