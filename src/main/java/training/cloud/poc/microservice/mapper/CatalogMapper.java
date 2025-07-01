package training.cloud.poc.microservice.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import training.cloud.poc.microservice.model.dto.CatalogDTO;
import training.cloud.poc.microservice.model.dto.CatalogResponse;
import training.cloud.poc.microservice.model.entity.Catalog;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR, injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface CatalogMapper {
    Catalog toEntity(CatalogDTO catalog);
    CatalogDTO toDomain(Catalog catalog);
    CatalogResponse toCatalogResponse(CatalogDTO catalogDTO);
}