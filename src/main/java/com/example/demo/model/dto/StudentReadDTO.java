package com.example.demo.model.dto;

import com.example.demo.model.Subject;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentReadDTO {
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String studentIndex;
    private List<Subject> subjects;
}
