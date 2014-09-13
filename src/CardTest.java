
/**
 * @author Jacqui
 * I MADE THIS
 * SOMETHING SOMETHING MIT COPYRIGHT LAWS
 */
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Making our two card objects for testing
		Card bill = new Card("10", "Hearts", 10);
		Card brad = new Card("10", "Spades", 10);
		
		// Checking for if the cards are equal
		// In the if statement it refers to instance brad's method equals to output a boolean
		// Note: this would also work if it were bill.equals(brad)
		if (brad.equals(bill)){
			System.out.println("These cards are the same");
			System.out.println("They are both "+brad);
		}
		else {
			System.out.println("These cards are not the same");
			System.out.println("One is "+brad+" Whereas the other is "+bill);
		}
	}

}
