package com.lti.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Level_Table {

	@Id
	@GeneratedValue
	private int level_id;
	private int level_Number;
	
	@OneToMany(mappedBy="level_Table")
	private List<Exam>exam;

	public int getLevel_id() {
		return level_id;
	}

	public void setLevel_id(int level_id) {
		this.level_id = level_id;
	}

	public int getLevel_Number() {
		return level_Number;
	}

	public void setLevel_Number(int level_Number) {
		this.level_Number = level_Number;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	
}
