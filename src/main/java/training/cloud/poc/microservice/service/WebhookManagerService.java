package training.cloud.poc.microservice.service;

import training.cloud.poc.microservice.model.dto.CatalogDTO;
import training.cloud.poc.microservice.model.dto.CatalogRequestDTO;
import training.cloud.poc.microservice.model.dto.CatalogResponseDTO;

import java.util.List;

public interface WebhookManagerService {
    void save(CatalogRequestDTO catalogRequestDTO);
    List<CatalogResponseDTO> findAllByTraceIdentifier(String traceIdentifier);
    CatalogDTO findByTraceIdentifier(String traceIdentifier);
}
