package main;

public class Donor extends Person {

	private String bloodBankName;

	private String donorType;

	private String donationDate;

	/**
	 * @return the bloodBankName
	 */
	public String getBloodBankName() {
		return bloodBankName;
	}

	/**
	 * @param bloodBankName
	 *            the bloodBankName to set
	 */
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	/**
	 * @return the donorType
	 */
	public String getDonorType() {
		return donorType;
	}

	/**
	 * @param donorType
	 *            the donorType to set
	 */
	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	/**
	 * @return the donationDate
	 */
	public String getDonationDate() {
		return donationDate;
	}

	/**
	 * @param donationDate
	 *            the donationDate to set
	 */
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	/**
	 * Display Donation Details
	 * 
	 */

	public void displayDonationDetails() {
		System.out.println("Donation Details:");
		System.out.println("Name: " + this.getName());
		System.out.println("Date of Birth: " + this.getDateOfBirth());
		System.out.println("Gender: " + this.getGender());
		System.out.println("Mobile Number: " + this.getMobileNumber());
		System.out.println("Blood Group: " + this.getBloodGroup());
		System.out.println("Blood Bank Name: " + this.getBloodBankName());
		System.out.println("Donor Type: " + this.getDonorType());
		System.out.println("Donation Date: " + this.getDonationDate());

	}
}
