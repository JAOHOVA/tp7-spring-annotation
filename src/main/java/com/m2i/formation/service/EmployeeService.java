package com.m2i.formation.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.m2i.formation.dao.IEmplooyeeDAO;
import com.m2i.formation.entity.Employee;

@Service("employeeService")
public class EmployeeService {

	private static final Logger l = Logger.getLogger(EmployeeService.class);

	@Resource(name = "employeDAO")
	IEmplooyeeDAO employeeDAO;

	// Getter
	public IEmplooyeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	// Setter
	public void setEmployeeDAO(IEmplooyeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public Boolean addEmployee(Employee employee) {
		Boolean employeeAdded = true;
		try {
			employeeDAO.addEmploye(employee);
		} catch (Exception e) {
			employeeAdded = false;
		}

		return employeeAdded;
	}

	public Employee getEmployeebyId(int id) {
		Employee employee = null;

		try {
			l.info("Entrée dans la méthode getEmployeebyId");
			employee = employeeDAO.getEmployeebyId(id);

		} catch (Exception e) {
			l.error("Error : " + e);
		}

		return employee;

	}
}
