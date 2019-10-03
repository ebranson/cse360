package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test		//test case for known palindrome
	void testPalindrome1() {
		String inputTestString1 = "racecar";		//test case for simple palindrome
		assertTrue(Palindrome.Palindrome(inputTestString1));
	}	
	
	@Test
	void testPalindrome2() {
		String inputTestString2 = "race car!";		//test case for stripping whitespace and special characters
		assertTrue(Palindrome.Palindrome(inputTestString2));
	}
	
	@Test
	void testPalindrome3() {

		String inputTestString3 = "abcdef";         //test case for not palindrome
		assertFalse(Palindrome.Palindrome(inputTestString3));
	}

}
