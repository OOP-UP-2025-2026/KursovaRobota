package ua.opnu.labwork2.dto;

import io.swagger.v3.oas.annotations.media.Schema;

public record ParticipantResponse(

        @Schema(
                description = "ID учасника",
                example = "1L",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        Long id,

        @Schema(
                description = "Ім'я учасника",
                example = "Oleg",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String firstName,

        @Schema(
                description = "Прізвище учасника",
                example = "Gordienko",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String lastName,

        @Schema(
                description = "email учасника",
                example = "uwu@op.edu.ua",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String email,

        @Schema(
                description = "Телефон учасника",
                example = "+3805007799000",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String phone
) {
}
