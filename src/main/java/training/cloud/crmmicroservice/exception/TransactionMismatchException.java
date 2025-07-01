package training.cloud.crmmicroservice.exception;

public class TransactionMismatchException extends RuntimeException{
    public TransactionMismatchException(String exception) {
        super(exception);
    }
}
