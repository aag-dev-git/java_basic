package operators;

public class BitwiseXOROperator {

	/*
	 * Certainly! The XOR (exclusive OR) operator in Java is represented by the ^
	 * symbol. It's a bitwise operator that performs a Boolean operation on each
	 * corresponding bit of two integer operands. Here's an explanation of how it
	 * works:
	 * 
	 * 1) Basic operation:
	 *    If the bits are different, the result is 1 
	 *    If the bits are the same, the result is 0
	 *    
	 * Truth table for XOR:
	 *  A | B | A ^ B
	 *	---------------
	 * 	0 | 0 |   0
	 *	0 | 1 |   1
	 *	1 | 0 |   1
	 *	1 | 1 |   0
	 */
	
	public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011
        
        int result = a ^ b;  // Binary: 0110 (which is 6 in decimal)
        
        System.out.println("a ^ b = " + result);
        
        // Using XOR for swapping variables
        int x = 10;
        int y = 20;
        
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
