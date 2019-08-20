package com.cg.tms.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Skill {

@Id
//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAB_CUSTOMER_SEQ")
//@SequenceGenerator(name="TAB_CUSTOMER_SEQ", sequenceName="TAB_CUSTOMER_SEQ", allocationSize=1)
private int id;


private String employeeid;

private String skilldesc;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Skill [id=" + id + ", employeeId=" + employeeid + ", skillDesc=" + skilldesc + "]";
}
public String getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(String employeeid) {
	this.employeeid = employeeid;
}
public String getSkilldesc() {
	return skilldesc;
}
public void setSkilldesc(String skilldesc) {
	this.skilldesc = skilldesc;
}



}

