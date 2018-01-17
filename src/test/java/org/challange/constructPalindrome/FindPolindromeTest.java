/**
 *   File Name: FindPolindromeTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 17, 2018
 *   
 */

package org.challange.constructPalindrome;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * FindPolindromeTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class FindPolindromeTest {
	
	FindPalindrome fp;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		fp = new FindPalindrome();
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "reverse", "bat", "regression", "all"}, priority = 0)
	public void testReverseString() {
		String origin = "Inspired";
		String expected = "deripsnI";
		Assert.assertEquals(fp.reverseString(origin), expected, "reversed string doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "bat", "findpalindrome", "all"}, priority = 1)
	public void testFindPalindrome() {
		String origin = "me lol killa molli pop myasym";
		String expected = "[lol, pop]";
		Assert.assertEquals(fp.findPalindrome(origin).toString(), expected, "List palindromes doesn't match to expected");
		
	}
	
	
}
