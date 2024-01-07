package com.peraton.departmentservice.controller;

import com.peraton.departmentservice.entity.Department;
import com.peraton.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @PostMapping("/list")
    public List<Department> saveDepartments(@RequestBody List<Department> departments){
        return departmentService.saveDepartments(departments);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }
    @GetMapping("/list")
    public List<Department> getDepartmentList(){
        return departmentService.getDepartmentList();
    }
    @DeleteMapping("/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long id){
         departmentService.deleteDepartmentById(id);
    }
    @DeleteMapping("/list")
    public void deleteDepartmentList(){
         departmentService.deleteDepartmentList();
    }
    
}
