package com.manager.ecole.mapper;

import com.manager.ecole.domain.StudentCourseView;
import com.manager.ecole.dto.StudentCourseViewDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentCourseViewMapper {
  StudentCourseViewDTO toDto(StudentCourseView studentCourseView);
}
