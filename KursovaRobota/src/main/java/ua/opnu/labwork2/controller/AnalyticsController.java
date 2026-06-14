package ua.opnu.labwork2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @GetMapping("/analytics/events/count")
    public ResponseEntity<String> countEvents() {

        return ResponseEntity.ok("a lot of them");
    }

    @GetMapping("/analytics/participants/count")
    public ResponseEntity<String> countParticipants() {

        return ResponseEntity.ok("a lot of them");
    }

    @GetMapping("/analytics/events/upcoming")
    public ResponseEntity<String> countUpcomingEvents() {

        return ResponseEntity.ok("a lot of them");
    }

    @GetMapping("/analytics/events/past")
    public ResponseEntity<String> countPastEvents() {

        return ResponseEntity.ok("a lot of them");
    }

    @GetMapping("/analytics/events/by-category")
    public ResponseEntity<String> countEventsByCategory() {

        return ResponseEntity.ok("a lot of them");
    }
}
