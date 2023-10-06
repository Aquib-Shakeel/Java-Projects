package in.pwskills.bean;
import java.util.*;
public class Product {
	
	static {
		System.out.println("Product class is loading .....");
	}
private List<String> data;
private Set<String> models;
private Map<Integer,String> modes;
private Properties Context;

public Product(){
	System.out.println("Product Constructor used by spring framework ....");
}
public List<String> getData() {
	return data;
}
public void setData(List<String> data) {
	this.data = data;
}
public Set<String> getModels() {
	return models;
}
public void setModels(Set<String> models) {
	this.models = models;
}
public Map<Integer, String> getModes() {
	return modes;
}
public void setModes(Map<Integer, String> modes) {
	this.modes = modes;
}
public Properties getContext() {
	return Context;
}
public void setContext(Properties context) {
	Context = context;
}
@Override
public String toString() {
	return "Product [data=" + data + ", models=" + models + ", modes=" + modes + ", Context=" + Context + "]";
}



}
