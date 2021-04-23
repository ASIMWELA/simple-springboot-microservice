package com.hopeless.coder.controller;

import com.hopeless.coder.entity.Department;
import com.hopeless.coder.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }
}
