package com.manager.ecole.controller;

import com.manager.ecole.dto.PagedResponseDTO;
import com.manager.ecole.dto.StudentCourseViewDTO;
import com.manager.ecole.dto.StudentDTO;
import com.manager.ecole.dto.StudentRequestDto;
import com.manager.ecole.mapper.StudentRequestMapper;
import com.manager.ecole.service.StudentCourseViewService;
import com.manager.ecole.service.StudentService;
import java.util.List;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

  private final StudentService studentService;
  private final StudentCourseViewService studentCourseViewService;
  private final StudentRequestMapper studentMapper;

  public StudentController(
      StudentService studentService,
      StudentCourseViewService studentCourseViewService,
      StudentRequestMapper studentMapper) {
    this.studentService = studentService;
    this.studentCourseViewService = studentCourseViewService;
    this.studentMapper = studentMapper;
  }

  @GetMapping
  public PagedResponseDTO<List<StudentDTO>> getAllStudents(
      @RequestParam(defaultValue = "0") Integer pageNo,
      @RequestParam(defaultValue = "2") Integer pageSize,
      @RequestParam(defaultValue = "id") String sortBy,
      @RequestParam(defaultValue = "true") boolean isAscending,
      @RequestParam(defaultValue = "") String search) {
    return studentService.getAll(pageNo, pageSize, sortBy, isAscending, search);
  }

  @GetMapping("/overview")
  public PagedResponseDTO<List<StudentCourseViewDTO>> getAllStudentsOverview(
      @RequestParam(defaultValue = "0") Integer pageNo,
      @RequestParam(defaultValue = "2") Integer pageSize,
      @RequestParam(defaultValue = "studentId") String sortBy,
      @RequestParam(defaultValue = "true") boolean isAscending,
      @RequestParam(defaultValue = "") String search) {
    return studentCourseViewService.getAll(pageNo, pageSize, sortBy, isAscending, search);
  }

  @PostMapping
  public StudentDTO addStudent(@RequestBody @Valid StudentRequestDto studentDTO) {
    return studentService.add(studentMapper.toStudentDto(studentDTO));
  }

  @PutMapping
  public StudentDTO updateStudent(@RequestBody @Valid StudentRequestDto studentDTO) {
    return studentService.update(studentMapper.toStudentDto(studentDTO));
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(@PathVariable Long id) {
    studentService.delete(id);
  }
}
