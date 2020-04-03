package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which
	 * order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the
	 * boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		input = input.toLowerCase();
		if (input.contains("cei")) {
			return true;
		}
		if (input.contains("ie")) {
			if (input.contains("cie")) {
				return false;
			}
			return true;
		}
		return false;
	}
}
