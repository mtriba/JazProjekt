package com.example.demo.model.dto;

import com.example.demo.model.Subject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentWriteDTO {
    private String name;
    private String lastName;
    private Integer age;
    private String studentIndex;
    private List<Subject> subjects;
}
