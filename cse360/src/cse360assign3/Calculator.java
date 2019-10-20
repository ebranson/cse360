/*
 * Author: Eric Branson
 * Class: CSE360
 * Assignment 3
 * 
 * Calculator
 * Description:
 * This class inherits methods from the AddingMachine class and implements
 * several additional mathematical operations.  It tracks all changes to
 * the total and updates the current value.
 */


package cse360assign3;

import java.lang.Math;

public class Calculator extends AddingMachine{
	
	public void mult (int value) {
		total = total * value;
		history = history.concat("\n*" + value);
	}
	
	public void div (int value) {
		if(value == 0) {
			total = 0;
			history = history.concat("\n/0");
		}
		else {
			total = total / value;
			history = history.concat("\n/" + value);
		}
	}
	
	public void power (int value) {
		if(value < 0) {
			total = 0;
			history = history.concat("\n ^-x");
		}
		else {
			total = (int) Math.pow(total, value);
		}
	}
	
	/*
	//used to test the implementation

	public static void main(String args[]) {
		Calculator a1 = new Calculator();
		
		a1.add(5);
		a1.subtract(3);
		a1.mult(5);
		a1.div(2);
		a1.power(5);
		System.out.println("Current total: " + a1.total);
		a1.div(0);
		a1.power(-2);
		System.out.println(a1.toString());
		a1.clear();
		System.out.println(a1.toString());
	}*/
}
