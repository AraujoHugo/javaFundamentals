package pt.deloitte.javaacademy.project.models;

import java.util.List;

public class Client extends User {

	private List<Policy> policy;
	private List<Claim> claim;
	private String currency;

	/**
	 * Default Client constructor.
	 */
	public Client() {
		super();
	}

	/**
	 * Creates a claim.
	 *
	 * @param claim
	 *            The claim object to be created.
	 */
	public void createClaim(Claim claim) {
		// TODO
	}

	/**
	 * Creates a payment.
	 *
	 * @param policy
	 *            The policy to perform the payment.
	 * @param claim
	 *            The claim which originated the payment.
	 */
	public void makePayment(Policy policy, Claim claim) {
		// TODO
	}

	/**
	 * Lists claims history records (last 10 records).
	 *
	 * @param claims
	 *            The claim list to be viewed.
	 */
	public void createClaim(List<Claim> claims) {
		// TODO
	}

	/**
	 * Gets the policy information details.
	 *
	 * @param policy
	 *            The policy to obtain the details.
	 */
	public void viewPolicyDetails(Policy policy) {
		// TODO
	}

	/**
	 * @return the policy
	 */
	public List<Policy> getPolicy() {
		return policy;
	}

	/**
	 * @param policy
	 *            the policy to set
	 */
	public void setPolicy(List<Policy> policy) {
		this.policy = policy;
	}

	/**
	 * @return the claim
	 */
	public List<Claim> getClaim() {
		return claim;
	}

	/**
	 * @param claim
	 *            the claim to set
	 */
	public void setClaim(List<Claim> claim) {
		this.claim = claim;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
