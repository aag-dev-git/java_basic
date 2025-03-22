package core_concepts;

public class ForLoop {

	public static void main(String[] args) {
		int a, b;

		// Initialization , condition, increment
		for (a = 0, b = 3; a < b; b--, a++) {
			System.out.println("helooo...");
		}

		int i = 0;
		for (; i < 4;) {
			System.out.println("demo...!");
			i++;
		}

		// Enhanced for each loop
		for (String string : args) {

		}

//		 for (;true;) {
//			 System.out.println("Infinite");
//		 }

//		for (;;) {
//			System.out.println("Infinite");
//		}

	}
}
