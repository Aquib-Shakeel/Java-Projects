package in.pwskills.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.bean.Employee;
import in.pwskills.config.AppConfig;

public class Test {

	public static void main(String[] args) {


		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee = applicationContext.getBean(Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext) applicationContext).close();

	}

}
