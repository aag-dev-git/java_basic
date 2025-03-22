package core_concepts;

public class LabledBlocks {

	/*
	 * A label in Java is an identifier followed by a colon (:) that can be
	 * associated with loops or blocks of code. This allows you to specify which
	 * loop or block to break from or continue to when using the break or continue
	 * statements.
	 */

	public static void main(String[] args) {
		outerLoop: for (int i = 0; i < 4; i++) {
			innerLoop: {
				for (int j = 0; j < 4; j++) {
					if (i == 2 && j == 2) {
						break innerLoop; // Exits the outer loop
					}
					if (i == 1 && j == 1) {
						continue outerLoop;
					}
					System.out.println("i: " + i + ", j: " + j);
				}
				System.out.println("Outer loop");
			}
		}

	}
}
