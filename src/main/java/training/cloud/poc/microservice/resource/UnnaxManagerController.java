package training.cloud.poc.microservice.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training.cloud.poc.microservice.model.dto.UnnaxRequest;
import training.cloud.poc.microservice.model.dto.UnnaxResponse;
import training.cloud.poc.microservice.service.UnnaxManagerService;

import java.util.List;

@RestController
@RequestMapping("/api/cecoban")
@AllArgsConstructor
public class UnnaxManagerController {

    private final UnnaxManagerService unnaxManagerService;

    @PostMapping("/jobs")
    public ResponseEntity<Void> saveJob(
            @RequestBody UnnaxRequest unnaxRequest
    ) {
        unnaxManagerService.save(unnaxRequest);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<UnnaxResponse>> getResponse() {
        var allRequestCodes = unnaxManagerService.findAllRequestCodes();
        return ResponseEntity.ok(allRequestCodes);
    }


}