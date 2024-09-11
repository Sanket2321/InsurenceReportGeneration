package in.sanketit.service;

import java.util.List;

import in.sanketit.entity.CitizenPlan;
import in.sanketit.request.SearchRequest;

public interface ReportService {
	public List<String> getPlanNames();

	public List<String> getPlanStatues();

	public boolean exportExcel();

	public boolean exportPdf();
	
	
	public List<CitizenPlan> search(SearchRequest request);
	
	

}
