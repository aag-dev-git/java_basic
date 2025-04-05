package constructor;

class Student001 {
	String name;
	int id;

	// Since the parameter names (n, i) are different from the instance variables
	// (name, id), there's no ambiguity. So, this.name or this.id isn't required.
	
	// if we pass var name diff then no need to use this
	Student001(String n, int i) {
		name = n;
		id = i;
	}

	void display() {
		System.out.println("Student 1: " + name + " " + id);
	}
}

public class ConstructorWithoutThis {
	public static void main(String[] args) {
		Student001 s1 = new Student001("Amol", 1001);
		s1.display();
	}
}