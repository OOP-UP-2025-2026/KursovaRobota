package ua.opnu.labwork2.dto;

import jakarta.validation.constraints.NotNull;

public record CategoryStatusUpdateRequest(
        @NotNull String status
) {
}
