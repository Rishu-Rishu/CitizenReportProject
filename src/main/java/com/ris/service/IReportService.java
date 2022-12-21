/**
 * 
 */
package com.ris.service;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;

import com.ris.model.CitizenPlan;
import com.ris.model.SearchRequest;

/**
 * @author Agarw
 *
 */


public interface IReportService {

	public Set<String> getPlaneName();
	public Set<String> getPlanStatus();
	public List<CitizenPlan> getCitizenplans(SearchRequest request);
	
	public void exportExcel(HttpServletResponse response);
	public Void exportPdf(HttpServletResponse response);
}
