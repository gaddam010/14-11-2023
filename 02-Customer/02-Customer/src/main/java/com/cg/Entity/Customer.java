package com.cg.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
 
@Entity
public class Customer {
@Id
private int id;
private String name;
private String city;
private int mblnum;
public Customer() {
	
}
public Customer(int id, String name, String city, int mblnum) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.mblnum = mblnum;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getMblnum() {
	return mblnum;
}
public void setMblnum(int mblnum) {
	this.mblnum = mblnum;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", mblnum=" + mblnum + "]";
}
 
	
 
}
 
