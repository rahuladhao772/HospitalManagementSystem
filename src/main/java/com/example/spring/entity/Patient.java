package com.example.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospSystem")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Name;
private String Address;
private String BG;
private String phno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getBG() {
	return BG;
}
public void setBG(String bG) {
	BG = bG;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}

public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Patient [id=" + id + ", Name=" + Name + ", Address=" + Address + ", BG=" + BG + ", phno=" + phno + "]";
}


}
