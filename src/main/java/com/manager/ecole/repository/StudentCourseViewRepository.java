package com.manager.ecole.repository;

import com.manager.ecole.domain.StudentCourseView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentCourseViewRepository
    extends JpaRepository<StudentCourseView, Long>, JpaSpecificationExecutor<StudentCourseView> {}
