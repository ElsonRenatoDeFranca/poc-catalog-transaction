package training.cloud.crmmicroservice.exception;

public class CatalogNotFoundException extends RuntimeException{
    public CatalogNotFoundException(String exception) {
        super(exception);
    }
}
