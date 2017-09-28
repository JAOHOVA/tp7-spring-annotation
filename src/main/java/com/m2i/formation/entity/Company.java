package com.m2i.formation.entity;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("company")
public class Company {

	private int id;
	private String name;
	
	@Resource(name="employee")
	private Employee employee;

	/**
	 * 
	 */
	public Company() {

	}

	/**
	 * @param id
	 * @param name
	 * @param employee
	 */
	public Company(int id, String name, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
