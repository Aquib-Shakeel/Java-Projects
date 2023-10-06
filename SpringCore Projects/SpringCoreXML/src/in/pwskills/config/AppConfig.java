package in.pwskills.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.pwskills.bean.Student;
@Configuration
public class AppConfig {
static {
System.out.println("AppConfig.class file is loading...");
}

@Bean
public Student studObj() {
System.out.println("AppConfig.studObj()");
Student student = new Student();
student.setSid(7);
student.setSname("dhoni");
student.setSaddress("CSK");
student.setSage(41);
return student;
}
}
