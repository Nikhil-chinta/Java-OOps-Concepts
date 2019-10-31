package com.oops.Constructors;

public class AccountMainClass {
	public static void main(String[] args) {
		
	AccountClass nikAccount = new AccountClass();//"12345", 0.00, "Nik", "email@nik.com", "9876543210");
//		nikAccount.setNumber("12345");
//		nikAccount.setBalance(0.00);
//		nikAccount.setCustomerName("Nik");
//		nikAccount.setCustomerEmailAddress("email@nik.com");
//		nikAccount.setCustomerPhoneNumber("9876543210"); instead of setting each parameter, set all these parameters using a constructor!! 
	
		System.out.println(nikAccount.getNumber());
		System.out.println(nikAccount.getBalance());
		
		System.out.println("**************************");
		
		AccountClass timAccount = new AccountClass("Tim","tim@email.com","11111");
		System.out.println(timAccount.getNumber()+" name "+timAccount.getCustomerName());
//		nikAccount.withdrawl(100.0);
//		
//		nikAccount.deposit(50);
//		nikAccount.withdrawl(100);
//		nikAccount.deposit(51);
//		nikAccount.withdrawl(100);
		
		
	}

}
