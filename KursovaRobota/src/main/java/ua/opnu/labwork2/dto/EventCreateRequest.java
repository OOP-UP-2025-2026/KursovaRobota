package ua.opnu.labwork2.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record EventCreateRequest(
        @NotBlank @Size(min = 2, max = 150) String title,
        @NotBlank @Size(min = 10, max = 2000) String description,
        @NotNull @FutureOrPresent LocalDateTime date,
        @NotBlank @Size(min = 5, max = 200) String location
) {
}