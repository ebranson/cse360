/*
 * Author: Eric Branson
 * Class: CSE360
 * Assignment 1
 * 
 * Description:
 * This class implements the Palindrome method.
 * The method takes in a string as input and checks
 * to see wether or not it is a palindrome.  Returns
 * true if it is, false if its not.
 */


package assign1;

/**
 * This class contains the Palindrome function, which is used to chekc if a string is a plaindrome
 * @author ebran
 *
 */

public class Palindrome {

	//required variables
	
	static boolean isPalindrome = true;
	private String testString;
	
	/**
	 * takes testString as input and checks to see
	 * if it is a palindrome or not. Returns true if
	 * it is, and false if it's not.
	 * 
	 * @param testString
	 * @return
	 */
	
	public static boolean Palindrome(String testString) {
		
		testString = testString.replaceAll("[^a-zA-Z0-9]", "");
		
		int ii = 0;
		int jj = testString.length() - 1;
		
		while (isPalindrome && jj != ii) {
			if (testString.charAt(ii) != testString.charAt(jj)) {
				isPalindrome = false;
			}
			else {
				ii++;
				jj--;
			}
		}
	return isPalindrome;
	}
}
