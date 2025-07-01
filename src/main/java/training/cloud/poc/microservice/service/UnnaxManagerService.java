package training.cloud.poc.microservice.service;


import training.cloud.poc.microservice.model.dto.UnnaxRequest;
import training.cloud.poc.microservice.model.dto.UnnaxResponse;

import java.util.List;

public interface UnnaxManagerService {
    void save(UnnaxRequest jobRequest);
    List<UnnaxResponse> findAllRequestCodes();
    UnnaxResponse findJobIdByTraceIdentifier(String traceIdentifier);
}