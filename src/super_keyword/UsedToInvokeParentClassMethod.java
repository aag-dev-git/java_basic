package super_keyword;

/**
 * It should be used if sub-class contains the same method as the parent class,
 * it is used if method overridden;
 */
class ParentClass {
	void show() {
		System.out.println("I'm Father");
	}
}

/*
 * The super keyword cannot be used to call static methods because static
 * methods Protected and public methods can be accessed using super if they are
 * inherited by the subclass. The super keyword can also be used to access
 * parent class fields or constructors if needed
 */
class ChildClass extends ParentClass {
	void show() {
		System.out.println("I'm Child");
	}

	void work() {
		super.show();
		show();
	}

	/*
	 * The super keyword cannot be used inside static methods or blocks since it
	 * requires an instance context
	 */

	public static void workDone() {
		// super.show(); // Compile error

	}
}

public class UsedToInvokeParentClassMethod {
	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		ch.work();
	}
}