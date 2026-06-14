package ua.opnu.labwork2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorController {

    @GetMapping("/actuator/health")
    public ResponseEntity<String> checkHealth() {

        return ResponseEntity.ok("AAAAAlright");
    }

    @GetMapping("/actuator/metrics")
    public ResponseEntity<String> checkMetrics() {

        return ResponseEntity.ok("AAAAAlright");
    }

    @GetMapping("/actuator/prometheus")
    public ResponseEntity<String> checkPrometheus() {

        return ResponseEntity.ok("AAAAAlright");
    }
}
