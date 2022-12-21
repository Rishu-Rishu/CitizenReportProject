/**
 * 
 */
package com.ris.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ris.model.CitizenPlan;

/**
 * @author Agarw
 *
 */
@Repository
public interface ICitizenPlanRepository extends JpaRepository<CitizenPlan, Serializable> {
	
	public List<CitizenPlan> findByPlanName(String PlanName);
	
	public List<CitizenPlan> findByPlanStatus(String PlanStatus);
	
	public List<CitizenPlan> findByPlanNameAndPlanStatus(String PlanName, String PlanStatus);
	

}
