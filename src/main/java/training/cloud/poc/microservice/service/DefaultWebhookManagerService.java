package training.cloud.poc.microservice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import training.cloud.poc.microservice.mapper.CatalogMapper;
import training.cloud.poc.microservice.model.dto.CatalogDTO;
import training.cloud.poc.microservice.model.dto.CatalogRequestDTO;
import training.cloud.poc.microservice.model.dto.CatalogResponseDTO;
import training.cloud.poc.microservice.repository.CatalogRepository;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Data
@Service
public class DefaultWebhookManagerService implements WebhookManagerService {

    private final CatalogRepository catalogRepository;
    private final CatalogMapper catalogMapper;

    @Override
    public void save(CatalogRequestDTO catalogRequestDTO) {
        var catalogEntity = catalogMapper.toEntity(catalogRequestDTO);
        catalogRepository.save(catalogEntity);
    }

    @Override
    public List<CatalogResponseDTO> findAllByTraceIdentifier(String traceIdentifier) {
        var catalogDTOs = findAllCatalogByTraceIdentifier(traceIdentifier);
        return catalogDTOs.stream().map(catalogMapper::fromCatalogDTOToCatalogResponseDTO).toList();
    }

    private List<CatalogDTO> findAllCatalogByTraceIdentifier(String traceIdentifier) {
        var catalogEntities = catalogRepository.findByTraceIdentifier(traceIdentifier);
        return catalogEntities.stream().map(catalogMapper::toDomain).toList();
    }


    //@Override
    //public List<CatalogResponseDTO> toCatalogResponseDTO(CatalogDTO catalogDTO) {
    //    return null;
    //}

    @Override
    public CatalogDTO findByTraceIdentifier(String traceIdentifier) {
        var catalogEntity = catalogRepository.findById(traceIdentifier).orElse(null);
        return catalogMapper.toDomain(catalogEntity);
    }

}
