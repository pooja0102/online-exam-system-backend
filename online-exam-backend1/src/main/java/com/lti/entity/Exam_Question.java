package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exam_question")

public class Exam_Question {

	@Id
	@GeneratedValue
	private int exam_Question_Id;
	private int exam_Id;
	private int question_Id;

	@ManyToOne
	@JoinColumn(name = "exam_Id")
	private Exam exam;

	@ManyToOne
	@JoinColumn(name = "question_Id")
	private Question question;

	public int getExam_Question_Id() {
		return exam_Question_Id;
	}

	public void setExam_Question_Id(int exam_Question_Id) {
		this.exam_Question_Id = exam_Question_Id;
	}

	public int getExam_Id() {
		return exam_Id;
	}

	public void setExam_Id(int exam_Id) {
		this.exam_Id = exam_Id;
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
