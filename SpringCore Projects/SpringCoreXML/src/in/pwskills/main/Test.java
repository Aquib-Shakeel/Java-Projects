package in.pwskills.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.pwskills.bean.Student;
import in.pwskills.config.AppConfig;

public class Test {

	public static void main(String[] args) {


		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student std = applicationContext.getBean("studObj",Student.class);
		System.out.println(std);
		
		((AbstractApplicationContext) applicationContext).close();

	}

}
