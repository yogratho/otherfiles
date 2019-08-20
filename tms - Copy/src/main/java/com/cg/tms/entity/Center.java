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
@Table(name = "center")
public class Center implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CENTER")
	@SequenceGenerator(sequenceName = "seq_center", allocationSize = 1, name = "SEQ_CENTER")

	private  int centerId;
	private String centerName;
	@OneToOne
	@JoinColumn(name="addressid")
		private Address address;

	public Center() {
	}

	public Center(int centerId, String centerName,Address address) {

		this.centerId = centerId;
		this.centerName = centerName;
		this.address= address;

	}
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	@Override
	public boolean equals(Object obj) {
		return this.centerId == ((Center) obj).centerId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + centerId + " Center Name: " + centerName + " Address: ";
	}

}