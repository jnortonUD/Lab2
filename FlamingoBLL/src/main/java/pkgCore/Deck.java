package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();	
	
	public Deck (int nDecks) {
		
		for(int i = 0;i < nDecks; i++) {
			
			for(eSuit eSuit:eSuit.values()) {
				
				for(eRank eRank:eRank.values()) {
					
					cards.add(new Card(eRank, eSuit));
				}
			}
		}
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
