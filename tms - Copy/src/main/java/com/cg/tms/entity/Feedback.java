package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FEEDBACK")
	@SequenceGenerator(sequenceName = "seq_feedback", allocationSize = 1, name = "SEQ_FEEDBACK")
	private int feedbackId;
	
	@OneToOne
	@JoinColumn(name = "studentId")
	private Student participant;

	@OneToOne
	@JoinColumn(name = "trainingId")
	private Program trainingProgram;

	@OneToOne
	@JoinColumn(name = "questionid")
	private Question questionId;

	@Column(name = "rating")
	private int rating;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public Student getParticipant() {
		return participant;
	}

	public void setParticipant(Student participant) {
		this.participant = participant;
	}

	public Program getTrainingProgram() {
		return trainingProgram;
	}

	public void setTrainingProgram(Program trainingProgram) {
		this.trainingProgram = trainingProgram;
	}

	public Question getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Feedback(Student participant, Program trainingProgram, Question questionId, int rating) {
		this.participant = participant;
		this.trainingProgram = trainingProgram;
		this.questionId = questionId;
		this.rating = rating;
	}

	public Feedback() {
	}

}