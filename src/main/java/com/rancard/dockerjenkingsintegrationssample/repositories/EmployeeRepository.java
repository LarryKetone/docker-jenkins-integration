package com.rancard.dockerjenkingsintegrationssample.repositories;

import com.rancard.dockerjenkingsintegrationssample.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
