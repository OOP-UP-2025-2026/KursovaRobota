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
import ua.opnu.labwork2.exception.ApiErrorResponse;
import ua.opnu.labwork2.service.ParticipantService;
import ua.opnu.labwork2.entity.Participant;

@RestController
@Tag(name = "Управління учасниками", description = "Операції для реєстації, перегляду, видалення, зміни даних про учасників, перегляду подій учасників")
public class ParticipantController {

    private final ParticipantService participantService;

    public ParticipantController(ParticipantService participantService) {
        this.participantService = participantService;
    }

    @PostMapping("/participants")
    @Operation(summary = "Реєстрація нового учасника", description = "Створює новий запис учасника в системі. Електронна пошта повинна бути унікальною.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Учасника успішно зареєстровано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "400", description = "Помилка валідації вхідних даних",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
            @ApiResponse(responseCode = "409", description = "Учасник із таким email вже існує",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class)))
    })
    public ResponseEntity<Participant> createParticipant() {

        Participant participant = new Participant(1L, "firstName", "lastName", "email", "phone");

        return ResponseEntity.ok(participant);
    }

    @GetMapping("/participants")
    @Operation(summary = "Отримати список всіх учасників", description = "Повертає список всіх зареєстрованих учасників з повними даними")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Список учасників успішно отримано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
    })
    public ResponseEntity<Participant> getParticipants() {

        Participant participant = new Participant(2L, "firstName", "lastName", "email", "phone");

        return ResponseEntity.ok(participant);
    }

    @GetMapping("/participants/{id}")
    @Operation(summary = "Отримати дані учасника по id", description = "Повертає повні дані певного учасника, якщо такий id існує")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Профіль учасника успішно знайдено",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Учасника з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Participant> getParticipantById(
            @PathVariable Long id) {

        Participant participant = new Participant(3L, "firstName", "lastName", "email", "phone");

        return ResponseEntity.ok(participant);
    }

    @PutMapping("/participants/{id}")
    @Operation(summary = "Змінити дані учасника по id", description = "Змінює дані учасника по id, якщо такий існує")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Профіль учасника успішно оновлено",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "400", description = "Помилка валідації вхідних даних",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
            @ApiResponse(responseCode = "404", description = "Учасника з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
            @ApiResponse(responseCode = "409", description = "Такий email іже зайнятий іншим учасником",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Participant> setParticipantById(
            @PathVariable Long id) {

        Participant participant = new Participant(4L, "firstName", "lastName", "email", "phone");

        return ResponseEntity.ok(participant);
    }

    @DeleteMapping("/participants/{id}")
    @Operation(summary = "Видалати учасника по id", description = "Видаляє певного учасника з бази даних за певним id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Учасника успішно видалено",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Учасника з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Participant> deleteParticipantById(
            @PathVariable Long id) {

        Participant participant = new Participant(5L, "firstName", "lastName", "email", "phone");

        return ResponseEntity.ok(participant);
    }

    @GetMapping("/participants/{id}/events")
    @Operation(summary = "Отримати список всіх подій, на які зареєстрований певний учасник за id", description = "Повертає список всіх подій з даними за id певного учасника")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Список подій отримано",
                    content = @Content(schema = @Schema(implementation = ParticipantResponse.class))),
            @ApiResponse(responseCode = "404", description = "Учасника з таким id не знайдено",
                    content = @Content(schema = @Schema(implementation = ApiErrorResponse.class))),
    })
    public ResponseEntity<Participant> getEventsByParticipantId(
            @PathVariable Long id) {

        Participant participant = new Participant(6L, "firstName", "lastName", "email", "phone");

        return ResponseEntity.ok(participant);
    }
}
