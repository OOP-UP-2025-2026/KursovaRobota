package ua.opnu.labwork2.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.opnu.labwork2.dto.ParticipantResponse;
import ua.opnu.labwork2.entity.Event;
import ua.opnu.labwork2.exception.ApiErrorResponse;
import ua.opnu.labwork2.service.EventService;

import java.time.LocalDate;

@RestController
@Tag(name = "Управління подіями", description = "Операції для реєстрації родій, оновлення та видалення, перегляду.")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @Operation(summary = "Реєстрація нової події", description = "Створює новий запис події в системі.")
    @PostMapping("/events")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Подію успішно зареєстровано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "400", description = "Помилка валідації вхідних даних",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Event> createEvent() {

        Event event = new Event(1L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @Operation(summary = "Отримати список всіх подій", description = "Повертає список всіх подій з повними даними про них")
    @GetMapping("/events")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Список подій успішно отримано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
    })
    public ResponseEntity<Event> getEvents() {

        Event event = new Event(2L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @Operation(summary = "Отримати подію по id", description = "Повертає дані певної події")
    @GetMapping("/events/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Дані події успішно знайдено",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Події з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Event> getEventById(
            @PathVariable Long id) {

        Event event = new Event(3L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @Operation(summary = "Оновлення даних події по id", description = "Оновлює дані вказаної події за вказаими даними")
    @PutMapping("/events/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Дані події успішно оновлено",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "400", description = "Помилка валідації вхідних даних",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Події з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Event> setEventById(
            @PathVariable Long id) {

        Event event = new Event(4L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @Operation(summary = "Видалення події по id", description = "Видаляє певну подію, якщо вона є")
    @DeleteMapping("/events/{id}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Подію успішно видалено",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Подію з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Event> deleteEventById(
            @PathVariable Long id) {

        Event event = new Event(5L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @Operation(summary = "Отримати спимок подій по id категорії", description = "Виводить список подій певної категорії")
    @GetMapping("/events/category/{categoryId}")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Список учасників отримано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Категорію з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Event> getEventsByCategoryId(
            @PathVariable Long categoryId) {

        Event event = new Event(6L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }

    @Operation(summary = "Отримати список учасників по id події", description = "Повертає список учасників події і дані про них, якщо вона є")
    @GetMapping("/events/{id}/participants")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Список учасників отримано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Події з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Event> getParticipantsByEventId(@PathVariable Long id) {

        Event event = new Event(7L, "title", "description", LocalDate.now(), "location");

        return ResponseEntity.ok(event);
    }
}
