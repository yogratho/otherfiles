package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ADDRESS")
//	@SequenceGenerator(sequenceName = "seq_address", allocationSize = 1, name = "SEQ_ADDRESS")

	private int addressid;

	private String line1;

	private String line2;

	private String state;

	private int pincode;

	public Address() {
	}

	public Address(int id, String line1, String line2, String state, int pincode) {
		this.addressid = id;
		this.line1 = line1;
		this.line2 = line2;
		this.state = state;
		this.pincode = pincode;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
