package com.manager.ecole.mapper;

import com.manager.ecole.dto.StudentDTO;
import com.manager.ecole.dto.StudentRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentRequestMapper {

  @Mapping(source = "courseId", target = "course.id")
  StudentDTO toStudentDto(StudentRequestDto studentRequestDto);
}
