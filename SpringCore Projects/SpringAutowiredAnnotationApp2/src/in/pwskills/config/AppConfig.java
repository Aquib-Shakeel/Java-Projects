package in.pwskills.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="in.pwskills.bean")
public class AppConfig {
static {
System.out.println("AppConfig.class file is loading...");
}

@Bean
public Date dateObj() {
	
	return new java.util.Date(); 
	
}

}