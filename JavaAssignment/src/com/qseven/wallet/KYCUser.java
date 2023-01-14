package com.qseven.wallet;

public class KYCUser extends User {
	private int rewardPoints;
	
	public KYCUser(int id, String username, String email, double walletBaance) {
		super(id, username, email, walletBaance);
	}

	/**
	 * @return the rewardPoints
	 */
	public int getRewardPoints() {
		return rewardPoints;
	}

	/**
	 * @param rewardPoints the rewardPoints to set
	 */
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public boolean makePayment(double billAmount) {
		return false;
		
	}
}
