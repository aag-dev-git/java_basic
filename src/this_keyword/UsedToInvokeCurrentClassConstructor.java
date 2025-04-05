package this_keyword;

class CurrentClass {
	CurrentClass() {
		System.out.println("Non parameterized constructor");
	}

	CurrentClass(int x) {
		this();// calling above constructor
		System.out.println("Parameterized constructor " + x);
	}

}

public class UsedToInvokeCurrentClassConstructor {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CurrentClass Cc = new CurrentClass(10);

	}
}