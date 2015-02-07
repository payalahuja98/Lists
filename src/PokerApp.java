import java.util.Random;
public class PokerApp{
	public static void main(String[] args){
		final int HANDSIZE = 7;
		final int NUMHANDS = 1000000;
		int numPairs = 0;
		boolean isPair;
		float probability;
		RankCardDeck deck = new RankCardDeck();
		int card; 
		ListInterface<Integer> hand;
		
		for(int i = 0; i < NUMHANDS; i++){
			deck.shuffle();
			hand = new ArrayUnsortedList<Integer>();
			isPair = false;
			for(int j = 0; j < HANDSIZE; j++){
				card = deck.nextCard();
				if(hand.contains(card)){
					isPair = true;
				}
				hand.add(card);
			}
			if(isPair){
				numPairs++;
			}
		}
		System.out.println("There were " + numPairs + " hands out of " + NUMHANDS + " that had at least one pair of matched cards.");
		System.out.println("The probability of getting at least one pair is " + numPairs/(float)NUMHANDS);
	}
}