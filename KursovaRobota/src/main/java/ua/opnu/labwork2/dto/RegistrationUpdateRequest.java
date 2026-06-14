package ua.opnu.labwork2.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import ua.opnu.labwork2.entity.Registration;

import java.time.LocalDate;

public record RegistrationUpdateRequest(
        @NotNull @FutureOrPresent LocalDate registrationDate,
        @NotNull Registration.Status status
) {
}
