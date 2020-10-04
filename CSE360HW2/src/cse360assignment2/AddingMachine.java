package cse360assignment2;

public class AddingMachine {
	private int total;
	private String history;
	
	/**
	 *   Initializes the total variable to 0 and the history variable to "0"
	 */
	public AddingMachine () {
		history = "0";
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total variable
	 * @return Returns the total variable
	 */
	public int getTotal () {
		
	  return total;
	}
	
	/**
	 *   Adds the parameter to the total variable and adds the transaction to the history string.
	 * @param value adds the parameter to the total variable
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the parameter from the total variable and adds the transaction to the history string.
	 * @param value subtracts the parameter from the total variable
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}

	/**
	 *  @return Returns a history of the transactions in a string format
	 */
	public String toString () {
		
	  return history;
	}
	
	/**
	 * Clears the memory by restting the history and total value
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
}
