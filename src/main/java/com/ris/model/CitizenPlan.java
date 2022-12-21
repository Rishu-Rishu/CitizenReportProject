/**
 * 
 */
package com.ris.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Agarw
 *
 */

@Data
@Entity
@Table(name="CITIZENS_PLAN_INFO")
public class CitizenPlan {

	@Id
	private Integer cid;
	private String planName;
	private String planStatus;
	private String cname;
	private String cemail;
	private String gender;
	private Long phno;
	private Long ssn;
}
