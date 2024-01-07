package com.peraton.departmentservice.repo;

import com.peraton.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
    Department getDepartmentById(Long id);
}
