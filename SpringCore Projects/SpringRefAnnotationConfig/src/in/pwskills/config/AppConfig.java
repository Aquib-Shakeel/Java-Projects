package in.pwskills.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="in.pwskills.bean")
public class AppConfig {
static {
System.out.println("AppConfig.class file is loading...");
}


}