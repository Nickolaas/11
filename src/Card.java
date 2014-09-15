
/**
 * @author Jacqui
 * BLAH BLAH MIT COPYRIGHT RULES
 * I made this and its pretty cool
 * NOTE: I made this from scratch so it might
 * be different from the template
 */
public class Card {
	
	//Creating the private variables rank, suit, and points
	private String rank;
	private String suit;
	private int pointValue;
	
	//Constructor of card with input of rank, suit, and points
	public Card(String _rank, String _suit, int _points){
		//Assigning these values to the variables
		this.rank = _rank;
		this.suit = _suit;
		this.pointValue = _points;
	}
	
	//Accessors for rank, suit, and points
	public String rank() {
		return rank;
	}
	public String suit() {
		return suit;
	}
	public int pointValue() {
		return points;
	}
	
	//An equals method to check if this card and another are the same
	//Outputs either a boolean equaling true if the are the same, if not
	//It will output a false
	public boolean matches(Card _otherCard){
		if (this.rank == _otherCard.rank){
			if (this.suit == _otherCard.suit){
				if(this.points == _otherCard.pointValue){
					return true;
				}
			}
		}
		else{
			return false;
		}
		return false;
	}
	
	// A toString() method that prints:
	// [rank] of [suit] (Point Value = [Points]), where the things
	// In brackets are the variables of that name
	@Override
	public String toString(){
		return this.rank+" of "+this.suit+" (Point Value = "+this.pointValue+")";
	}
}
