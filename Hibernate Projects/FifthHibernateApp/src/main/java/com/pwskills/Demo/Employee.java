package com.pwskills.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
 private int eid;
	
	
 private String sname;
 private int eage;
 private String eaddress;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getEage() {
	return eage;
}
public void setEage(int eage) {
	this.eage = eage;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", sname=" + sname + ", eage=" + eage + ", eaddress=" + eaddress + "]";
}
 
 

}
