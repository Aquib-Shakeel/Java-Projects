package in.pwskills.nitin.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.pwskills.nitin.entity.CoronaVaccine;

public interface ICoronaVaccineRepo extends PagingAndSortingRepository<CoronaVaccine, Long> {

}
