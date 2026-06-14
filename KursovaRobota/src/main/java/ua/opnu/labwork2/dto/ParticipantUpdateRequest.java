package ua.opnu.labwork2.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ParticipantUpdateRequest(
        @NotBlank @Size(min = 2, max = 50) String firstName,
        @NotBlank @Size(min = 2, max = 50) String lastName,
        @Email @Size(min = 1, max = 100) String email,
        @NotBlank @Size(min = 10, max = 20) String phone
) {
}
