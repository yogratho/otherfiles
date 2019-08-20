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
@Table(name = "employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 * 
	 */
	public Employee() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLOYEE")
	@SequenceGenerator(sequenceName = "seq_employee", allocationSize = 1, name = "SEQ_EMPLOYEE")
	private int employeeId;
	
	private String employeeName;
	@OneToOne
	@JoinColumn(name = "roleid")
	private Roles role;

	public int getEmpId() {
		return employeeId;
	}

	public void setEmpId(int empId) {
		this.employeeId = empId;
	}

	public String getEmpName() {
		return employeeName;
	}

	public void setEmpName(String empName) {
		this.employeeName = empName;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

	public Employee(String empName, Roles role) {
		this.employeeName = empName;
		this.role = role;
	}

}