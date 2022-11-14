package com.sagar.springmvcmaster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustemerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int srno;
	String name;
	String mobile;
	String address;
	String address2;
	String city;
	String state;
	String zip;
	
	
	public CustemerDetails() {
		super();
		
	}
	
	

	public CustemerDetails(int srno, String name, String mobile, String address, String address2, String city,
			String state, String zip) {
		super();
		this.srno = srno;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}



	public int getSrno() {
		return srno;
	}



	public void setSrno(int srno) {
		this.srno = srno;
	}



	@Override
	public String toString() {
		return "CustemerDetails [srno=" + srno + ", name=" + name + ", mobile=" + mobile + ", address=" + address
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
	

}
