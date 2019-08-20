package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_QUESTION")
	@SequenceGenerator(sequenceName = "seq_question", allocationSize = 1, name = "SEQ_QUESTION")

	private int questionId;
	@Column(name="question_desc")
	private String questionDesc;
	
	public Question() {}
	
	public Question(int questionId, String criteria) {
		super();
		this.questionId = questionId;
		this.questionDesc = criteria;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getCriteria() {
		return questionDesc;
	}
	public void setCriteria(String criteria) {
		this.questionDesc = criteria;
	}
	
	

}
