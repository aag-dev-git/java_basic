package core_concepts;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopy {
	/*
	 * A shallow copy creates a new object that shares the same references as the
	 * original object. In other words, the new object points to the same memory
	 * locations as the original object. Any changes made to the original object
	 * will be reflected in the copied object, & vice versa. Shallow copying is the
	 * default behavior when assigning one object to another or when using the
	 * clone() method without any modification.
	 */

	public static void main(String[] args) {

		TestShallowCopy testShallowCopy = new TestShallowCopy();
		testShallowCopy.setList(new ArrayList<Integer>(List.of(10, 20, 50, 60, 80)));
		testShallowCopy.setName("Shallow Copy");

		try {

			// Here the remove method applied but it not reflects in object bcoz its shallow
			TestShallowCopy testShallowCopy_1 = (TestShallowCopy) testShallowCopy.clone();
			testShallowCopy_1.getList().remove(0);
			testShallowCopy_1.getList().remove(1);

			TestShallowCopy testShallowCopy_2 = (TestShallowCopy) testShallowCopy.clone();

			System.out.println(testShallowCopy);
			System.out.println(testShallowCopy_1);
			System.out.println(testShallowCopy_2);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}

class TestShallowCopy implements Cloneable {
	private List<Integer> list;
	private String name;

	public TestShallowCopy() {
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestShallowCopy [name=");
		builder.append(name);
		builder.append(", list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}

}