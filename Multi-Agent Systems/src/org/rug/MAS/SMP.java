/**
 * Package containing our final project for the Multi-Agent Systems course.
 */
package org.rug.MAS;

/*
 * Imports for input,
 */
import java.util.Scanner;
//import java.util.Arrays;
//import java.util.Collections;

/**
 * @author Diederik, Sebastiaan & Pieter
 *
 */
public class SMP {

	/**
	 * Shell for the stable marriage problem
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Shell for the stable marriage problem
		Scanner input = new Scanner(System.in);
		
		//TODO Initialization of the problem
		boolean init = true;	// True as long as initialization is still going on
		String in;				// Holder for input string
		int num;				// SMP n
		/*while (init) {
			System.out.println("For which n would you like to simulate the Stable Marriage Problem?");
			try {
				num = Integer.parseInt(input.next());
				if (num > 0 && num < 10) {
					num *= 2;	// To account for men and women
							System.out.println("Would you like to specify the people yourself (y/n)?");
							in = input.next();
							while (!(in.equals("y") || in.equals("n"))) {
								System.out.println("Please specify your input as 'y' or 'n'.");
								in = input.next();
							}
							if (in.equals("y")) {
								System.out.println("Specify a person as (name, gender)");
								while (num > 0) {
									System.out.println(num + " more to go...");
									in = input.next();
									while (/* in does not conform format *//*) {
										System.out.println("Please use the format (name, gender)");
										in = input.next();
									}
									num--;
									if (num == 0) {
										// Check whether there are just as many men as women
										// If not, reset num
									}
								}
							} else {
								// Randomly initialize people
							}
							System.out.println("Would you like to specify the preferences yourself (y/n)?");
							in = input.next();
							while (!(in.equals("y") || in.equals("n"))) {
								System.out.println("Please specify your input as 'y' or 'n'.");
								in = input.next();
							}
							//TODO handle initializing preferences
							init = false;
				} else {
					System.out.println("Please input an integer between 1 and 10.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please input an integer between 1 and 10.");
			}
		}*/
		num = 4;
		
		Model smp = new Model(num);
//		Man[] men = Initializer.initializeMen(num);
//		Woman[] women = Initializer.initializeWomen(num);
		
		//System.out.println(men[1].getName());
		//System.out.println(women[1].getName());
		
//		Person[] people = Initializer.initializePreferences(men, women); 
//		men = (Man[]) Initializer.initializePreferences(men, num);
//		women = (Woman[]) Initializer.initializePreferences(women, num);
		//String[] pref = men[1].getPreferences();
//		String Woman1 = people[5].name.toString();
//		System.out.println(Woman1);
		
//		Engagement[] rel=null;
//		for (int i = 0; i < num; i++) {
//			for (int j = num; j < people.length; j++) {
//				rel.engagement(people[i],people[j]);
//			}
//		}
		
		//System.out.print(pref[0]+pref[1]+pref[2]+pref[3]);
		
		//TODO Running the problem
		boolean terminate = false;	//whether or not to exit
		//TODO here the big for loop to rule them all
		while (!terminate) {
			// Or just a while loop to rule some of them...
			//TODO here step by step run of the model
			//TODO if stable match, terminate
			terminate = true;
		}
	}

}
