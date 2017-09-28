package com.m2i.formation.dao;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.m2i.formation.entity.Employee;

@Repository("employeDAO")

public class EmployeeDAO implements IEmplooyeeDAO {

	private static final Logger l = Logger.getLogger(EmployeeDAO.class);

	@Resource(name = "jdbcTemplate")
	JdbcTemplate jdbcTemplate;

	// Getter JdbcTemplate
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	// Setter JdbcTemplate
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// avec JDBCTEMPLATE ADD
	public void addEmploye(Employee employee) {

		l.info("Debut de la m�thode addEmployee");

		final String INSERT_QUERY = "INSERT INTO employe (login, password, nom, prenom, email, role) VALUES (?,?,?,?,?,?)";

		jdbcTemplate.update(INSERT_QUERY, new Object[] { employee.getLogin(), 
				employee.getPassword(), employee.getNom(), employee.getPrenom(), employee.getEmail(), employee.getRole() });

		l.info("Fin de la m�thode addEmploye");
	}

	@Override
	public void saveEmployee(Employee employee) {

		l.info("Debut de la m�thode saveEmployee");

		final String UPDATE_QUERY = "UPDATE employe set login = ?,  password = ?, nom = ?, prenom = ?, email = ?, role = ?";

		jdbcTemplate.update(UPDATE_QUERY, new Object[] { employee.getLogin(), 
				employee.getPassword(), employee.getNom(), employee.getPrenom(), employee.getEmail(), employee.getRole() });

		l.info("Fin de la m�thode saveEmployee");
	}

	// avec JDBCTEMPLATE ID
	public Employee getEmployeebyId(int id) {

		l.info("Debut de la m�thode getEmployee");

		final String SELECT_QUERY = "SELECT ID, login, email, password, prenom, nom, role FROM employe WHERE ID = ?";

		Employee employee = jdbcTemplate.queryForObject(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Employee.class),
				id);
		l.info("Nom : " + employee.getNom());
		l.info("Prenom : " + employee.getPrenom());
		l.info("Fin de la m�thode addEmployee");

		return employee;

	}
}
