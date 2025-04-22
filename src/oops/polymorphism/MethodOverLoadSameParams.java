package oops.polymorphism;

public class MethodOverLoadSameParams {

	public static void main(String[] args) {

		// The compiler will give preference to String
		foo(null);

		// Auto type-casting
		int num = 10;
		demo(num);
	}

	public static void foo(Object o) {
		o.toString();
		o.equals(o);
		System.out.println("Object argument");
	}

	public static void foo(String s) {
		System.out.println("String argument");
		System.out.println("\r demo ");
	}
	
//	public static void foo(StringBuffer st) {
//		System.out.println("StringBuffer argument");
//	}

	// If demo with int not defined then call goes to this method , becoz here auto
	// type-casting is applied
	private static void demo(double d) {
		System.out.println("In demo double " + d);
	}

//	private static void demo(int d) {
//		System.out.println("In demo int " + d);
//	}

}
