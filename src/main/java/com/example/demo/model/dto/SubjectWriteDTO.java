package com.example.demo.model.dto;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SubjectWriteDTO {
    private String name;
    private Teacher teacher;
}
