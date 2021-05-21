package cardGame;

public class DeckOfCard {
    private int lastPushLocation = -1;
    private Card[] cards;
    public DeckOfCard(int numberOfCards){
       cards = new Card[numberOfCards];
    }


    public int getSize() {
        return cards.length;
    }

    public void push(Card card) {
        lastPushLocation++;
        cards[lastPushLocation] = card;
    }

    public Card peek() {
        return cards[lastPushLocation];
    }

    public Card pop() {
        if (isEmpty()) throw new StackUnderflowException("Card stack is empty");
     return cards[lastPushLocation--];

    }

    public boolean isEmpty() {
        return lastPushLocation == -1;
    }
}
