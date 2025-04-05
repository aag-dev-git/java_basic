package core_concepts;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {

	/*
	 * Unlike shallow copying, deep copying creates a completely independent copy of
	 * the original object & all its associated objects. In a deep copy, the new
	 * object has its own set of references, & any changes made to the original
	 * object will not affect the copied object, & vice versa. Deep copying is
	 * useful when you want to create a true standalone copy of an object.
	 * 
	 * To achieve deep copying in Java, you need to manually create a new object &
	 * copy all the fields from the original object to the new object. If the object
	 * contains nested objects, you need to recursively create deep copies of those
	 * objects as well.
	 */
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(1, 2, 3));

		TestDeeepCopy testDeeepCopy = new TestDeeepCopy();
		testDeeepCopy.setName("TestList");
		testDeeepCopy.setList(List.of(1, 2, 3));

		// Set Mutable ArrayList
//		testDeeepCopy.setList(arrayList);

		System.out.println(testDeeepCopy);

		// Changed values but it does not mean it reflects in other obj
		TestDeeepCopy testDeeepCopy_1 = (TestDeeepCopy) testDeeepCopy.clone();
		testDeeepCopy_1.setName("Changed TestList");
		testDeeepCopy_1.getList().remove(0);

		System.out.println(testDeeepCopy_1);

		TestDeeepCopy testDeeepCopy_2 = (TestDeeepCopy) testDeeepCopy.clone();
		System.out.println(testDeeepCopy_2);
	}
}

class TestDeeepCopy implements Cloneable {

	private List<Integer> list;
	private String name;

	public TestDeeepCopy() {
	}

	public TestDeeepCopy(List<Integer> list, String name) {
		this.list = list;
		this.name = name;
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
	public Object clone() {

		// When We pass immutable List.of(1, 2, 3)
		List<Integer> listNew = new ArrayList<Integer>();
		listNew.addAll(this.getList());

		return new TestDeeepCopy(listNew, this.getName());

		// When you pass mutable list obj
//		return new TestDeeepCopy(this.getList(), this.getName());

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TestDeeepCopy [name=");
		builder.append(name);
		builder.append(", list=");
		builder.append(list);
		builder.append("]");
		return builder.toString();
	}

}