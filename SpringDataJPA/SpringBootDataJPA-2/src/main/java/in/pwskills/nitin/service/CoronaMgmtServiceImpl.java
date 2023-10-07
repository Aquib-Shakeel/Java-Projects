package in.pwskills.nitin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.entity.CoronaVaccine;
import in.pwskills.nitin.repository.ICoronaVaccineRepo;

@Service
public class CoronaMgmtServiceImpl implements ICoronoVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo repo;

	@Override
	public Iterable<CoronaVaccine> fetchDetails(boolean asc, String... properties) {

		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		return repo.findAll(sort);

	}

	@Override
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {

		PageRequest pageable = PageRequest.of(pageNo, pageSize, asc ? Direction.ASC : Direction.DESC, properties);

		Page<CoronaVaccine> page = repo.findAll(pageable);
		return page.getContent();
	}

}
