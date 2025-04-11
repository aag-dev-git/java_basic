package typesof_classes;

import java.util.Scanner;

class StaticClass {
	/*
	 * We can make a class static if and only if it is a nested class. We can also
	 * say that static classes are known as nested classes. It means that a class
	 * that is declared as static within another class is known as a static class. A
	 * static class in Java can contain only static members. Also, we cannot
	 * instantiate a static class.It cannot access the member (non-static) of the
	 * outer class.
	 * 
	 * Since static classes do not require a reference to their enclosing class,
	 * they consume less memory compared to non-static inner classes.
	 */
	static int s;

	static void met(int x, int y) {
		System.out.println("static method to calculate sum");
		s = x + y;
		System.out.println(x + "+" + y);
	}

	static class MyNestedClass {
		static {
			System.out.println("static block inside a static class");
		}

		public void display() {
			int x1;
			int y1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			met(x1, y1);
			System.out.println("Sum of the 2 numbers-" + s);
		}
	}
}

public class Static_Class {
	public static void main(String[] args) {

//		MyNestedClass myNestedClass = new MyNestedClass();
//		myNestedClass.display();

		StaticClass.MyNestedClass stNextClass = new StaticClass.MyNestedClass();
		stNextClass.display();

	}
}