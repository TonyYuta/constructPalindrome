/**
 *   File Name: FindPalindrome.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 17, 2018
 *   
 */

package org.challange.constructPalindrome;


/**
 * FindPalindrome //ADDD (description of class)
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
public class FindPalindrome {
	
	String reverseString(String str) {
		boolean result = false;
	//	String reverse;
		
		StringBuffer revSb = new StringBuffer(str);
		//reverse = revSb.reverse().toString();
		return revSb.reverse().toString();
	}
	
}
