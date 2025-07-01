package training.cloud.poc.microservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import training.cloud.poc.microservice.mapper.CatalogMapper;
import training.cloud.poc.microservice.model.dto.CatalogResponse;
import training.cloud.poc.microservice.repository.CatalogRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultCatalogService implements CatalogService {

    private final CatalogRepository catalogRepository;
    private final CatalogMapper catalogMapper;

    @Override
    public List<CatalogResponse> execute(CatalogResponse catalogResponse) {
        var traceIdentifier = catalogResponse.getTraceIdentifier();
        var catalogDTO = catalogRepository.findByTraceIdentifier(traceIdentifier);
        var catalogDTOs = catalogDTO.stream().map(catalogMapper::toDomain).toList();
        return catalogDTOs.stream().map(catalogMapper::toCatalogResponse).toList();
    }
}