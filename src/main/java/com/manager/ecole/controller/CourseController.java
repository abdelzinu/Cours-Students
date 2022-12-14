package com.manager.ecole.controller;

import com.manager.ecole.dto.CourseDTO;
import com.manager.ecole.dto.CourseRequestDto;
import com.manager.ecole.dto.StudentDTO;
import com.manager.ecole.dto.StudentRequestDto;
import com.manager.ecole.mapper.CourseRequestMapper;
import com.manager.ecole.mapper.StudentRequestMapper;
import com.manager.ecole.service.CourseService;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

  private final CourseService courseService;
  private final CourseRequestMapper courseRequestMapper;
  private final StudentRequestMapper studentRequestMapper;

  public CourseController(
      CourseService courseService,
      CourseRequestMapper courseRequestMapper,
      StudentRequestMapper studentRequestMapper) {
    this.courseService = courseService;
    this.courseRequestMapper = courseRequestMapper;
    this.studentRequestMapper = studentRequestMapper;
  }

  @GetMapping
  public List<CourseDTO> getAllCourses() {
    return courseService.getAll();
  }

  @GetMapping("/{id}")
  public CourseDTO getCourse(@PathVariable Long id) {
    return courseService.get(id);
  }

  @GetMapping("/{courseId}/students")
  public List<StudentDTO> getAllStudentsInCourse(@PathVariable Long courseId) {
    return courseService.getStudentsInCourse(courseId);
  }

  @GetMapping("/{courseId}/students/{studentId}")
  public StudentDTO getStudentInCourse(@PathVariable Long courseId, @PathVariable Long studentId) {
    return courseService.getStudentInCourse(courseId, studentId);
  }

  @PostMapping
  public CourseDTO addCourse(@RequestBody CourseRequestDto courseDTO) {
    return courseService.add(courseRequestMapper.toCourseDto(courseDTO));
  }

  @PostMapping("/{courseId}/students")
  public StudentDTO addStudentInCourse(
      @PathVariable Long courseId, @RequestBody StudentRequestDto studentRequestDto) {
    return courseService.addStudentToCourse(
        courseId, studentRequestMapper.toStudentDto(studentRequestDto));
  }

  @PutMapping
  public CourseDTO updateCourse(@RequestBody CourseRequestDto courseDTO) {
    return courseService.update(courseRequestMapper.toCourseDto(courseDTO));
  }

  @PutMapping("/{courseId}/students")
  public StudentDTO updateStudentInCourse(
      @PathVariable Long courseId, @RequestBody StudentRequestDto studentRequestDto) {
    return courseService.updateStudentInCourse(
        courseId, studentRequestMapper.toStudentDto(studentRequestDto));
  }

  @DeleteMapping("/{id}")
  public void deleteCourse(@PathVariable Long id) {
    courseService.delete(id);
  }

  @DeleteMapping("/{courseId}/students/{studentId}")
  public void deleteStudentInCourse(@PathVariable Long courseId, @PathVariable Long studentId) {
    courseService.deleteStudentInCourse(courseId, studentId);
  }
}
