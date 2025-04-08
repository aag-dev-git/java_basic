package operators;

public class OperatorsInJava {
	/*
	 * Java provides a wide range of operators. Here's a comprehensive overview of
	 * operators in Java, categorized by their functions:
	 * 
	 * Arithmetic Operators:
	 * Addition (+) Subtraction (-) Multiplication (*) Division (/) Modulus (%)
	 * Increment (++) Decrement (--)
	 *  
	 * Assignment Operators:
	 * Simple assignment (=) Add and assign (+=) Subtract and assign (-=) Multiply
	 * and assign (*=) Divide and assign (/=) Modulus and assign (%=)
	 * 
	 * Comparison (Relational) Operators:
	 * Equal to (==) Not equal to (!=) Greater than (>) Less than (<) Greater than
	 * or equal to (>=) Less than or equal to (<=)
	 * 
	 * Logical Operators:
	 * Logical AND (&&) Logical OR (||) Logical NOT (!)
	 * 
	 * Bitwise Operators:
	 * Bitwise AND (&) Bitwise OR (|) Bitwise XOR (^) Bitwise NOT (~) Left shift
	 * (<<) Signed right shift (>>) Unsigned right shift (>>>)
	 * 
	 * Ternary Operator:
	 * Conditional (?:)
	 * 
	 * instanceof Operator:
	 * Used to test if an object is an instance of a specific class or interface
	 */
	
	public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("PostIncrement a++ = " + (a++));
        System.out.println("PreIncrement ++b = " + (++b));

        // Assignment Operators
        int c = 5;
        System.out.println("\nAssignment Operators:");
        System.out.println("c += 3: " + (c += 3));
        System.out.println("c -= 2: " + (c -= 2));

        // Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
        System.out.println("~m: " + (~m));
        System.out.println("m << 1: " + (m << 1));
        System.out.println("m >> 1: " + (m >> 1));

        // Ternary Operator
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nTernary Operator:");
        System.out.println("Status: " + status);

        //Hexadecimal number
        int num= 0xAB; // 15*16>0 + 15*16>1
        System.out.println(num);
        
        // Instanceof Operator
        String str = "Hello";
        System.out.println("\ninstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));
    }
	
	
}
