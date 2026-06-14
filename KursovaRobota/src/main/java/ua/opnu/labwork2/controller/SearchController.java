package ua.opnu.labwork2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class SearchController {

    @GetMapping("/search/events")
    public ResponseEntity<String> searchEventsByQuery(
            @RequestParam String query) {

        return ResponseEntity.ok("searchEventsByQuery\nquery = " + query);
    }

    @GetMapping("/search/events/advanced")
    public ResponseEntity<String> searchEventsByQueryAdvanced(
            @RequestParam String query,
            @RequestParam LocalDate date,
            @RequestParam String location) {

        //LocalDate localDate = LocalDate.parse(date);

        return ResponseEntity.ok("searchEventsByQueryAdvanced");
    }

    @GetMapping("/search/participants")
    public ResponseEntity<String> searchParticipantsByQuery(
            @RequestParam String query) {

        return ResponseEntity.ok("searchParticipantsByQuery\nquery = " + query);
    }
}
