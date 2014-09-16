/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		//Making String arrays for the type of card (Eg. King, 10, etc.)
		String[] rank1={"Ace"};
		String[] rank2={"Ace","2"};
		
		//Making a string array for the suit (Eg. Diamonds, Hearts, etc.)
		String[] suit={"Diamonds"};
		
		//Making integer arrays for the point value of each card, from 1-13
		int[] points1={1};
		int[] points2={1,2};
		
		//Creating three Deck objects, with inputs of two string arrays and one integer array
		Deck brad = new Deck(rank2,suit,points2);
		Deck bread = new Deck(rank1,suit,points1);
		Deck bland = new Deck(rank1,suit,points1);
		
		//Testing all methods for Deck Brad
		System.out.println("Testing Deck Brad");
		System.out.println("");
		//Testing the toString() method
		System.out.println(brad);
		//Testing the deal method
		brad.deal();
		System.out.println(brad); //We use the toString() method again to see the results
		//Testing the size accessor
		System.out.println("Deck brad's size is: "+brad.size());
		//Testing the isEmpty method
		if(brad.isEmpty()){
			System.out.println("Deck brad is empty"); //Just so that we can tell what is happening
			
		}
		else{
			System.out.println("Deck brad is not empty");
		}
		System.out.println("");
		
		/**
		 * Since we have three decks, we simply test all of them in the same way, 
		 * so you will notice that the code from here on is a repeat of the testing methods for
		 * deck Brad code
		 */
		
		//Testing all methods for Deck Bread
		System.out.println("Testing Deck Bread");
		System.out.println("");
		System.out.println(bread);
		bread.deal();
		System.out.println(bread);
		System.out.println("Deck bread's size is: "+bread.size());
		if(bread.isEmpty()){
			System.out.println("Deck bread is empty");
		}
		else{
			System.out.println("Deck bread is not empty");
		}
		System.out.println("");
		
		//Testing all methods for Deck Bland
		//This time we added in a third bland.deal(); and System.out.println(bland);
		//This is so that we can test dealing a card when the deck is empty
		System.out.println("Testing Deck Bland");
		System.out.println("");
		System.out.println(bland);
		bland.deal();
		System.out.println(bland);
		bland.deal();
		System.out.println(bland);
		System.out.println("Deck bland's size is: "+bland.size());
		if(bland.isEmpty()){
			System.out.println("Deck bland is empty");
		}
		else{
			System.out.println("Deck bland is not empty");
		}

	}
}
