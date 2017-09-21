package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	
	private eRank eRank;
	private eSuit eSuit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit

	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	public eRank geteRank() {
		return eRank;
	}
	
	private void SetERank(eRank eRank) {
		this.eRank = eRank;
	}
	
	public eSuit geteSuit() {
		return eSuit;
	}
	
	private void SetESuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	
	public Card(eRank eRank, eSuit eSuit) {
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
