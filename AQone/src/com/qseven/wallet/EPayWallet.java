package com.qseven.wallet;

public class EPayWallet {
	
	public static void main(String[] args) {
		User userc = new User(101, "Jack", "jack@mt.com", 1000);
		User user = new KYCUser(201, "Jill", "jill@mt.com", 3000);
		
//		if(user instanceof User) {
//			EPayWallet.processPaymentyUser(user, 700);
//		}else if(user instanceof KYCUser) {
//		
//		EPayWallet.processPaymentyUser(user, 700);
//		}
//		else {
//			
//		}
	}
	
	public static void processPaymentyUser(User user, double billAmount) {
		
		
		System.out.println("Your current wallet Balance is "+ user.getWalletBaance());
		boolean flag = user.makePayment(billAmount);
		if(flag) {
			System.out.println("Congratulation "+user.getUsername()+", payment of "+billAmount+" was sucessfull!");
			System.out.println("Your wallet balance is "+ user.getWalletBaance());
		}else {
			System.out.println("UnSuccesful!");
			System.out.println("Your wallet balance is "+ user.getWalletBaance());
		}
		
	}

}
