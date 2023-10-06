package in.pwskills.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import in.pwskills.bean.Student;
import in.pwskills.config.AppConfig1;
public class Test {
public static void main(String[] args) {
// Starting the container and informing the configuration file to scan for SpringBean

ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig1.class);
// use the object created by the IOC-Container
Student std = applicationContext.getBean("student", Student.class);
System.out.println(std);
//closing the container
((AbstractApplicationContext) applicationContext).close();

}
}