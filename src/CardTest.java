
/**
 * @author Jacqui
 * I MADE THIS
 * SOMETHING SOMETHING MIT COPYRIGHT LAWS
 */
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Making our two card objects for testing
		Card bill = new Card("11", "Spades", 10);
		Card mark = new Card("11", "Spades", 10);
		Card denny = new Card("10", "Spades", 10);
		
		// Checking for if the cards are equal
		// In the if statement it refers to instance brad's method equals to output a boolean
		// Note: this would also work if it were bill.equals(mark)
		if (mark.matches(bill)){
			//if mark is the same as bill then we check for if it equals denny
			if (mark.matches(denny)){
				//if they all equal it tell us
				System.out.println("All these cards are the same");
				System.out.println("They are all "+mark);
			}
			else {
				//if not then mark only matches bill
				System.out.println("Two of the cards are the same, whereas one is not");
				System.out.println("Two of them are "+mark+" Whereas the other one is "+denny);
			}
		}
		//if mark does not match bill, then we know they cannot all be the same
		//so we don't need to include the if/else code within the if mark.matches(bill)\
		//checking if mark matches denny
		else if (mark.matches(denny)){
			System.out.println("Two of the cards are the same, whereas one is not");
			System.out.println("Two of them are "+mark+" Whereas the other one is "+bill);
		}
		
		//checking if bill matches denny
		else if (bill.matches(denny)){
			System.out.println("Two of the cards are the same, whereas one is not");
			System.out.println("Two of them are "+bill+" Whereas the other one is "+mark);
		}
		
		//if none of these works then they are all different
		else {
			System.out.println("These cards are not the same");
			System.out.println("One is "+mark+", the other is "+bill+" and the last one is "+denny);
		}
		System.out.println("");
		
		//Accessor testing
		//We are using the programmed accessors card.suit(), card.rank(), and card.pointValue()
		System.out.println("Testing accessors for all of these things");
		System.out.println("Card named Mark:");
		System.out.println("Rank = "+mark.rank()+" Suit = "+mark.suit()+" Point Value = "+mark.pointValue());
		System.out.println("Card named Bill:");
		System.out.println("Rank = "+bill.rank()+" Suit = "+bill.suit()+" Point Value = "+bill.pointValue());
		System.out.println("Card named Denny:");
		System.out.println("Rank = "+denny.rank()+" Suit = "+denny.suit()+" Point Value = "+denny.pointValue());
	}

}
