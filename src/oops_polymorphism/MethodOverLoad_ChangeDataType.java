package oops_polymorphism;

public class MethodOverLoad_ChangeDataType {

	// You can overload a static method.

	public static void sub(int a, int b) {
		System.out.println(a + b);
	}

	public static void sub(double a, double b) {
		System.out.println(a + b);
	}

	public static void sub(char a, char b) {
		System.out.println(a + "" + b);
	}

	public static void main(String[] args) {
		sub(5, 4);
		sub(2.5, 5.5);
		sub('A', 'G');
	}
}