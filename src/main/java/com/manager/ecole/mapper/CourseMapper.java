package com.manager.ecole.mapper;

import com.manager.ecole.domain.Course;
import com.manager.ecole.dto.CourseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {
  Course toCourse(CourseDTO courseDTO);

  CourseDTO fromCourse(Course course);
}
