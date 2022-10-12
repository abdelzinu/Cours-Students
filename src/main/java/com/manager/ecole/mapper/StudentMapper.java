package com.manager.ecole.mapper;

import com.manager.ecole.domain.Student;
import com.manager.ecole.dto.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(uses = CourseMapper.class, componentModel = "spring")
public interface StudentMapper {

  Student toModel(StudentDTO studentDto);

  StudentDTO toDto(Student student);
}
