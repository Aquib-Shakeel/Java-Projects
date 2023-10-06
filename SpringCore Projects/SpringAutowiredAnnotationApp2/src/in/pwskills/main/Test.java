package in.pwskills.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.bean.Flipkart;
import in.pwskills.config.AppConfig;

public class Test {

	public static void main(String[] args) {


		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart flipkart = applicationContext.getBean(Flipkart.class);
		System.out.println(flipkart);

		String msg=flipkart.shopping(new String[] {"puma","adidas","gucci"}, new float[] {200.0f,300.0f,40000.0f});
		System.out.println(msg);
		
		((AbstractApplicationContext) applicationContext).close();

	}

}
