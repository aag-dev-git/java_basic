package core_concepts;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPI {

	/*
	 * The Reflection API in Java is a powerful feature that allows you to inspect
	 * and manipulate classes, interfaces, constructors, methods, and fields at
	 * runtime, even if you don't know their names at compile time.
	 * 
	 * Java Reflection is part of the java.lang.reflect package and is used for:
	 * 
	 * Inspecting class metadata at runtime (class name, methods, fields, etc.)
	 * 
	 * Accessing private fields and methods
	 * 
	 * Creating instances dynamically
	 * 
	 * Calling methods dynamically
	 * 
	 * Cons -: Breaks encapsulation * Can cause security issues * Harder to debug
	 * and maintain
	 * 
	 */

	@SuppressWarnings("deprecation")
	final static public void main(String... args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {

		System.out.println("In main method....");

		Class c = Class.forName("core_concepts.PrivateMethod");
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("message", null);
		m.setAccessible(true);
		m.invoke(o, null);

		Field[] declaredFields = c.getDeclaredFields();

		System.out.println(declaredFields[0] + "\n" + declaredFields[1]);

	}
}

class PrivateMethod {

	private String name = "Amol";
	final static int num = 110;

	private void message() {
		System.out.println("private hello java");
	}
}
