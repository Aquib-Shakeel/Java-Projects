package in.pwskills.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import in.pwskills.bean.Student;


@Configuration
@PropertySource(value = "application.properties")//loading the properties file
public class AppConfig1 {

	@Autowired
private Environment environment;//using the inbuilt object to retrieve from properties file
static {
System.out.println("AppConfig.class file is loading...");
}
@Bean
public Student student() {
System.out.println("Environment impl class is :: " +environment.getClass().getName());

Student student = new Student();
student.setSid(environment.getProperty("sid",Integer.class));
student.setSage(environment.getProperty("sage", Integer.class));
student.setSaddress(environment.getProperty("saddress"));
student.setSname(environment.getProperty("sname"));
return student;
}
}