package training.cloud.poc.microservice.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TRANSACCIONAL")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @Column(name = "TRACE_IDENTIFIER")
    private String traceIdentifier;

    @Column(name = "BANK_NAME")
    private String bankName;

    @PrePersist
    public void prePersist() {
        if (this.traceIdentifier == null) {
            this.traceIdentifier = UUID.randomUUID().toString();
        }
    }
}