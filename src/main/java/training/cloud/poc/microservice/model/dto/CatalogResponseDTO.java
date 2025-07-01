package training.cloud.poc.microservice.model.dto;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Data
public class CatalogResponseDTO {
    private String traceIdentifier;
    private String targetDestinationBanco;
    private String requestCode;
    private LocalDateTime creationDate;
    private String status;
    private String operation;
}
