package pt.deloitte.javaacademy.project.models;

import java.util.List;

public class Account {

	private String username;
	private List<String> password;
	private long userID;

	/**
	 * Default Account constructor.
	 */
	public Account() {
	}

	/**
	 * Checks if the account is duplicated.
	 *
	 * @param obj
	 *            The account object to be compared.
	 * @return boolean indicating if two account are the same.
	 */
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Account) == false) {
			return false;
		}

		Account account = (Account) obj;

		if (account.getUserID() == this.userID && account.getUsername().equals(this.username)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public List<String> getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(List<String> password) {
		this.password = password;
	}

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return userID;
	}

	/**
	 * @param userID
	 *            the userID to set
	 */
	public void setUserID(long userID) {
		this.userID = userID;
	}

}
