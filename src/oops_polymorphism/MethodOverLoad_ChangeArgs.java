package oops_polymorphism;

class Adder {
	public int add(int a, int b) {
		return (a + b);
	}

	// You can overload a static method.
	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void add(int c) {
		System.out.println(c);
	}
}

public class MethodOverLoad_ChangeArgs {
	public static void main(String[] args) {
		Adder objAdd = new Adder();
		System.out.println(objAdd.add(10, 2));

		Adder.add('a', 10, 6);// passing a char converted to int

		objAdd.add(2);
	}
}