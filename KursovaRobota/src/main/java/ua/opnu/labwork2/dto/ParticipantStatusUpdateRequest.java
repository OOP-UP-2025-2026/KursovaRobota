package ua.opnu.labwork2.dto;

import jakarta.validation.constraints.NotNull;

public record ParticipantStatusUpdateRequest(
        @NotNull String status
) {
}
