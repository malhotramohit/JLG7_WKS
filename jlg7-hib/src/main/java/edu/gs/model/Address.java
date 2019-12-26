package edu.gs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_gen")
	@SequenceGenerator(name = "address_gen", sequenceName = "address_sq", initialValue = 1, allocationSize = 1)
	private long addId;

	private String addLine1;

	private String addressLine2;

	@ManyToOne
	@JoinColumn(name = "id")
	private Employee employee;

	public Address(String addLine1, String addressLine2) {
		super();
		this.addLine1 = addLine1;
		this.addressLine2 = addressLine2;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAddId() {
		return addId;
	}

	public void setAddId(long addId) {
		this.addId = addId;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addLine1=" + addLine1 + ", addressLine2=" + addressLine2 + "]";
	}

}