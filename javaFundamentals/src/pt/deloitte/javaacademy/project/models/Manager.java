package pt.deloitte.javaacademy.project.models;

import java.util.List;

public class Manager extends User {

	private List<Client> client;

	/**
	 * Default Manager constructor.
	 */
	public Manager() {
		super();
	}

	/**
	 * Creates a claim.
	 */
	public void createClaim() {
		// TODO
	}

	/**
	 * Creates a policy.
	 */
	public void createPolicy() {
		// TODO
	}

	/**
	 * Creates an account.
	 */
	public void createAccount() {
		// TODO
	}

	/**
	 * Creates a client.
	 */
	public void createClient() {
		// TODO
	}

	/**
	 * @return the client
	 */
	public List<Client> getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(List<Client> client) {
		this.client = client;
	}

}
