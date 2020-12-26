package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposited Amount is 200000");
	}
	
	public static void main(String[] args) {
		BankInfo ab= new AxisBank();
		ab.deposit();
		
	}

}
