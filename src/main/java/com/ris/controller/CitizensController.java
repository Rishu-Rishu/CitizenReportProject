/**
 * 
 */
package com.ris.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ris.model.CitizenPlan;
import com.ris.model.SearchRequest;
import com.ris.service.IReportService;

/**
 * @author Agarw
 *
 */
@RestController
public class CitizensController {

	@Autowired
	private IReportService service;
	
	
	@GetMapping("Plan/Names")
	public Set<String> getAllPlaneName(){
		System.out.println("calling");
		return service.getPlaneName();
	}
	
	@GetMapping("/Plan/Status")
	public Set<String> getAllPlaneStatus(){
		return service.getPlanStatus();
	}
	
	@GetMapping("/Citizen/Report")
	public List<CitizenPlan> getCitizenReport(@RequestBody SearchRequest request){
		return service.getCitizenplans(request);
	}
}
