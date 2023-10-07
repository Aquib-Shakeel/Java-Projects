package in.pwskills.nitin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CORONA_VACCINE_TAB")
public class CoronaVaccine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long regNo;

	@Column(length = 20)
	public String name;

	@Column(length = 20)
	public String company;

	@Column(length = 20)
	public String country;
	public Double price;
	public Integer requiredDoseCount;

	public CoronaVaccine(String name, String company, String country, Double price, Integer requiredDoseCount) {
		this.name = name;
		this.company = company;
		this.country = country;
		this.price = price;
		this.requiredDoseCount = requiredDoseCount;
	}

	public CoronaVaccine() {
		System.out.println("OBJECT CREATED BY FRAMEWORK...");
	}

	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRequiredDoseCount() {
		return requiredDoseCount;
	}

	public void setRequiredDoseCount(Integer requiredDoseCount) {
		this.requiredDoseCount = requiredDoseCount;
	}

	@Override
	public String toString() {
		return "CoronaVaccine [regNo=" + regNo + ", name=" + name + ", company=" + company + ", country=" + country
				+ ", price=" + price + ", requiredDoseCount=" + requiredDoseCount + "]";
	}

}
