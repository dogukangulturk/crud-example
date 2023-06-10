package dto;

public record EmployeeDto(
        long id,
        String firstName,
        String lastName,
        String email,
        Long departmentId
) {
}
