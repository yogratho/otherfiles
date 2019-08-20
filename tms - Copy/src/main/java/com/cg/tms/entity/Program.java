package com.cg.tms.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "program")
public class Program implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PROGRAM")
	@SequenceGenerator(sequenceName = "seq_program", allocationSize = 1, name = "SEQ_PROGRAM")

	private int trainingId;

	private LocalDate startDate;
	@OneToOne
	@JoinColumn(name = "courseId")
	private Course course;
	@OneToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;
	@OneToOne
	@JoinColumn(name = "centerId")
	private Center center;

//	public static final Comparator<Program> BY_TRAININGID = Comparator.comparing(Program::getTrainingId);

	public Program() {
	}

	public Program(LocalDate trainingStartDate, Course course, Employee employee, Center center) {
		this.startDate = trainingStartDate;
		this.course = course;
		this.employee = employee;
		this.center = center;
	}

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public LocalDate getTrainingStartDate() {
		return startDate;
	}

	public void setTrainingStartDate(LocalDate trainingStartDate) {
		this.startDate = trainingStartDate;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Training ID: " + trainingId + " Start Date: " + startDate + " Course " + course.getCourseName()
				+ " Trainer " + employee.getEmpName() + " Center Name: " + center.getCenterName();
	}

}