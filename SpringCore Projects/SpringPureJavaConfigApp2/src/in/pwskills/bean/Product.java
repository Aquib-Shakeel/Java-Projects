package in.pwskills.bean;
import java.util.*;
public class Product {
	private Integer pid;
	private String pname;
	private Double pcost;
	private Model model;
	
	
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	static {
		System.out.println("Product.class file is loading .... ");
	}
	
	
	public Product() {
		System.out.println("Product object is created .....  ");
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPcost() {
		return pcost;
	}

	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + ", model=" + model + "]";
	}


	
	
}
