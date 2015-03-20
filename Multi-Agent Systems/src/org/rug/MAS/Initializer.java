/**
 * Package containing our final project for the Multi-Agent Systems course.
 */
package org.rug.MAS;

import java.util.Arrays;
import java.util.Collections;

/**
 * Initializer contains methods for the random initialization of an SMP.
 * @author Diederik, Sebastiaan, Pieter
 *
 */
public class Initializer {

	/**
	 * All 'random' names.
	 */
	private static String[] namesWomen = {"Alice", "Beatrice", "Cleopatra", "Eve"};
	private static String[] namesMen = {"Willy", "Yannick", "Xerxes", "Zorro"};
	
	/**
	 * Initializes n men.
	 * @param n
	 * @return n randomly initialized men.
	 */
	public static Man[] initializeMen(int n) {
		//TODO Something to initialize men.
		Man[] men= new Man[4];
		for (int i = 0; i < n; i++) {
			men[i] = new Man(namesMen[i]);
		}
		return men;		
	}

	/**
	 * Initializes n women.
	 * @param n
	 * @return n randomly initialized women.
	 */
	public static Woman[] initializeWomen(int n) {
		//TODO Something to initialize women.
		Woman[] women = new Woman[4];
		for (int i = 0; i < n; i++) {
			women[i] = new Woman(namesWomen[i]);
		}
		return women;
	}
	
	/**
	 * Randomly initializes preferences of all people.
	 * @param people
	 * @return All people with randomized preferences.
	 */
	public static Person[] initializePreferences(Person[] people, int n) {
		//TODO Something to initialize preferences.
		if (people[0] instanceof Man) {
			for (int i = 0; i < n; i++) {
				String[] shuffle = namesWomen;
				Collections.shuffle(Arrays.asList(shuffle));
				people[i] = new Man(people[i].getName(), shuffle); 
			}
			return people;
		}else{
			for (int i = 0; i < n; i++) {
				String[] shuffle = namesMen;
				Collections.shuffle(Arrays.asList(shuffle));
				people[i] = new Woman(people[i].getName(), shuffle); 
			}
			return people;
		}
	}
	
	public static State[] initializeStates(Man[] men, Woman[] women){
		//TODO initialize possible states
		for (int i = 0; i < men.length; i++) {
			for (int j = 0; j < women.length; j++) {
				Engagement.Engagement(men[i], women[j]);
			}
			
		}
		return states
	}
}
