package cardGame.Exception;

public class InvalidCardValueException extends RuntimeException{
    public InvalidCardValueException(String message){
        super(message);
    }
}
