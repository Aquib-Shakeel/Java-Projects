package com.pwskills.Demo;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
public class Student {
 @Id
  private int rollNo;
  private String name;
  private int marks;
  
  @Temporal(TemporalType.DATE)
  private Date dt1;
  @Temporal(TemporalType.TIME)
  private Date dt2;
  @Temporal(TemporalType.TIMESTAMP)
  private Date dt3;

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}



public Date getDt1() {
	return dt1;
}
public void setDt1(Date dt1) {
	this.dt1 = dt1;
}
public Date getDt2() {
	return dt2;
}
public void setDt2(Date dt2) {
	this.dt2 = dt2;
}
public Date getDt3() {
	return dt3;
}
public void setDt3(Date dt3) {
	this.dt3 = dt3;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + ", dt1=" + dt1 + ", dt2=" + dt2
			+ ", dt3=" + dt3 + "]";
}

  
}
