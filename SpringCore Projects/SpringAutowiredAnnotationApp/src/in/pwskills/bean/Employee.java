package in.pwskills.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	static {
		System.out.println("Employee class is loaded .... ");
	}
	
	public Employee(){
		System.out.println("Employee object iss created .... ");
	}
	
	@Value("10")
	private Integer empid;
	@Value("Aquib")
	private String empname;
    @Value("Lucknow")
	private String empaddress;
	@Value("5000.0")
    private Double empsalary;
	
	@Autowired
	private Address address;
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public Double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(Double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empsalary="
				+ empsalary + ", address=" + address + "]";
	}
	
	

}
