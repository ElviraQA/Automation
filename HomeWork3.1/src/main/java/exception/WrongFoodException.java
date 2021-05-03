package exception;

public class WrongFoodException extends Exception {
    public WrongFoodException() {
        super(String.format("Еда не подходит для животного"));
    }
}
