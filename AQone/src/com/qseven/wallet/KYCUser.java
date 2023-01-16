package com.qseven.wallet;

public class KYCUser extends User {
	private double rewardPoints;
	
	public KYCUser(int id, String username, String email, double walletBaance) {
		super(id, username, email, walletBaance);
	}

	/**
	 * @return the rewardPoints
	 */
	public double getRewardPoints() {
		return rewardPoints;
	}

	/**
	 * @param rewardPoints the rewardPoints to set
	 */
	public void setRewardPoints(double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	@Override
	public boolean makePayment(double billAmount) {
		if(super.makePayment(billAmount)){
			this.rewardPoints= billAmount*0.10;
		}
		return false;
		
	}
}
