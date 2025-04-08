package operators;

public class BitwiseLeftAndRightShiftOperator {
	/*
	 * 1) Left Shift Operator (<<)
	 * 
	 * The left shift operator shifts all bits towards the left by a certain number
	 * of specified positions. It's equivalent to multiplying the number by 2 raised
	 * to the power of the right operand. Syntax: number << n
	 * 
	 * 2) Signed Right Shift Operator (>>)
	 * 
	 * The signed right shift operator shifts all bits towards the right by a
	 * certain number of specified positions. For positive numbers, it's equivalent
	 * to dividing the number by 2 raised to the power of the right operand.
	 * Syntax:number >> n
	 * 
	 * 3) Unsigned Right Shift Operator (>>>)
	 * 
	 * The unsigned right shift operator shifts all bits towards the right by a
	 * certain number of specified positions. It always fills the leftmost positions
	 * with zeros. Syntax: number >>> n
	 * 
	 * Key points to remember:
	 *  -> Left shift (<<) is equivalent to multiplication by powers of 2. 
	 *  -> Right shift(>>) is equivalent to division by powers of 2 for positive numbers. 
	 *  -> For negative numbers, >> preserves the sign bit, while >>> doesn't. 
	 *  -> These operators are often used for efficient multiplication or division by powers
	 *     of 2, or for manipulating bits in various algorithms.
	 */
	
	public static void main(String[] args) {
        int num = 200;
        
        System.out.println("Original number: " + num);
        System.out.println("Binary representation: " + Integer.toBinaryString(num));
        
        // Left Shift
        int leftShift = num << 2;
        System.out.println("\nLeft Shift (<<2): " + leftShift);
        System.out.println("Binary: " + Integer.toBinaryString(leftShift));
        
        // Signed Right Shift
        int rightShift = num >> 2;
        System.out.println("\nSigned Right Shift (>>2): " + rightShift);
        System.out.println("Binary: " + Integer.toBinaryString(rightShift));
        
        // Unsigned Right Shift
        int unsignedRightShift = num >>> 2;
        System.out.println("\nUnsigned Right Shift (>>>2): " + unsignedRightShift);
        System.out.println("Binary: " + Integer.toBinaryString(unsignedRightShift));
        
        // Demonstrating with negative number
        int negNum = -20;
        System.out.println("\nNegative number: " + negNum);
        System.out.println("Binary representation: " + Integer.toBinaryString(negNum));
        
        int negRightShift = negNum >> 2;
        System.out.println("\nSigned Right Shift (>>2): " + negRightShift);
        System.out.println("Binary: " + Integer.toBinaryString(negRightShift));
        
        int negUnsignedRightShift = negNum >>> 2;
        System.out.println("\nUnsigned Right Shift (>>>2): " + negUnsignedRightShift);
        System.out.println("Binary: " + Integer.toBinaryString(negUnsignedRightShift));
    }
}
