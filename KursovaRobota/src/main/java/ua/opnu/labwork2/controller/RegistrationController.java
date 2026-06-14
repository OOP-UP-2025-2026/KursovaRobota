package ua.opnu.labwork2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.opnu.labwork2.entity.Event;
import ua.opnu.labwork2.entity.Registration;
import ua.opnu.labwork2.service.RegistrationService;

import java.time.LocalDate;

@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/registrations")
    public ResponseEntity<Registration> createRegistration() {

        Registration registration = new Registration(1L, LocalDate.now(), Registration.Status.PENDING);

        return ResponseEntity.ok(registration);
    }

    @GetMapping("/registrations")
    public ResponseEntity<Registration> getRegistrations() {

        Registration registration = new Registration(2L, LocalDate.now(), Registration.Status.PENDING);

        return ResponseEntity.ok(registration);
    }

    @GetMapping("/registrations/{id}")
    public ResponseEntity<Registration> getRegistrationById(
            @PathVariable Long id) {

        Registration registration = new Registration(3L, LocalDate.now(), Registration.Status.PENDING);

        return ResponseEntity.ok(registration);
    }

    @PutMapping("/registrations/{id}/status")
    public ResponseEntity<Registration> setStatusByRegistrationId(
            @PathVariable Long id) {

        Registration registration = new Registration(4L, LocalDate.now(), Registration.Status.PENDING);

        return ResponseEntity.ok(registration);
    }

    @DeleteMapping("/registrations/{id}")
    public ResponseEntity<Registration> deleteRegistrationById(
            @PathVariable Long id) {

        Registration registration = new Registration(5L, LocalDate.now(), Registration.Status.PENDING);

        return ResponseEntity.ok(registration);
    }

    @GetMapping("/events/{id}/registrations")
    public ResponseEntity<Event> getRegistrationsByEventId(
            @PathVariable Long id) {

        Event event = new Event(6L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }
}
