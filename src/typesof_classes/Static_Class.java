package typesof_classes;
import java.util.Scanner;
class StaticClass 
{
	/* A static in Java in general means the object that belongs to a class and not to the individual instances.
	 * So a static member or method in Java need not be accessed with an object but directly using a class name.
	 * A static class in Java can contain only static members. Also, we cannot instantiate a static class.
	 * */
	static int s;
	static void met(int x, int y)
	{
		System.out.println("static method to calculate sum");
		s = x + y;
		System.out.println(x + "+" + y);
	}
	static class MyNestedClass {
		static
		{
			System.out.println("static block inside a static class");
		}
		public void display()
		{
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
public class Static_Class 
{
	public static void main(String[] args)
	{
		StaticClass.MyNestedClass stNextClass= new StaticClass.MyNestedClass();
		stNextClass.display();

	}
}