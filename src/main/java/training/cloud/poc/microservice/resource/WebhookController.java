package training.cloud.poc.microservice.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training.cloud.poc.microservice.model.dto.CatalogRequestDTO;
import training.cloud.poc.microservice.model.dto.CatalogResponse;
import training.cloud.poc.microservice.model.dto.CatalogResponseDTO;
import training.cloud.poc.microservice.service.WebhookManagerService;

import java.util.List;

@RestController
@RequestMapping("/api/cecoban")
@AllArgsConstructor
public class WebhookController {

    private final WebhookManagerService webhookManagerService;

    @PostMapping("/webhook")
    public ResponseEntity<Void> saveWebhookContent(
            @RequestBody CatalogRequestDTO catalogRequestDTO
    ) {
        webhookManagerService.save(catalogRequestDTO);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/webhook")
    public ResponseEntity<List<CatalogResponseDTO>> getWebhookContent(@RequestBody String traceIdentifier) {
        var catalogResponse = webhookManagerService.findAllByTraceIdentifier(traceIdentifier);

        //return catalogResponse.stream().map(a -> ca).toList();
        //return ResponseEntity.accepted().build();
        return null;
    }


}