package in.pwskills.config;
import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pwskills.bean.Model;
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
product.setPcost(10000.0);
product.setModel(modelObj());
product.setPid(10);
product.setPname("Fossil");

return product;
}

public Model modelObj() {
	Model model = new Model();
	model.setMid(0001);
	model.setMtype("Analog");
	return model;
}

}