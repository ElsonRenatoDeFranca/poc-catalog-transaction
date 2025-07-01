package training.cloud.poc.microservice.model.dto;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class UnnaxRequest {
    private String traceIdentifier;
    private String bankName;

}
