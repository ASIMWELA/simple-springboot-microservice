package com.hopeless.coder.repository;

import com.hopeless.coder.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findDepartmentByDepartmentId(Long departmentId);
}
