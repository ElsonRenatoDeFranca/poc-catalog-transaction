package training.cloud.poc.microservice.service;


import training.cloud.poc.microservice.model.dto.CatalogResponse;

import java.util.List;

public interface CatalogService {
    List<CatalogResponse> execute(CatalogResponse catalogResponse);
}