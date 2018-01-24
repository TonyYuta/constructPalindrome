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
	Data data;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		fp = new FindPalindrome();
		data = new Data();
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "combine", "bat", "findpalindrome", "all"}, priority = 1)
	public void test006findBackwardCombinedWordsPalindrome() {
		String[] origin = data.modifyText(data.getText04());
		String expected = "[meem]";
		Assert.assertEquals(fp.findCombinedWordsPalindrome(origin).toString(), expected, "List combined palindromes doesn't match to expected");
	}

	@Test(enabled = true, groups = {"palindrome", "string", "combine", "bat", "findpalindrome", "all"}, priority = 1)
	public void test007findForwardCombinedWordsResortedPalindrome() {
		String[] origin = data.modifyText(data.getText04());
		String expected = "usatat asu usatatasu";
		Assert.assertEquals(fp.findCombinedWordsPalindrome(origin).toString(), expected, "List combined palindromes doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "combine", "bat", "findpalindrome", "all"}, priority = 1)
	public void test008findForwardCombinedWordsResortedPalindrome() {
		String[] origin = data.modifyText(data.getText03());
		String expected = "asutot usa asutotusa";
		Assert.assertEquals(fp.findCombinedWordsPalindrome(origin).toString(), expected, "List combined palindromes doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "combine", "bat", "findpalindrome", "all"}, priority = 1)
	public void test009findForwardCombinedWordsResortedPalindrome() {
		String[] origin = data.modifyText(data.getText01());
		String expected = "we new wenew";
		Assert.assertEquals(fp.findCombinedWordsPalindrome(origin).toString(), expected, "List combined palindromes doesn't match to expected");
	}
	
	
}
