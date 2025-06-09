package features.java_8;

import java.util.ArrayList;

public class ForEachMethod {

	/*
	 * In Java 8, the Java.lang interface now supports a “forEach” function.
	 * Iterable that can iterate over the collection’s items. The Iterable interface
	 * has a default method called “forEach.” Collection classes use it to iterate
	 * items, which extends the Iterable interface. You may send Lambda Expression
	 * as an argument to the “forEach” method, which accepts the Functional
	 * Interface as a single parameter.
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(5);
		list.add(null);
		list.add(2);
		list.add(5);
		list.add(2);
		list.add(6);

		System.out.println("for each...");

		list.forEach(ele -> System.out.println(ele));

	}
}
