package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "result")
public class Result {
	
	@Id
	@GeneratedValue
	private int result_Id;
	
	
	@OneToOne
	@JoinColumn(name="exam_Id")
	private Exam exam;
	
	@OneToOne
	@JoinColumn(name="user_Id")
	private User_Table user_table;
	
	private boolean status;
	private float score;
	public int getResult_Id() {
		return result_Id;
	}
	public void setResult_Id(int result_Id) {
		this.result_Id = result_Id;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public User_Table getUser_table() {
		return user_table;
	}
	public void setUser_table(User_Table user_table) {
		this.user_table = user_table;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	 
	
	

}
