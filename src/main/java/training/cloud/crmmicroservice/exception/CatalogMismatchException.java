package training.cloud.crmmicroservice.exception;

public class CatalogMismatchException extends RuntimeException{
    public CatalogMismatchException(String exception) {
        super(exception);
    }
}
