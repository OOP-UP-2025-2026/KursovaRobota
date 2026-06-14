package ua.opnu.labwork2.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

@Schema(description = "Модуль вихідних даних для створення або оновлення події")
public record EventResponse(

        @Schema(
                description = "ID події",
                example = "1L",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        Long id,

        @Schema(
                description = "Унікальна назва події",
                example = "Surrendering",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String title,

        @Schema(
                description = "Опис події",
                example = "We are going to surrender while bleeding to death, and then die",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String description,

        @Schema(
                description = "Дата проведення події",
                example = "12-06-2026",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        LocalDateTime date,

        @Schema(
                description = "Місце проведення події",
                example = "ONPU",
                requiredMode = Schema.RequiredMode.REQUIRED
        )
        String location
) {}
