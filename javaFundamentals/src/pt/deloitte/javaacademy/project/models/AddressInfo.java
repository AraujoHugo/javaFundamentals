package pt.deloitte.javaacademy.project.models;

public class AddressInfo {

	private String street;
	private String street2;
	private String number;
	private String postalCode;
	private String city;
	private String country;
	private int userID;

	/**
	 * Default AddressInfo constructor.
	 */
	public AddressInfo() {
	}

	/**
	 * Checks if two addresses are equal.
	 *
	 * @param obj
	 *            AddressInfo object to be compared.
	 * @return boolean indicating if two addresses are the same.
	 */
	@Override
	public boolean equals(Object obj) {

		if ((obj instanceof AddressInfo) == false) {
			return false;
		}

		AddressInfo address = (AddressInfo) obj;

		if (address.getNumber().equals(this.number) && address.getPostalCode().equals(this.postalCode)
				&& address.getCity().equals(this.city) && address.getCountry().equals(this.country)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the street2
	 */
	public String getStreet2() {
		return street2;
	}

	/**
	 * @param street2
	 *            the street2 to set
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

}
