package com.peraton.departmentservice.service;

import com.peraton.departmentservice.entity.Department;
import com.peraton.departmentservice.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public List<Department> saveDepartments(List<Department> departments) {
        return departmentRepo.saveAll(departments);
    }
//    @Async("asyncExecutor")
    public Department getDepartmentById(Long id) {
        return departmentRepo.getDepartmentById(id);
    }

    public List<Department> getDepartmentList() {
        return departmentRepo.findAll();
    }

    public void deleteDepartmentById(Long id) {
         departmentRepo.deleteById(id);
         System.out.println("Department with ID:"+id+" has been removed Successfully");
    }

    public void deleteDepartmentList() {
        departmentRepo.deleteAll();
        System.out.println("Complete Department list has been deleted");
    }
}
