/*
 * Sub class of assignment 2    
 */

public class Assign2a {
	private int numInt;
	private boolean detect;

	public Assign2a(int num) {
		numInt = num;
	}

	public void display() {
		
		detect = true ;
		for (int i = 2; i < numInt; i++) {
			if (numInt % i == 0) {
				detect = false;
				break;
			}

		}

		if (detect == false) {
			System.out.println(numInt + " is not a prime number ");
		} else {
			System.out.println(numInt + " is a prime number ");
		}
	}

}
