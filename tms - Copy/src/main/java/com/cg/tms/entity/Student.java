package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STUDENT")
	@SequenceGenerator(sequenceName = "seq_student", allocationSize = 1, name = "SEQ_STUDENT")

	private int studentId;
	private String studentName;
	@OneToOne
	@JoinColumn(name="trainingId")
	private Program program;

	public Student() {
	};

	public Student(String studentName, Program program) {

		this.studentName = studentName;
		this.program = program;

	}

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student Id " + getStudentId() + "Name: " + getStudentName();
	}

}