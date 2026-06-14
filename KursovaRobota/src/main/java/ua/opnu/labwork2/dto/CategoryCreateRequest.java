package ua.opnu.labwork2.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryCreateRequest(
        @NotBlank @Size(min = 2, max = 150) String name,
        @NotBlank @Size(min = 10, max = 2000) String description
) {
}
