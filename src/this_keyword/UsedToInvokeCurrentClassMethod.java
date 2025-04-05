package this_keyword;

class Subject {
	void sub1() {
		System.out.println("Subject  Math");
	}

	void stream() {
		System.out.println("Stream Science");
		this.sub1();
	}
}

public class UsedToInvokeCurrentClassMethod {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.stream();
	}
}