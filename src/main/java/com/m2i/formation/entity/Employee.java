package com.m2i.formation.entity;

import org.springframework.stereotype.Service;

@Service("employee")
public class Employee {

	private int id;
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private String role;

	public Employee() {

	}

	public Employee(String login, String password, String nom, String prenom, String email, String role) {
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
