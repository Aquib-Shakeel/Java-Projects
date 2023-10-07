package in.pwskills.nitin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.pwskills.nitin.entity.CoronaVaccine;
import in.pwskills.nitin.service.ICoronoVaccineMgmtService;

@SpringBootApplication
public class SpringBootDataJpa01Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootDataJpa01Application.class, args);

		ICoronoVaccineMgmtService service = applicationContext.getBean(ICoronoVaccineMgmtService.class);
		
		Iterable<CoronaVaccine> result = service.fetchDetails(false, "price");
		result.forEach(System.out::println);
		
		System.out.println("********************************");
		
		Iterable<CoronaVaccine> records = service.fetchDetailsByPageNo(1,3, false, "price");
		records.forEach(System.out::println);
		((ConfigurableApplicationContext) applicationContext).close();
	}
}
