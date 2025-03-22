package core_concepts;

public class NumberLiterals {
	/*
	 * The underscores (_) are used for readability and can be placed anywhere in
	 * the numeric literal (except at the beginning or end). They do not affect the
	 * value of the number.
	 */
	public static void main(String[] args) {

//	int x = 123_456_789;
		int x = 0b1101_0101_0001_1010;
		System.out.println(x);

		double num = 9_423_497_862.0;
		System.out.println(num);
	}
}
