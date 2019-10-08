package cse360assign2;

public class AddingMachine {

	private int total;
	private String endString = " 0 ";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		endString = endString + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		endString = endString + " - " + value;
	}
		
	public String toString () {
		return endString;
	}

	public void clear() {
	endString = "";
	total = 0;
	}
}
