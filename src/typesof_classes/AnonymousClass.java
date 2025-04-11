package typesof_classes;

public class AnonymousClass {

	/*
	 * An Anonymous Inner Class is a class defined without a name, and it is
	 * instantiated at the same time it is defined. It is often used when you need a
	 * short-term implementation of an interface or a subclass, typically to
	 * override a method or implement a specific behavior.
	 * 
	 * The class doesn't have a name and is defined and instantiated in a single
	 * expression.
	 * 
	 * You cannot define a constructor for an anonymous inner class. The compiler
	 * automatically calls the constructor of the parent class.
	 * 
	 * Anonymous inner classes in Java provide a simple way to create one-off
	 * implementations of classes or interfaces. They are commonly used for event
	 * handling, threading, and callback mechanisms, and help reduce boilerplate
	 * code.
	 * 
	 * ref : https://codegym.cc/groups/posts/261-anonymous-classes
	 */
	public static void main(String[] args) {

		/*
		 * Using anonymous inner classes, you don’t need to create a separate named
		 * class to implement the methods of an abstract class or an interface. You can
		 * directly provide the implementation within the anonymous class at the point
		 * of instantiation
		 */
		
		// Anonymous class
		MonitoringSystem mns = new MonitoringSystem() {

			@Override
			void monitoring() {
				System.out.println("Added implementation of AnonymousClass using abstract class");
			}

		};

		MonitoringSystem mns_1 = new MonitoringSystem() {

			@Override
			void monitoring() {
				System.out.println("Second monitoring called");
			}

		};

		mns.monitoring();
		mns_1.monitoring();

	}
}

abstract class MonitoringSystem {

	abstract void monitoring();
}