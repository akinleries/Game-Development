//package cardGame;
//
//import cardGame.Exception.InvalidCardValueException;
//
//public class Card {
//    private final int value;
//    private final Suit suit;
//
//    public Card(Suit suit, int value) {
//        if (value < 1 || value > 13){
//            throw new InvalidCardValueException(value + "its not a valid card value");
//        }
//        this.value = value;
//        this.suit = suit;
//    }
//
//    public Suit getSuit() {
//        return suit;
//    }
//
//    public String getValue() {
//        return switch (this.value) {
//            case 1 -> "Ace";
//            case 11 -> "jack";
//            case 12 -> "Queen";
//            case 13 -> "King";
//            default -> "" + value;
//
//        };
//    }
//}
