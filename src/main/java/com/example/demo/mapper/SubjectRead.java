package com.example.demo.mapper;

import com.example.demo.model.Subject;
import com.example.demo.model.dto.SubjectReadDTO;
import org.springframework.beans.BeanUtils;

public class SubjectRead {
    public static SubjectReadDTO toDTO(Subject subject){
        SubjectReadDTO subjectReadDTO = new SubjectReadDTO();
        BeanUtils.copyProperties(subject,subjectReadDTO);

        return subjectReadDTO;
    }
}
