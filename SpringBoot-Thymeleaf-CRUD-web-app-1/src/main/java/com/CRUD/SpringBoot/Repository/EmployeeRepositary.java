package com.CRUD.SpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.SpringBoot.Model.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Long> {

}
