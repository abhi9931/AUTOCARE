package car.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "username", length = 35, nullable = false)
	private String username;
	
	@Column(name = "password", length = 131 , nullable = false)
	private String password;
	
	@Column(name = "fname", length = 15, nullable = false)
	private String fname;
	
	@Column(name = "lname", length = 15)
	private String lname;
	
	@Column(name = "email", length = 45, nullable = false)
	private String email;
	
	@Column(name = "phone", length = 10, nullable = false)
	private String phone;
	
	@Column(name = "active", nullable = false)
	private int active;
	
	public Register() {}
	
	public Register( String username, String password, String fname, String lname, String email, String phone, int active) {
		super();
		this.username = username;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.active = active;
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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return username + "\t" + password + "\t" + fname + "\t" + lname + "\t" + email + "\t" + phone + "\t" + active;
	}
	
}
