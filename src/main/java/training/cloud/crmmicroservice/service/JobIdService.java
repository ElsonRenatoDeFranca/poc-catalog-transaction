package training.cloud.crmmicroservice.service;


import training.cloud.crmmicroservice.model.dto.UnnaxRequest;
import training.cloud.crmmicroservice.model.dto.UnnaxResponse;

import java.util.List;

public interface JobIdService {
    void save(UnnaxRequest jobRequest);
    List<UnnaxResponse> findAllJobIds();
    UnnaxResponse findJobIdByTraceIdentifier(String traceIdentifier);
}