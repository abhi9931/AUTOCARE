package car.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bstaff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "username")
	private String s_username;
	
	@Column(name = "password")
	private String s_password;
	
	@Column(name = "fname")
	private String s_fname;
	
	@Column(name = "lname")
	private String s_lname;
	
	@Column(name = "email")
	private String s_email;
	
	@Column(name = "phone")
	private String s_phone;
	
	@Column(name = "designation")
	private String s_designation;
	
	@Column(name = "active")
	private int active;

	public Staff() {}
	
	public Staff( String s_username, String s_password, String s_fname, String s_lname, String s_email,
			String s_phone, String s_designation, int active) {
		super();
		this.s_username = s_username;
		this.s_password = s_password;
		this.s_fname = s_fname;
		this.s_lname = s_lname;
		this.s_email = s_email;
		this.s_phone = s_phone;
		this.s_designation = s_designation;
		this.active = active;
	}
	
	public Staff(String s_username, String s_password, String s_fname, String s_lname, String s_email,
			String s_phone, int active) {
		super();
		this.s_username = s_username;
		this.s_password = s_password;
		this.s_fname = s_fname;
		this.s_lname = s_lname;
		this.s_email = s_email;
		this.s_phone = s_phone;
		this.active = active;
	}

	public String getS_username() {
		return s_username;
	}

	public void setS_username(String s_username) {
		this.s_username = s_username;
	}

	public String getS_password() {
		return s_password;
	}

	public void setS_password(String s_password) {
		this.s_password = s_password;
	}

	public String getS_fname() {
		return s_fname;
	}

	public void setS_fname(String s_fname) {
		this.s_fname = s_fname;
	}

	public String getS_lname() {
		return s_lname;
	}

	public void setS_lname(String s_lname) {
		this.s_lname = s_lname;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public String getS_phone() {
		return s_phone;
	}

	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}

	public String getS_designation() {
		return s_designation;
	}

	public void setS_designation(String s_designation) {
		this.s_designation = s_designation;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return s_username + "\t" + s_password + "\t" + s_fname + "\t" + s_lname + "\t" + s_email + "\t" + s_phone + "\t" + s_designation + "\t" + active;
	}
	
	
}
