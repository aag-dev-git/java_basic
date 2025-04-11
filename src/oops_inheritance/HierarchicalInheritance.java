package oops_inheritance;

class father {
	void bike() {
		System.out.println("Father's Bullet 365");
	}
}

class Child01 extends father {
	void ch1Bike() {
		System.out.println("Ram's Yamaha 2.5");
	}
}

class Child02 extends father {
	void ch02Bike() {
		System.out.println("Sham's KTM duke");
	}
}

//one parent class multiple child class
public class HierarchicalInheritance {
	public static void main(String[] args) {
		System.out.println("Child01 Ram's Property");
		Child01 ch1 = new Child01();
		ch1.bike();
		ch1.ch1Bike();

		System.out.println();

		System.out.println("Child02 Sham's Property");
		Child02 ch02 = new Child02();
		ch02.bike();
		ch02.ch02Bike();
	}
}