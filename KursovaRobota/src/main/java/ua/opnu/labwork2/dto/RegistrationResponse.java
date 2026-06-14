package ua.opnu.labwork2.dto;

import ua.opnu.labwork2.entity.Registration;

import java.time.LocalDate;

public record RegistrationResponse(
        Long id,
        LocalDate registrationDate,
        Registration.Status status
) {
}
