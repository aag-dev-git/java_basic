package core_concepts;

import java.util.Arrays;

public class SwitchStatement {
	public static void main(String[] args) {

		boolean show = show(5);
		System.out.println(show);

	}

	private static boolean show(int iRange) {

		// from jdk 7 will use String in switch
		switch (iRange) {

		case 2: {
			System.out.println("True");
			return true;

		}
		// Duplicate Case not allowed
//	case 2: {
//		System.out.println("True");
//		break;
//
//	}

		case 5: {
			System.out.println("Demo ");
		}
			int[] a = new int[10];
			a[0] = 10;
			System.out.println(Arrays.toString(a));
			System.out.println("Is True");
			break; // Break is optional

		default:
			System.out.println("Default");

		}
		return false;
	}
}
