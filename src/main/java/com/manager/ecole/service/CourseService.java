package com.manager.ecole.service;

import com.manager.ecole.dto.CourseDTO;
import com.manager.ecole.dto.StudentDTO;
import java.util.List;

public interface CourseService extends CrudService<CourseDTO, Long> {

  StudentDTO addStudentToCourse(Long courseId, StudentDTO studentDTO);

  StudentDTO updateStudentInCourse(Long courseId, StudentDTO studentDTO);

  List<StudentDTO> getStudentsInCourse(Long courseId);

  StudentDTO getStudentInCourse(Long courseId, Long studentId);

  void deleteStudentInCourse(Long courseId, Long studentId);
}
