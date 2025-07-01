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
@Table(name = "CATALOGO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {

    @Id
    @Column(name = "TRACE_IDENTIFIER")
    private String traceIdentifier;

    @Column(name = "TARGET_DESTINATION_BANCO")
    private String targetDestinationBanco;

    @Column(name = "REQUEST_CODE")
    private String requestCode;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "OPERATION")
    private String operation;

    @PrePersist
    public void prePersist() {
        if (this.traceIdentifier == null) {
            this.traceIdentifier = UUID.randomUUID().toString();
        }
    }

}
