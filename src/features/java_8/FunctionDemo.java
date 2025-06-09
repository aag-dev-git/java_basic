package features.java_8;

import java.util.function.Function;

public class FunctionDemo {

	/*
	 * The Function interface is a key component of Java's functional programming
	 * capabilities introduced in Java 8. It is part of the java.util.function
	 * package and represents a function that accepts one argument and produces a
	 * result
	 * 
	 * The Function<T, R> interface is used when you want to transform or map data
	 * from one form to another.
	 */
	public static void main(String[] args) {

		Function<String, Boolean> isBoolFunct = fun -> fun.contains("Test");

		StringBuffer stBuff = new StringBuffer("Amol is Testing");

		System.out.println(isBoolFunct.apply(stBuff.toString()));

		Function<Integer, Integer> multiplyBy2 = x -> x * 2;
		Function<Integer, Integer> add3 = x -> x + 3;

		Function<Integer, Integer> combined = multiplyBy2.andThen(add3);
		System.out.println(combined.apply(5)); // Output: 13 (5*2 + 3)

	}

}
