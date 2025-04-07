package enum_;

import java.io.Serializable;

public enum DemoEnum implements Serializable {
	/*
	 * Java Enums can be thought of as classes which have a fixed set of constants
	 * (a variable that does not change);
	 * 
	 * Enum improves type safety;
	 * 
	 * Enum can be easily used in switch;
	 * 
	 * Enum can be traversed;
	 * 
	 * Enum can have fields, constructors and methods;
	 * 
	 * The Java enum constants are static and final implicitly. It is available
	 * since JDK 1.5.
	 * 
	 * Enum may implement many interfaces but cannot extend any class because it
	 * internally extends Enum class
	 */

	// fixed vars in enum
	WINTER, SPRING, SUMMER, FALL;

	/*
	 * Fixed Variables in Enum With Fields
	 * 
	 * This approach allows you to associate additional information (like a string,
	 * integer, or other data) with each enum constant.
	 * 
	 * WINTER("winter"), SPRING("spring"), SUMMER("summer");
	 */

	// we can declare main method is executed as normal class
	public static void main(String[] args) {
		DemoEnum s = DemoEnum.WINTER;
		System.out.println(s);
	}

}
