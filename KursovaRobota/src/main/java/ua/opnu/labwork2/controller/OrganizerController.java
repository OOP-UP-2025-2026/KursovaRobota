package ua.opnu.labwork2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.opnu.labwork2.service.OrganizerService;
import ua.opnu.labwork2.entity.Organizer;

@RestController
public class OrganizerController {

    private final OrganizerService organizerService;

    public OrganizerController(OrganizerService organizerService) {
        this.organizerService = organizerService;
    }

    @PostMapping("/organizers")
    public ResponseEntity<Organizer> createOrganizer() {

        Organizer organizer = new Organizer(1L, "firstName", "lastName", "email", "organization");

        return ResponseEntity.ok(organizer);
    }

    @GetMapping("/organizers")
    public ResponseEntity<Organizer> getOrganizers() {

        Organizer organizer = new Organizer(2L, "firstName", "lastName", "email", "organization");

        return ResponseEntity.ok(organizer);
    }

    @GetMapping("/organizers/{id}")
    public ResponseEntity<Organizer> getOrganizerById(
            @PathVariable Long id) {

        Organizer organizer = new Organizer(3L, "firstName", "lastName", "email", "organization");

        return ResponseEntity.ok(organizer);
    }

    @PutMapping("/organizers/{id}")
    public ResponseEntity<Organizer> setOrganizerById(
            @PathVariable Long id) {

        Organizer organizer = new Organizer(4L, "firstName", "lastName", "email", "organization");

        return ResponseEntity.ok(organizer);
    }

    @DeleteMapping("/organizers/{id}")
    public ResponseEntity<Organizer> deleteOrganizerById(
            @PathVariable Long id) {

        Organizer organizer = new Organizer(5L, "firstName", "lastName", "email", "organization");

        return ResponseEntity.ok(organizer);
    }

    @GetMapping("/organizers/{id}/events")
    public ResponseEntity<Organizer> getEventsByOrganizerId(
            @PathVariable Long id) {

        Organizer organizer = new Organizer(6L, "firstName", "lastName", "email", "organization");

        return ResponseEntity.ok(organizer);
    }
}
