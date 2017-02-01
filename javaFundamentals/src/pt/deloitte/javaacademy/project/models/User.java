package pt.deloitte.javaacademy.project.models;

import java.util.Date;
import java.util.List;

public abstract class User {

	private long ID;
	private String name;
	private String surname;
	private String status;
	private Date birthDate;
	private String gender;
	private String mail;
	private String contact;
	private String language;
	private AddressInfo address;
	private List<Account> account;

	/**
	 * Default User constructor.
	 */
	public User() {
	}

	/**
	 * Checks if two users are equal.
	 *
	 * @param obj
	 *            User object to be compared.
	 * @return boolean indicating if two users are the same.
	 */
	@Override
	public boolean equals(Object obj) {

		if ((obj instanceof User) == false) {
			return false;
		}

		User user = (User) obj;

		if (user.getID() == this.ID) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the iD
	 */
	public long getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(long iD) {
		ID = iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the address
	 */
	public AddressInfo getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressInfo address) {
		this.address = address;
	}

	/**
	 * @return the account
	 */
	public List<Account> getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(List<Account> account) {
		this.account = account;
	}

}
