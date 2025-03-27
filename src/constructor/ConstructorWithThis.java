package constructor;

public class ConstructorWithThis {

	public static void main(String[] args) {
		Demo demo = new Demo(10, "string");
		demo.diplay();
	}
}

class Demo {
	int a;
	String str;

	// if we pass variables name same as declared then need to use this
	public Demo(int a, String str) {
		this.a = a;
		this.str = str;
	}

	public void diplay() {
		System.out.println(a + " " + str);
	}
}