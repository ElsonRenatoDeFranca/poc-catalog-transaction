package training.cloud.poc.microservice.exception;

public class CatalogMismatchException extends RuntimeException{
    public CatalogMismatchException(String exception) {
        super(exception);
    }
}
