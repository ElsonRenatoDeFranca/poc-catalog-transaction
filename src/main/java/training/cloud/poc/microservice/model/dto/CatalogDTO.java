package training.cloud.poc.microservice.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@AllArgsConstructor
@Data
public class CatalogDTO {
    private String traceIdentifier;
    private String targetDestinationBanco;
    private String requestCode;
    private LocalDateTime creationDate;
    private String status;
    private String operation;
}