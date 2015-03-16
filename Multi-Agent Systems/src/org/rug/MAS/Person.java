/**
 * Package containing our final project for the Multi-Agent Systems course.
 */
package org.rug.MAS;

/**
 * @author Diederik, Sebastiaan & Pieter
 *
 */
public abstract class Person {

	/**
	 * Every person has a name.
	 */
	protected String name;
	
	/**
	 * A list of personal preferences, based on names.
	 */
	protected String[] preferences;
	
	/**
	 * States considered possible by this person.
	 */
	protected State[] states;
	
	/**
	 * Constructor of a person, called by super().
	 * 
	 * @param name
	 * @param preferences
	 * @param states
	 */
	public Person(String name, String[] preferences, State[] states) {
		this.name = name;
		this.preferences = preferences;
		this.states = states;
	}
	
	// Getters and setters
	public String getName() {
		return this.name;
	}
}
