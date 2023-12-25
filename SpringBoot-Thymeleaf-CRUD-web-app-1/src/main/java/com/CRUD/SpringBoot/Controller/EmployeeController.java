package com.CRUD.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.CRUD.SpringBoot.Model.Employee;
import com.CRUD.SpringBoot.Service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empServ;
	
	//display List of employees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", empServ.getAllEmployee());
		return "index";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		// Save employee to database
		empServ.saveEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpString(@PathVariable (value = "id") long id, Model model) {
		// Get employee from the service
		Employee employee = empServ.getEmployeeById(id);
		
		// Set employee as a model attribute to pre-populate the form
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		// Call delete employee method
		this.empServ.deleteEmployeeById(id);
		return "redirect:/";
	}
	
}
