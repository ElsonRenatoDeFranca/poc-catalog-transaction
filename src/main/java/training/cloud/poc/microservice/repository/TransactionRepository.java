package training.cloud.poc.microservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import training.cloud.poc.microservice.model.entity.UnnaxRequestTransaction;


@Repository
public interface TransactionRepository  extends JpaRepository<UnnaxRequestTransaction, String> {
    UnnaxRequestTransaction findJobIdByTraceIdentifier(String traceIdentifier);
}