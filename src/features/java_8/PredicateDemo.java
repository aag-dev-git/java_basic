package features.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	/*
	 * In Java 8, a Predicate is a functional interface that represents a
	 * boolean-valued function of one argument. It's used to test if an object meets
	 * a certain condition. It has a single abstract method called test(), which
	 * takes an argument of type T and returns true if the input argument matches
	 * the predicate, and false otherwise.
	 */
	public static void main(String[] args) {

		Predicate<String> predicate = st -> st.contains("test");

		System.out.println(predicate.test("Demo test"));

		Predicate<EmrT> predicateForEmrT = emr -> {

			return emr.getName().contains("Amol");

		};

		System.out.println("predicateForEmrT " + predicateForEmrT.test(new EmrT(100, "Amol Gaikwad")));

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ave");

		// Predicate to check if a name starts with 'A'
		Predicate<String> startsWithA = name -> name.startsWith("A");

		List<String> list = names.stream().filter(startsWithA).collect(Collectors.toList());

		System.out.println(list);

	}

	public static class EmrT {
		private int id;
		private String name;

		public EmrT(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
