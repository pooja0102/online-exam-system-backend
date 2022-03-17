package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue
	private int question_Id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer_Option;
 
	@OneToMany(mappedBy="question")
	private List<Exam_Question> exam_question;

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer_Option() {
		return answer_Option;
	}

	public void setAnswer_Option(String answer_Option) {
		this.answer_Option = answer_Option;
	}

	public List<Exam_Question> getExam_question() {
		return exam_question;
	}

	public void setExam_question(List<Exam_Question> exam_question) {
		this.exam_question = exam_question;
	}
	
	
	
 
}
