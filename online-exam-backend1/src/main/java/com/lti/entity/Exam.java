package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue
	private int exam_Id;
	private String exam_Name;
	private LocalDate exam_Date;
	
	@ManyToOne
	@JoinColumn(name="level_Id")
	private Level_Table level_Table;
	
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private User_Table user_Table;
	
	@ManyToOne
	@JoinColumn(name="admin_Id")
	

	@OneToMany(mappedBy="exam")
	private List<Exam_Question> exam_question;
	
	
	private Admin admin;

	public int getExam_Id() {
		return exam_Id;
	}

	public void setExam_Id(int exam_Id) {
		this.exam_Id = exam_Id;
	}

	public String getExam_Name() {
		return exam_Name;
	}

	public void setExam_Name(String exam_Name) {
		this.exam_Name = exam_Name;
	}

	public LocalDate getExam_Date() {
		return exam_Date;
	}

	public void setExam_Date(LocalDate exam_Date) {
		this.exam_Date = exam_Date;
	}

	public Level_Table getLevel_Table() {
		return level_Table;
	}

	public void setLevel_Table(Level_Table level_Table) {
		this.level_Table = level_Table;
	}

	public User_Table getUser_Table() {
		return user_Table;
	}

	public void setUser_Table(User_Table user_Table) {
		this.user_Table = user_Table;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

 
	
}