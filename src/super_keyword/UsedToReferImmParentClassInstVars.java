package super_keyword;

/* We can use super keyword to access the data member or 
 * field of parent class. It is used if parent class and child
 * class have same field.
 * */
class Vision {
	String target = "My vision";
}

class Mission extends Vision {
	String target = "My mission";

	void display() {
		System.out.println(target);
		System.out.println(super.target);
	}
}

public class UsedToReferImmParentClassInstVars {
	public static void main(String[] args) {
		Mission m = new Mission();
		m.display();
	}
}