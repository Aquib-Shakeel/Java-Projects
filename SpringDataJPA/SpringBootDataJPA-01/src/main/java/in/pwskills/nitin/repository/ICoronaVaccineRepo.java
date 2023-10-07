package in.pwskills.nitin.repository;

import org.springframework.data.repository.CrudRepository;

import in.pwskills.nitin.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends CrudRepository<CoronaVaccine, Long> {

}
