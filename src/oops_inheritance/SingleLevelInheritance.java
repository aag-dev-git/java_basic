package oops_inheritance;

class Animal {
	void type() {
		System.out.println("Pet Animal..");
	}
}

class Horse extends Animal {
	void Run() {
		System.out.println("Runs very fast..");
	}

	void eat() {
		System.out.println("Eating Grass..");
	}
}

//One parent class and one child class is called SingleLevelInheritance
public class SingleLevelInheritance {
	public static void main(String[] args) {
		System.out.println("Horse");

		Horse horse = new Horse();
		horse.type();
		horse.Run();
		horse.eat();
	}
}
