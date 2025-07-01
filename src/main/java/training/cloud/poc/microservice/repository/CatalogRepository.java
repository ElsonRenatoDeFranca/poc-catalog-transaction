package training.cloud.poc.microservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import training.cloud.poc.microservice.model.entity.Catalog;

import java.util.List;

public interface CatalogRepository  extends JpaRepository<Catalog, String> {
    List<Catalog> findByTraceIdentifier(String traceIdentifier);
}
