package kz.abdullaeva.firstProj.dtos;

import kz.abdullaeva.firstProj.entities.Task;
import lombok.Data;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private Task task;
}
