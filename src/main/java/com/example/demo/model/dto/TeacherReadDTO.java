package com.example.demo.model.dto;
import com.example.demo.model.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherReadDTO {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
}
