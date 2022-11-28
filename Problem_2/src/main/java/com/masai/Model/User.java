package com.masai.Model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String phoneNo;
	private Date dateofBirth;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Email email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, String phoneNo, Date dateofBirth, Email email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dateofBirth = dateofBirth;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	
	
	
	
	
}
