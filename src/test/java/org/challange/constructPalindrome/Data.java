/**
 *   File Name: Data.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 17, 2018
 *   
 */

package org.challange.constructPalindrome;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Data //ADDD (description of class)
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
public class Data {
	
	private String text01 = " Not everyone has passion. Not everyone is moved emotionally by what they do. And, that’s extremely unfortunate. But fortunately, you are not like everyone else.\n" + 
			"The winning organizations in every industry are filled with passionate, vocal, active people (also, we have more fun doing what we do). To us, it isn’t even really ‘work’ in the sense that it flows naturally and feels more like creative freedom.\n" + 
			"I think that truly passionate people are not understood by much of the world. I’ll give you one example: I don’t watch TV anymore. I tell people this, and it feels like many of them mentally file me in a category of being weird or socially deviant. Most people cannot fathom a world without television.\n" + 
			"This is unfortunate, and altogether sad. We are at such an incredible turning point in society, and the world is changing for the better due to people with passion. Think about this:\n" + 
			"If you take Wikipedia as a kind of unit, all of Wikipedia, the whole project–every page, every edit, every talk page, every line of code, in every language that Wikipedia exists in–that represents something like the cumulation of 100 million hours of human thought. I worked this out with Martin Wattenberg at IBM; it’s a back-of-the-envelope calculation, but it’s the right order of magnitude, about 100 million hours of thought.\n" + 
			"And television watching? Two hundred billion hours, in the U.S. alone, every year. Put another way, now that we have a unit, that’s 2,000 Wikipedia projects a year spent watching television. Or put still another way, in the U.S., we spend 100 million hours every weekend, just watching the ads. This is a pretty big surplus. People asking, “Where do they find the time?” when they’re looking at things like Wikipedia don’t understand how tiny that entire project is, as a carve-out of this asset that’s finally being dragged into what Tim calls an architecture of participation.\n" + 
			"The world is shifting, and where before intellectuals used to be isolated and work on projects in a vacuum, now new social tools are allowing them to work together on deep projects that benefit everyone. Imagine, a group of complete strangers working together to create something incredible, inspiring and useful – all for free, and all due to pure internal motivation and desire to help the world.\n" + 
			"Are you a part of a global project like Wikipedia? Or, global conversations about what you do professionally or are interested in personally? If not, you should be – the tools exist to interact with fantastic minds in our world, learn from them, and get better results and get inspiration for whatever you are doing.\n" + 
			"Sorry if you’re a TV watcher, but if you watch even more than a tiny amount, it is a waste of life. I don’t mean to offend you, but really think about it: you are given a fleeting amount of time to physically exist on this planet and do something to change things for the better, and then you are gone. By watching TV for endless hours, you’re squandering life, the most previous gift there is.\n" + 
			"By watching TV you make the ultimate sacrifice – you idepiKiw could be reading, writing, making art, or actually interacting with your friends, family and other professionals in your industry. Would you rather look back at a life spent passively absorbing nonsense, or one spent changing the world for the better and creating what inspires you. The choice is obvious.\n" + 
			"I feel like most of you here don’t waste your life passively, so this post isn’t really for you. You’re already motivated and inspired. Forward this to a friend who isn’t.\n" + 
			"Here’s what too many in society do:\n" + 
			"Get up in the morning\n" + 
			"Work, thinking inside the lines the entire day\n" + 
			"Come home\n" + 
			"Watch TV\n" + 
			"Sleep\n" + 
			"It is an altogether unremarkable existence. And, those people probably produce ultimately unremarkable results and lead average lives.\n" + 
			"If you wake up in the morning and aren’t inspired every day to throw yourself into your work and life with 100% passion, you’re not living it. I don’t understand how someone can live even one day like this.\n" + 
			"Perhaps they’re in the wrong field, or have lost that creative spark. But regardless, there is no other way for truly intelligent people to live other than taking an active, passionate role in life and pouring their soul into something that inspires them.\n" + 
			"The planet is billions of years old, and your lifespan is merely a cosmic blink. There’s not a day to waste. ";

	private String text02 = "as Om O op, Op, Po, PO mo po op op Sk ks ko sa, lo. O, po? Ol lkh";
	private String text03 = "usa ust Asutot ii sa, kjd, gght";
	private String text04 = "yyss iioo usatat asu vi sa, usa ppooppiv kjd, gght";
	private String text05 = "sah aS, kgjd, l. ii, hasof gght. Fo. pod";
	private String text06 = "ab mn st ts nm ba oo";	// ab ba mn nm oo st ts  
	private String text07 = "nm mn st ts ta at oo";	// at mn nm oo st ta ts   
	private String text08 = "ab ba mn nm oo st ts ";	//  no
	private String text09 = "at mn nm oo st ta ts";	//  yes
	private String text10 = "uio rew at mn nm oo";	//  5: mnnm nmmn mnoonm nmoonm oo
	private String text11 = "ta cicovv bbc vvo atipoikiopi  mn nm ovacbb ita at ta pp ta mnip w inm";	//  yes

	
	/**
	 * @return the text01
	 */
	public String getText01() {
		return text01;
	}
	
	public String getText02() {
		return text02;
	}
	
	public String getText03() {
		return text03;
	}
	
	public String getText04() {
		return text04;
	}
	
	public String getText05() {
		return text05;
	}
	
	public String getText06() {
		return text06;
	}
	
	public String getText07() {
		return text07;
	}

	public String getText08() {
		return text08;
	}
	
	public String getText09() {
		return text09;
	}
	
	public String getText10() {
		return text10;
	}

	public String getText11() {
		return text11;
	}
	
	/**
	 * @param txt
	 * @return String[]: 
	 * 1) to lower case
	 * 2) remove all non alphabetical but leave spaces
	 * 3) remove duplicates
	 */
	public String[] modifyText(String txt) {
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
	
}
