/**
 * 
 */
package pt.deloitte.javaacademy.project.models;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the Coverable object.
 *
 */
public class Coverable {
	private int identifier;
	private int policyId;
	private String description;
	private List<Coverage> coverageList;
	
	
	/**
	 * @param identifier
	 * @param policyId
	 */
	public Coverable(int identifier, int policyId) {
		this.identifier = identifier;
		this.policyId = policyId;
		
		this.coverageList = new ArrayList<>(5);
	}


	/**
	 * @return the identifier
	 */
	public int getIdentifier() {
		return identifier;
	}


	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(int identifier) {
		this.identifier = identifier;
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
