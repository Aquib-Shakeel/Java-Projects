package in.pwskills.nitin.service;

import java.util.Optional;

import in.pwskills.nitin.entity.CoronaVaccine;

public interface ICoronoVaccineMgmtService {
	public String registerVaccine(CoronaVaccine vaccine);
	public Iterable<CoronaVaccine> fetchAllDetails();
	public Optional<CoronaVaccine> fetchVaccineById(Long id);
	public String removeVaccineById(Long id);
	public String removeVaccineByObject(CoronaVaccine vaccine);
	public String removeAllVaccines();
}
