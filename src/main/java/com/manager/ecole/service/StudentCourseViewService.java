package com.manager.ecole.service;

import com.manager.ecole.dto.PagedResponseDTO;
import com.manager.ecole.dto.StudentCourseViewDTO;
import java.util.List;

public interface StudentCourseViewService {

  PagedResponseDTO<List<StudentCourseViewDTO>> getAll(
      Integer pageNo, Integer pageSize, String sortBy, boolean isAscending, String search);
}
