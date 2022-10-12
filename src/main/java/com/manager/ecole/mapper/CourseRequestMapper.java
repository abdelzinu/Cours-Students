package com.manager.ecole.mapper;

import com.manager.ecole.dto.CourseDTO;
import com.manager.ecole.dto.CourseRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseRequestMapper {
  CourseDTO toCourseDto(CourseRequestDto courseRequestDto);
}
