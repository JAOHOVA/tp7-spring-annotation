package com.m2i.formation.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.m2i.formation.entity.Employee;
import com.m2i.formation.service.EmployeeService;

public class Demo {

	public void AjoutEmp(Employee employee) {

		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext(
				"application-context.xml");
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService");
		employeeService.addEmployee(employee);

	}

	public void RecupEmp(int id) {

		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext(
				"application-context.xml");
		EmployeeService employeeService = (EmployeeService) appContext.getBean("employeeService");
		employeeService.getEmployeebyId(id);

	}

}
