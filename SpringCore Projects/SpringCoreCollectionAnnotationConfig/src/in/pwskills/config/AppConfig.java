package in.pwskills.config;
import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.bean.Product;

@Configuration
public class AppConfig {
static {
System.out.println("AppConfig.class file is loading...");
}

@Bean
public Product getProdObj() {
System.out.println("AppConfig.prodObj()");

Product product = new Product();
product.setData(list());
product.setModels(set());
product.setModes(map());
product.setContext(props());

return product;
}

private Properties props() {
	Properties p = new Properties();
	p.put("Germany", "fossil");
	p.put("China", "Tissot");
	p.put("India", "Omega");
	return p;
}

private Map<Integer, String> map() {
	Map<Integer,String> map=new HashMap<>();
	map.put(10000,"Fossil");
	map.put(20000,"tissot");
	map.put(30000, "omega");
	return map;
}

private Set<String> set() {
	Set<String> hs = new LinkedHashSet<>();
	hs.add("chronography");
	hs.add("digital");
	hs.add("analog");
	return hs;
}

private List<String> list() {
	LinkedList<String> ll = new LinkedList<>();
	ll.add("fossil");
	ll.add("tissot");
	ll.add("omega");
	return ll;
}
}