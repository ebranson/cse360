/*
 * Author: Eric Branson
 * Class: CSE360
 * Assignment 3
 * 
 * AddingMachine
 * Description:
 * This class instantiates an AddingMachine object initialized with total 0;
 * It tracks several mathematical operations and the values associated with
 * them.  Every operation modifies the total and tracks the changes to be 
 * returned later.
 */


package cse360assign3;

public class AddingMachine {

	protected int total;
	protected String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * returns the total number being tracked by the AddingMachine
	 * @return
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * takes an input value and adds it to the total then updates the history
	 * @param value
	 */
	
	public void add (int value) {
		total = total + value;
		history = history.concat("\n+" + value);
	}
	
	/**
	 * takes an input value and subtracts it from the total then updates the history
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		history = history.concat("\n-" + value);
	}
		
	/**
	 * tracks the total operation history of the AddingMachine
	 */
	
	public String toString () {
		return history;
	}

	/**
	 * clears all current operations of the AddingMachine
	 */
	
	public void clear() {
		total = 0;
		history = "0";	
	}

/*
//used to test the implementation

public static void main(String args[]) {
	AddingMachine a1 = new AddingMachine();
	
	a1.add(5);
	a1.subtract(3);
	System.out.println(a1.toString());
	a1.clear();
	System.out.println(a1.toString());
}*/
}