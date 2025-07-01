package training.cloud.poc.microservice.exception;

public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException(String exception) {
        super(exception);
    }
}
