package cardGame;

public class CardGame {
    private int numberOfPlayer;
    private int numberOfCardsToDeal;

    public CardGame(int numberOfPlayer, int numberOfCardsToDeal){
        this.numberOfPlayer = numberOfPlayer;
        this.numberOfCardsToDeal = numberOfCardsToDeal;
    }

    public int getNumberOfPlayers() {
     return  numberOfPlayer;
    }

    public int getNumberOfCardsToDeal() {
        return numberOfCardsToDeal;
    }
}
