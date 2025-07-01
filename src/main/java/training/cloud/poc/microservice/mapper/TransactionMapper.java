package training.cloud.poc.microservice.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import training.cloud.poc.microservice.model.dto.UnnaxResponse;
import training.cloud.poc.microservice.model.dto.TransactionDTO;
import training.cloud.poc.microservice.model.entity.Transaction;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR, injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface TransactionMapper {
    Transaction toEntity(TransactionDTO transaction);
    TransactionDTO toDomain(Transaction transaction);
    default UnnaxResponse toJobIdResponse(TransactionDTO transactionDTO) {
        return new UnnaxResponse(transactionDTO.getTraceIdentifier(), transactionDTO.getBankName());
    }
}