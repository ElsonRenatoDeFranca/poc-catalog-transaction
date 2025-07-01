package training.cloud.poc.microservice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import training.cloud.poc.microservice.mapper.TransactionMapper;
import training.cloud.poc.microservice.model.dto.UnnaxRequest;
import training.cloud.poc.microservice.model.dto.UnnaxResponse;
import training.cloud.poc.microservice.model.dto.TransactionDTO;
import training.cloud.poc.microservice.repository.TransactionRepository;

import java.time.LocalDateTime;
import java.util.List;


@Slf4j
@AllArgsConstructor
@Data
@Service
public class DefaultUnnaxManagerService implements UnnaxManagerService {

    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    @Override
    public void save(UnnaxRequest unnaxRequest) {
        var now = LocalDateTime.now();
        var transactionDTO = new TransactionDTO(
                unnaxRequest.getTraceIdentifier(),
                unnaxRequest.getBankName()
        );

        var transactionEntity = transactionMapper.toEntity(transactionDTO);
        transactionRepository.save(transactionEntity);
    }

    @Override
    public List<UnnaxResponse> findAllRequestCodes() {
        var transactions = transactionRepository.findAll();
        var transactionsDTO = transactions.stream().map(transactionMapper::toDomain).toList();
        return transactionsDTO.stream().map(transactionMapper::toJobIdResponse).toList();
    }

    @Override
    public UnnaxResponse findJobIdByTraceIdentifier(String traceIdentifier) {
        var transactionEntity = transactionRepository.findJobIdByTraceIdentifier(traceIdentifier);
        var transactionsDTO = transactionMapper.toDomain(transactionEntity);
        return transactionMapper.toJobIdResponse(transactionsDTO);
    }


}