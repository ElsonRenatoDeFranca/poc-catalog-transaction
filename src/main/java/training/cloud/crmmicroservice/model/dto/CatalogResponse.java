package training.cloud.crmmicroservice.model.dto;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class CatalogResponse {
    private String traceIdentifier;
    private String targetDestinationBanco;
    private String bankName;
    private String operation;
}
