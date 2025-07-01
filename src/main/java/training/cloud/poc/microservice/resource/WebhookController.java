package training.cloud.poc.microservice.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training.cloud.poc.microservice.model.dto.CatalogResponse;

@RestController
@RequestMapping("/api/cecoban")
@AllArgsConstructor
public class WebhookController {

    @PostMapping("/webhook")
    public ResponseEntity<Void> saveWebhookContent(
            @RequestBody CatalogResponse catalogResponse
    ) {
        return ResponseEntity.accepted().build();
    }

}