
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
		Card mark = new Card("10", "Spades", 10);
		Card denny = new Card("10", "Spades", 10);
		
		// Checking for if the cards are equal
		// In the if statement it refers to instance brad's method equals to output a boolean
		// Note: this would also work if it were bill.equals(brad)
		if (mark.equals(bill)){
			if (mark.equals(denny)){
			System.out.println("All these cards are the same");
			System.out.println("They are all "+mark);
			}
			else {
			System.out.println("Two of the cards are the same, whereas one is not");
			System.out.println("Two of them are "+mark+" Whereas the other one is "+denny);
			}
		}
		if (mark.equals(denny)){
			System.out.println("Two of the cards are the same, whereas one is not");
			System.out.println("Two of them are "+mark+" Whereas the other one is "+bill);
		}
		if (bill.equals(denny)){
			System.out.println("Two of the cards are the same, whereas one is not");
			System.out.println("Two of them are "+bill+" Whereas the other one is "+mark);
		}
		else {
			System.out.println("These cards are not the same");
			System.out.println("One is "+mark+", the other is "+bill" and the last one is "+denny);
		}

	}

}
