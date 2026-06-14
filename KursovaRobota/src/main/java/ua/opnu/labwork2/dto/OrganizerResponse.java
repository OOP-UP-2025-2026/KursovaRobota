package ua.opnu.labwork2.dto;

public record OrganizerResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        String organization
) {
}
