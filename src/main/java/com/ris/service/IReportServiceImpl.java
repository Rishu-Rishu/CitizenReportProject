/**
 * 
 */
package com.ris.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ris.model.CitizenPlan;
import com.ris.model.SearchRequest;
import com.ris.repo.ICitizenPlanRepository;

/**
 * @author Agarw
 *
 */
@Service
public class IReportServiceImpl implements IReportService {

	@Autowired
	private ICitizenPlanRepository repo;
	
	@Override
	public Set<String> getPlaneName() {
		List<CitizenPlan> citizenPlans = repo.findAll();
		Set<String> planNames = new HashSet<String>();
		for(CitizenPlan ls:citizenPlans) {
			planNames.add(ls.getPlanName());
		}
		return planNames;
	}

	@Override
	public Set<String> getPlanStatus() {
		List<CitizenPlan> citizenPlans = repo.findAll();
		Set<String> planStatuses = new HashSet<String>();
		for(CitizenPlan ls:citizenPlans) {
			planStatuses.add(ls.getPlanStatus());
		}
		return planStatuses;
	}

	@Override
	public List<CitizenPlan> getCitizenplans(SearchRequest request) {
		
		List<CitizenPlan> citizenPlans = null;
		if(request.getPlanName() !=null && request.getPlanStatus()!=null) {
			citizenPlans = repo.findByPlanNameAndPlanStatus(request.getPlanName(), request.getPlanStatus());
		}else if(request.getPlanName() != null) {
			citizenPlans = repo.findByPlanName(request.getPlanName());
		}else if(request.getPlanStatus()!=null) {
			citizenPlans = repo.findByPlanStatus(request.getPlanStatus());
		}
		return citizenPlans;
	}

	@Override
	public void exportExcel(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Void exportPdf(HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

}
