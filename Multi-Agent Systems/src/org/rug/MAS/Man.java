/**
 * Package containing our final project for the Multi-Agent Systems course.
 */
package org.rug.MAS;

/**
 * @author Diederik, Sebastiaan & Pieter
 *
 */
public class Man extends Person {

	/**
	 * Constructor for a man.
	 */
	public Man(String name, String[] pref, State[] states) {
		// TODO Auto-generated constructor stub
		super(name, pref, states);
		this.preferences.counter = 0;
	}
	
	public Man(String name, String[] pref) {
		// TODO Auto-generated constructor stub
		super(name, pref);
		this.preferences.counter = 0;
	}
	
	public Man(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	

}
