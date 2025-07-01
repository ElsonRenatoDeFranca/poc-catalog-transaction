package training.cloud.poc.microservice.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Data
public class UnnaxResponse {
    private String traceIdentifier;
    private String requestCode;
}
