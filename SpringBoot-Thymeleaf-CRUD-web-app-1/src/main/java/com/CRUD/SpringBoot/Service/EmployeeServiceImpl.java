package com.CRUD.SpringBoot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.SpringBoot.Model.Employee;
import com.CRUD.SpringBoot.Repository.EmployeeRepositary;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepositary emplRepo;

	@Override
	public List<Employee> getAllEmployee() {
		return emplRepo.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee) {
		this.emplRepo.save(employee);
	}
	
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> optional = emplRepo.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employee not found for id :: " + id);
		}
		return employee;
	}
	
	@Override
	public void deleteEmployeeById(long id) {
		this.emplRepo.deleteById(id);
	}

//	@Override
//	public void showhomepage() {
//		return ;
//		
//	}
}
