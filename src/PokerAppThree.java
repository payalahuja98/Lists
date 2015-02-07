public class PokerAppThree{
	public static void main(String[] args){
		final int HANDSIZE = 7;
		final int NUMHANDS = 1000000;
		int numTriples = 0;
		boolean isTriple;
		float probability;
		
		ListInterface<Integer> hand;
		RankCardDeck deck = new RankCardDeck();
		int card1;
		int card2 = 0;
	  for(int j = 0; j < NUMHANDS; j++){
		deck.shuffle();
		hand = new ArrayUnsortedList<Integer>(HANDSIZE);
		isTriple = false;
		
		for(int i = 0; i < HANDSIZE; i++){
			card1 = deck.nextCard();
			if(hand.contains(card1)){
				card2 = deck.nextCard();
				if(hand.contains(card2)){
					isTriple = true;
				}
			}
			hand.add(card1);
			hand.add(card2);

		}
		if(isTriple){
			numTriples++;
		}
	  }
		probability = numTriples/(float)NUMHANDS;
		System.out.println("There were " + numTriples + " hands out of " + NUMHANDS);
		System.out.println(" that had at least one triple");
		System.out.println("The probability of getting at least one triple");
		System.out.println(" based on this simulation is ");
		System.out.println(probability);
		
		
	}
}

