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
public class TransactionDTO {
    private String traceIdentifier;
    private String bankName;
}
