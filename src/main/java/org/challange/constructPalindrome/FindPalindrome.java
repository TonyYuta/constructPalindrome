/**
 *   File Name: FindPalindrome.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 17, 2018
 *   
 */

package org.challange.constructPalindrome;

import java.util.ArrayList;
import java.util.Objects;

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
	
	ArrayList<String> palList = new ArrayList<>();
	
	String reverseString(String str) {
		boolean result = false;		
		StringBuffer revSb = new StringBuffer(str);
		return revSb.reverse().toString();
	}
	
	ArrayList<String> findPalindrome(String inpText) {
		String[] wordsArr = inpText.split(" ");
		for(String word: wordsArr) {
			if(Objects.equals(word, reverseString(word))) {
				palList.add(word);
			}
		}
System.out.println("palList.toString(): " + palList.toString());
		return palList;
	}
	
	
	
}
