package pt.deloitte.javaacademy.project.models;

import java.util.Date;

import pt.deloitte.javaacademy.project.sdk.enums.ClaimStatusEnum;

/**
 * This class represents the Claim object.
 *
 */
public class Claim {

	private int claimNumber;
	private String description;
	private int policyId;
	private Date incidentDate;
	private double reserveValue;
	private ClaimStatusEnum status;
	private String type;
	private double value;
	
	
	/**
	 * 
	 */
	public Claim() {
	}


	/**
	 * @param claimNumber
	 * @param policyId
	 * @param incidentDate
	 * @param reserveValue
	 * @param type
	 * @param value
	 */
	public Claim(int claimNumber, int policyId, Date incidentDate, double reserveValue,
			String type, double value) {
		this.claimNumber = claimNumber;
		this.policyId = policyId;
		this.incidentDate = incidentDate;
		this.reserveValue = reserveValue;
		this.type = type;
		this.value = value;
		
		this.status = ClaimStatusEnum.DRAFT;
	}


	/**
	 * @return the claimNumber
	 */
	public int getClaimNumber() {
		return claimNumber;
	}


	/**
	 * @param claimNumber the claimNumber to set
	 */
	public void setClaimNumber(int claimNumber) {
		this.claimNumber = claimNumber;
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
	 * @return the policyId
	 */
	public int getPolicyId() {
		return policyId;
	}


	/**
	 * @param policyId the policyId to set
	 */
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}


	/**
	 * @return the incidentDate
	 */
	public Date getIncidentDate() {
		return incidentDate;
	}


	/**
	 * @param incidentDate the incidentDate to set
	 */
	public void setIncidentDate(Date incidentDate) {
		this.incidentDate = incidentDate;
	}


	/**
	 * @return the reserveValue
	 */
	public double getReserveValue() {
		return reserveValue;
	}


	/**
	 * @param reserveValue the reserveValue to set
	 */
	public void setReserveValue(double reserveValue) {
		this.reserveValue = reserveValue;
	}


	/**
	 * @return the status
	 */
	public ClaimStatusEnum getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(ClaimStatusEnum status) {
		this.status = status;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	
	
	
	
	
	
	
}
