package training.cloud.crmmicroservice.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import training.cloud.crmmicroservice.model.dto.UnnaxRequest;
import training.cloud.crmmicroservice.model.dto.UnnaxResponse;
import training.cloud.crmmicroservice.service.JobIdService;

import java.util.List;

@RestController
@RequestMapping("/api/cecoban")
@AllArgsConstructor
public class JobManagerController {

    private final JobIdService jobIdService;

    @PostMapping("/jobs")
    public ResponseEntity<Void> saveJob(
            @RequestBody UnnaxRequest jobRequest
    ) {
        jobIdService.save(jobRequest);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<UnnaxResponse>> getResponse() {
        var jobIdResponses = jobIdService.findAllJobIds();
        return ResponseEntity.ok(jobIdResponses);
    }


}