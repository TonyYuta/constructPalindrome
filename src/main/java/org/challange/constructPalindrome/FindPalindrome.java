/**
 *   File Name: FindPalindrome.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 22, 2018
 *   
 */

package org.challange.constructPalindrome;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * FindPalindrome 
 * Combine the biggest possible palindrome from 2 different words of text
 * 
 *   print out origin words and the palindrome separate by spaces
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class FindPalindrome {
		
	static TreeSet<String> palSet = new TreeSet<>();
	static TreeSet<String> palindSet = new TreeSet<>();
	static TreeSet<String> comb2WordsSet = new TreeSet<>();
	static TreeSet<String> comb2WordsOriginAndPalindrome = new TreeSet<>();
	static String text11 = "WASHINGTON — If the three-day government shutdown looked messy,  Eetnaraug:  the next three weeks could bring a congressional maelstrom.\n Monday’s breakthrough guaranteed two things, and only two things: That there will be another funding cliff on Feb. 8 and that the deeply contentious immigration debate will rage on. Grassland fires that are deadly and devastating events for many kinds of wildlife are a boon to certain types of birds known as fire foragers. These opportunists prey on animals fleeing from a blaze, or scavenge the remains of creatures that succumbed to the flames and the smoke.";	
	
	public static void main(String[] args) {
		System.out.println(findCombinedWordsPalindrome(modifyText(text11)));
	}

	static public String[] modifyText(String txt) {
		TreeSet<String> noDupl = new TreeSet<>();
		String modifiedWithDupl = txt.toLowerCase().replaceAll("[^A-Za-z0-9 ]", "");
		String[] words = modifiedWithDupl.split(" ");
		for(String word : words) {
			noDupl.add(word);
		}
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = noDupl.iterator();
		while(it.hasNext()) {
			sb.append(it.next()).append(" ");		
		}
		String modString = sb.toString().trim();
		String[] result = modString.split(" ");
		return result;
	}
	
	static String combine2Words(String word1, String word2) {
		return word1 + word2;
	}
	
	static String reverseString(String str) {
		StringBuffer revSb = new StringBuffer(str);
		return revSb.reverse().toString();
	}
	
	static TreeSet<String> findPalindrome(String inpText) {
		String[] wordsArr = inpText.split(" ");
		for(String word: wordsArr) {
			if(Objects.equals(word, reverseString(word))) {
				palSet.add(word);
			}
		}
		return palSet;
	}	
	
	static TreeSet<String> addPalindrome(String str) {
			if(Objects.equals(str, reverseString(str))) {
				palindSet.add(str);
				System.out.println("str: " + str);
			}
		return palindSet;
	}	
	
	static String findCombinedWordsPalindrome(String[] wordsArr) {
			for(int i = 0; i < wordsArr.length-1; i++) {
				for(int j = i+1; j < wordsArr.length; j++) {
					if(Objects.equals(combine2Words(wordsArr[i], wordsArr[j]), reverseString(combine2Words(wordsArr[i], wordsArr[j])))) {
						comb2WordsSet.add(combine2Words(wordsArr[i], wordsArr[j]));
						comb2WordsOriginAndPalindrome.add(wordsArr[i] + " " + wordsArr[j] + " " + combine2Words(wordsArr[i], wordsArr[j]));
					}				
				}	
			}	
			
			wordsArr = resortArray(wordsArr);
			
			for(int i = 0; i < wordsArr.length-1; i++) {
				for(int j = i+1; j < wordsArr.length; j++) {
					if(Objects.equals(combine2Words(wordsArr[i], wordsArr[j]), reverseString(combine2Words(wordsArr[i], wordsArr[j])))) {
						comb2WordsSet.add(combine2Words(wordsArr[i], wordsArr[j]));
						comb2WordsOriginAndPalindrome.add(wordsArr[i] + " " + wordsArr[j] + " " + combine2Words(wordsArr[i], wordsArr[j]));
					}				
				}	
			}		
			
		return longestWordFromSet(comb2WordsOriginAndPalindrome);
	}	
	
	static void printOutSet(TreeSet<String> set) {
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	static String[] resortArray(String[] arr) {
		String[] rev = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			rev[arr.length-1-i] = arr[i];
		}
		return rev;
	}
	
	static String longestWordFromSet(TreeSet<String> set) {
		String max = "";
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			max = it.next();
		}
		return max;
	}	
	
	
}
