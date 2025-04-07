package enum_;

public class EnumWithinClass {

	// defining enum within class
	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	};

	// creating the main method
	public static void main(String[] args) {
		// printing all enum constants
		for (Season s : Season.values()) {
			System.out.println(s);
		}
		System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
		System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
		System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());

	}

	/*
	 * The Java compiler internally adds the values(), valueOf() , ordinal() etc
	 * methods when it creates an enum.
	 * 
	 * The values() method returns an array containing all the values of the enum.
	 * 
	 * The valueOf() method returns the value of given constant enum.
	 * 
	 * The ordinal() method returns the index of the enum value.
	 * 
	 */
}
