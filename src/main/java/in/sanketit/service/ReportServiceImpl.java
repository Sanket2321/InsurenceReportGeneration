package in.sanketit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sanketit.entity.CitizenPlan;
import in.sanketit.repo.CitizenPlanRepository;
import in.sanketit.request.SearchRequest;
@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private CitizenPlanRepository planrepo;
	

	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlanStatues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
