package com.oops.Constructors;

public class AccountClass {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	//constructor
	public AccountClass() {
		this("5555", 2.5, "default name", "default address", "default phone");// to call parameterized constructor from 
		//empty constructor to define any default values for the parameters.
		System.out.println("Empty constructor called.");
	}
	
	//parameterized constructor
	public AccountClass(String number, double balance, String customerName, String customerEmailAddress, 
			String customerPhoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
		
	public AccountClass(String customerName, String customerEmailAddress, String customerPhoneNumber) {
		this("54646", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
		
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of "+ depositAmount+" made. New balance is "+ this.balance);
	}
	
	public void withdrawl(double withdrawlAmount) {
		if(this.balance - withdrawlAmount < 0) {
			System.out.println("Only "+this.balance+" avaliable. Withdrawl not processed");
		}else {
			this.balance -= withdrawlAmount;
			System.out.println("withdrawl of "+ withdrawlAmount+" processed. Remaining balance = "+ this.balance );
		}
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	

}
