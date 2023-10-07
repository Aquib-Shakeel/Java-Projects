package in.pwskills.nitin.service;

import in.pwskills.nitin.entity.CoronaVaccine;

public interface ICoronoVaccineMgmtService {
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String...properties);
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties);
}
