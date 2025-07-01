package training.cloud.poc.microservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import training.cloud.poc.microservice.model.entity.Transaction;


@Repository
public interface TransactionRepository  extends JpaRepository<Transaction, String> {
    Transaction findJobIdByTraceIdentifier(String traceIdentifier);
}