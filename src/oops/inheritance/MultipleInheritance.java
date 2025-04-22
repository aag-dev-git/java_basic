package oops.inheritance;//error occurs

class Parent1 {
	void p1() {
		System.out.println("Parent 1 is here");
	}
}

class Parent2 {
	void p2() {
		System.out.println("Parent 2 is here");
	}
}

class Child1 extends Parent1 // ,Parent2 //cannot extends both parent in one child class
{
	void c1() {
		System.out.println("child of P1 and P2");
	}
}

//MultipleInheritance Not supported directly via classes
public class MultipleInheritance {
	public static void main(String[] args) {
		Child1 child = new Child1();
		child.c1();
		child.p1();
		child.p1();

	}
}
