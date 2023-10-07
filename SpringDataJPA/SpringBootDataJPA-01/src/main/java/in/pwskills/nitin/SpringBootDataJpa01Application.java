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
		CoronaVaccine vaccine = new CoronaVaccine();
		vaccine.setRegNo(5L);
		vaccine.setCompany("BIOCORN-IND");
		vaccine.setPrice(3500.0);
		
		String status = service.registerVaccine(vaccine);
		System.out.println(status);
		
		((ConfigurableApplicationContext) applicationContext).close();
	}
}
