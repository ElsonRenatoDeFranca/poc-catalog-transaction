package training.cloud.crmmicroservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;


@Slf4j
@AllArgsConstructor
@Data
public class TransactionDTO {
    private String traceIdentifier;
    private final String requestCode;
    private final LocalDateTime creationDate;
    private final String status;
}
