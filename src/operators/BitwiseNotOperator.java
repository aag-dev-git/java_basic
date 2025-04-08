package operators;

public class BitwiseNotOperator {
	/*
	 * The NOT operator, represented by the tilde (~) symbol, is a unary operator
	 * that inverts all the bits of its operand. In other words, it changes every 0
	 * to 1 and every 1 to 0 in the binary representation of the number. Here's a
	 * detailed explanation:
	 * 
	 * Basic Operation: For any bit x: ~x = 1 if x = 0, and ~x = 0 if x = 1 Example
	 * in Binary: For an 8-bit number: 5 = 00000101 ~5 = 11111010
	 */
	public static void main(String[] args) {
		int a = 5;
		int result = ~a;

		System.out.println("a = " + a);
		System.out.println("~a = " + result);

		// Binary representation
		System.out.println("Binary of a:  " + Integer.toBinaryString(a));
		System.out.println("Binary of ~a: " + Integer.toBinaryString(result));
	}
}
