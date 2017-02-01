/**
 * 
 */
package pt.deloitte.javaacademy.project.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import pt.deloitte.javaacademy.project.sdk.enums.PolicyStatusEnum;


/**
 * This class represents the Claim object.
 *
 */
public class Policy {
	
	private int policyNumber;
	private String description;
	private Date startDate;
	private Date endDate;
	private PolicyStatusEnum status;
	private double limitValue;
	private double premium;
	
	private List<Coverable> coverableList;
	private List<Coverage> coverageList;
	
	
	/**
	 * @param policyNumber
	 * @param startDate
	 * @param status
	 * @param limitValue
	 * @param premium
	 */
	public Policy(int policyNumber, Date startDate, double limitValue,
			double premium) {
		this.policyNumber = policyNumber;
		this.startDate = startDate;
		this.limitValue = limitValue;
		this.premium = premium;
		
		this.status = PolicyStatusEnum.ON_POLICY;
		this.coverableList = new ArrayList<>(10);
		this.coverageList = new ArrayList<>(10);
	}


	/**
	 * @return the policyNumber
	 */
	public int getPolicyNumber() {
		return policyNumber;
	}


	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}


	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}


	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	/**
	 * @return the status
	 */
	public PolicyStatusEnum getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(PolicyStatusEnum status) {
		this.status = status;
	}


	/**
	 * @return the limitValue
	 */
	public double getLimitValue() {
		return limitValue;
	}


	/**
	 * @param limitValue the limitValue to set
	 */
	public void setLimitValue(double limitValue) {
		this.limitValue = limitValue;
	}


	/**
	 * @return the premium
	 */
	public double getPremium() {
		return premium;
	}


	/**
	 * @param premium the premium to set
	 */
	public void setPremium(double premium) {
		this.premium = premium;
	}


	/**
	 * @return the coverableList
	 */
	public List<Coverable> getCoverableList() {
		return coverableList;
	}


	/**
	 * @param coverableList the coverableList to set
	 */
	public void setCoverableList(List<Coverable> coverableList) {
		this.coverableList = coverableList;
	}


	/**
	 * @return the coverageList
	 */
	public List<Coverage> getCoverageList() {
		return coverageList;
	}


	/**
	 * @param coverageList the coverageList to set
	 */
	public void setCoverageList(List<Coverage> coverageList) {
		this.coverageList = coverageList;
	}
	
	
	
	
	
	

}
