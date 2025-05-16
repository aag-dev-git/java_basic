package constructor;
/*
 *	A constructor in Java is a special method used to initialize objects when they are created.
 *  Constructors are designed to set initial values for object attributes and prepare the object for use.
 *  They are invoked automatically when an instance of a class is created using the new keyword
 * */

/* A java copy constructor returns a copy of the specified object by 
 * taking the existing object as an argument.;
 * To create a copy constructor, we need to take the existing object 
 * as an argument and initialize the values of instance variables with
 * the values obtained in the object.;
 * One of the most important advantages of using a copy constructor is that 
 * there is no need for any type-casting.
 * Copy constructor in Java allows us to change the fields that are declared as final.
 * Copy constructor provides complete control over object creation. 
 *  */

public class ConstructorTypes {
	private int rollNumber;
	private int age;
	private String name;

	// default constructor , no need to specify explicitly
	public ConstructorTypes() {
		super();
	}

	// constructor with parameters
	public ConstructorTypes(String name, int age, int rollNumber) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}

	// copy constructor
	public ConstructorTypes(ConstructorTypes constructor) {
		this.rollNumber = constructor.rollNumber;
		this.name = constructor.name;
		this.age = constructor.age;
	}

	// method to print
	public void displayStudent() {
		System.out.println("Rollnumber : " + this.rollNumber);
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}

	public static void main(String[] args) {
		ConstructorTypes student = new ConstructorTypes("Amol", 15, 1001);
		student.displayStudent();

		ConstructorTypes student_copy = new ConstructorTypes(student);

		System.out.println("Contents of the copied object");
		student_copy.displayStudent();
	}
}
