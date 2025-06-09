package features.java_8;

import java.util.StringJoiner;

public class StringJoinerClass {
	/*
	 * Java added a new final class StringJoiner in java.util package. It is used to
	 * construct a sequence of characters separated by a delimiter. Now, you can
	 * create string by passing delimiters like comma(,), hyphen(-) etc. You can
	 * also pass prefix and suffix to the char sequence.
	 */
	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner(",");
		sj.add("Ram");
		sj.add("Sham");
		sj.add("Aam");

		System.out.println(sj);

	}

}
