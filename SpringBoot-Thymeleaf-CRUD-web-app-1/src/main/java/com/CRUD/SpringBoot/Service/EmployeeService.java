package com.CRUD.SpringBoot.Service;

import java.util.List;

import com.CRUD.SpringBoot.Model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}
