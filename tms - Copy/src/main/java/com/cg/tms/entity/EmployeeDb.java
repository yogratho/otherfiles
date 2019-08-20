package com.cg.tms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeedb")
public class EmployeeDb {
	
	@Id
	@Column(name="employeeid")
	private String employeeid;
	
	
	@Column(name="employeename")
	private String employeename;
	
	@Column(name="employeerole")
	private String employeerole;

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeerole() {
		return employeerole;
	}

	public void setEmployeerole(String employeerole) {
		this.employeerole = employeerole;
	}

	
	

}
