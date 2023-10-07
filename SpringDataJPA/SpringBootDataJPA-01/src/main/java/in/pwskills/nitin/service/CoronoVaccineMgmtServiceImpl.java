package in.pwskills.nitin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.entity.CoronaVaccine;
import in.pwskills.nitin.repository.ICoronaVaccineRepo;

@Service("vaccineMgmtService")
public class CoronoVaccineMgmtServiceImpl implements ICoronoVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public String registerVaccine(CoronaVaccine vaccine) {

		System.out.println("Implementation class is :: " + repo.getClass().getName());

		CoronaVaccine savedVaccine = null;
		if (vaccine != null)
			savedVaccine = repo.save(vaccine);

		return savedVaccine != null ? "vaccine registerd/updated succesfully :: " + savedVaccine.getRegNo()
				: "Vaccine registartion/updation failed";
	}

	@Override
	public Iterable<CoronaVaccine> fetchAllDetails() {
		return repo.findAll();
	}

	@Override
	public Optional<CoronaVaccine> fetchVaccineById(Long id) {
		return repo.findById(id);
	}

	@Override
	public String removeVaccineById(Long id) {
		Optional<CoronaVaccine> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.deleteById(id);
			return "record deleted having id ::"+id;
		} else {
			return "record not available for deletion with the id:: "+id;
		}
	}

	@Override
	public String removeVaccineByObject(CoronaVaccine vaccine) {
		
		Optional<CoronaVaccine> optional = repo.findById(vaccine.getRegNo());
		if (optional.isEmpty()) {
			return "record not found for deletion";
		} else {
			repo.delete(vaccine);
			return "record deleted with the id:: "+vaccine.getRegNo();
		}
	}

	@Override
	public String removeAllVaccines() {
		long count = repo.count();
		if (count!=0) {
			repo.deleteAll();
			return "No of records deleted are :: "+count;
		} else {
			return "Table is empty no records to delete...";
		}
	}

}
