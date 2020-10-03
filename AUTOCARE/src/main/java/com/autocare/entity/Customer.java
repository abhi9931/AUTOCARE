package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "MyUsers")
@Immutable
public class Customer {

	@Id
	@SequenceGenerator(name = "Cust_Id_Generator", initialValue = 101, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Cust_Id_Generator")
	@Column(name = "id")
	private int id;

	@Column(name = "name", length = 55, nullable = false)
	private String name;

	@Column(name = "username", length = 35, nullable = false, unique = true)
	private String username;

	@Column(name = "password", length = 131, nullable = false)
	private String password;

	@Column(name = "email", length = 65, nullable = false)
	private String email;

	@Column(name = "phone", length = 12, nullable = false)
	private String phone;

	@Column(name = "address", length = 175, nullable = false)
	private String address;

	@Column(name = "role", length = 20, nullable = false)
	private String role;

	@Column(name = "status", nullable = false, columnDefinition = "TINYINT")
	private int status;

	public Customer() {
	}

	public Customer(int id, String name, String username, String password, String email, String phone, String address,
			String role, int status) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.status = status;
	}

	public Customer(String name, String username, String password, String email, String phone, String address,
			String role, int status) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.role = role;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + username + "\t" + password + "\t" + email + "\t" + phone + "\t" + address
				+ "\t" + role + "\t" + status;
	}

}
