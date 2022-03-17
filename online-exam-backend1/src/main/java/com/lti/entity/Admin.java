package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Admin {

	@Id  // hy bagwan bacha
	@GeneratedValue

	private int admin_Id;

	private String admin_Name;

	@Column(unique = true)
	private String admin_Mail;

	@Column(unique = true)
	private int mobile_No;

	private String address;

	private LocalDate dob;

	private String password;
 
	@OneToMany(mappedBy="admin")
	private List<Exam> exam;

	public int getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(int admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getAdmin_Name() {
		return admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}

	public String getAdmin_Mail() {
		return admin_Mail;
	}

	public void setAdmin_Mail(String admin_Mail) {
		this.admin_Mail = admin_Mail;
	}

	public int getMobile_No() {
		return mobile_No;
	}

	public void setMobile_No(int mobile_No) {
		this.mobile_No = mobile_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	
	
}
