package com.hopeless.coder.service;

import com.hopeless.coder.entity.Department;
import com.hopeless.coder.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentId){
        return departmentRepository.findDepartmentByDepartmentId(departmentId);
    }
}
