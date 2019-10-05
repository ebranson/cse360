package assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	
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