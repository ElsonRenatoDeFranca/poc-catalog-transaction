package training.cloud.crmmicroservice.model.dto;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class UnnaxRequest {
    private String requestCode;
    private String traceIdentifier;
}
