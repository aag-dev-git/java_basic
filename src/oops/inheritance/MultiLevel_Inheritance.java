package oops.inheritance;//every class has a its child class

class grandFather {
	void bikeName() {
		System.out.println("GrandFather's  Splendor..");
	}
}

class Father1 extends grandFather {
	void carName() {
		System.out.println("Father's  Audi..");
	}
}

class child extends Father1 {
	void cycleName() {
		System.out.println("Child's  Hercules..");
	}
}

//Multilevel Inheritance      → A → B → C
public class MultiLevel_Inheritance {
	public static void main(String[] args) {
		System.out.println("GrandFather class property..");
		grandFather gFather = new grandFather();
		gFather.bikeName();

		System.out.println();

		System.out.println("Father class property..");
		Father1 Fa = new Father1();
		Fa.carName();
		Fa.bikeName();
		System.out.println();

		System.out.println("Child class property..");
		child ch = new child();
		ch.cycleName();
		ch.carName();
		ch.bikeName();
	}
}