/**
 * Package containing our final project for the Multi-Agent Systems course.
 */
package org.rug.MAS;

/*
 * Imports for input, data structures
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * The one loop to rule them all...
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
		num = 2;
		
		Model smp = new Model(num);
		
		Controller ctrl = new Controller(smp);
				
		/*
		Set<ArrayList<State>> s = new LinkedHashSet<ArrayList<State>>(smp.getStates());
		Set<State> t = new HashSet<State>();
	    Iterator<ArrayList<State>> itr = s.iterator();
		while (itr.hasNext()){
		      t.addAll(itr.next());
		}
		s.clear();
		//List<String> list = new ArrayList<String>(hash);
		for (int i = 0; i < t.size(); i++) {
			s.add(t[i]);
		}
		ArrayList<ArrayList<State>> layer = new ArrayList<ArrayList<State>>(s); //remove duplicates */
		
		System.out.print("smp: "+smp.getStates().size()+"\n");

		ArrayList<ArrayList<State>> layer = smp.getStates();
		Iterator<ArrayList<State>> iterator = layer.iterator();
		while(iterator.hasNext()){
			/*ArrayList<State> temp = iterator.next();
			Set<State> temp2 = new LinkedHashSet<State>(temp);
			ArrayList<State> states = new ArrayList<State>(temp2);
			ArrayList<State> states = new ArrayList<State>(new LinkedHashSet<State>(temp));
			 */
			ArrayList<State> temp = iterator.next();
			ArrayList<State> states = new ArrayList<State>(new LinkedHashSet<State>(temp));
			//ArrayList<State> states = iterator.next();
			System.out.print("layer: "+states.size()+"\n");
			Iterator<State> state = states.iterator();
	        while(state.hasNext()){
	        	
	        	//System.out.println(state.next());
	        	state.next();
	        }
	        System.out.print("next!\n");
		}
		
		ctrl.runSimulation();	// Run the hard-coded simulation
		
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
