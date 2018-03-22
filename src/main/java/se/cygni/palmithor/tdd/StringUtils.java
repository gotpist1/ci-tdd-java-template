package se.cygni.palmithor.tdd;

import java.util.stream.IntStream;

public class StringUtils {

	public boolean isPalindrome(final String str) {
		if(str != null) {
		String temp  = str.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0, temp.length() / 2)
	      .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
		}
		return false;
	}

	/**
	 * Checks if a String is empty (""), null or whitespace only.
	 * 
	 * @param str
	 *            the string to check
	 *
	 * @return true if str is null, empty or whitespace only, otherwise false
	 */
	public boolean isBlank(final String str) {
		return str == null || str.trim().length() == 0;
	}
}
