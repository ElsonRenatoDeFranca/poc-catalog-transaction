package training.cloud.poc.microservice.exception;

public class CatalogNotFoundException extends RuntimeException{
    public CatalogNotFoundException(String exception) {
        super(exception);
    }
}
