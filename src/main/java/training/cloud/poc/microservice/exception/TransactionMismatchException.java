package training.cloud.poc.microservice.exception;

public class TransactionMismatchException extends RuntimeException{
    public TransactionMismatchException(String exception) {
        super(exception);
    }
}
