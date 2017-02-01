/**
 * 
 */
package pt.deloitte.javaacademy.project.models;

/**
 * This class represents the Coverage object.
 *
 */
public class Coverage {
	private int identifier;
	private int coverableId;
	private String description;
	private double reserve;
	
	
	/**
	 * @param identifier
	 * @param coverableId
	 * @param reserve
	 */
	public Coverage(int identifier, int coverableId, double reserve) {
		this.identifier = identifier;
		this.coverableId = coverableId;
		this.reserve = reserve;
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
	 * @return the coverableId
	 */
	public int getCoverableId() {
		return coverableId;
	}


	/**
	 * @param coverableId the coverableId to set
	 */
	public void setCoverableId(int coverableId) {
		this.coverableId = coverableId;
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
	 * @return the reserve
	 */
	public double getReserve() {
		return reserve;
	}


	/**
	 * @param reserve the reserve to set
	 */
	public void setReserve(double reserve) {
		this.reserve = reserve;
	}
	
	
	

}
