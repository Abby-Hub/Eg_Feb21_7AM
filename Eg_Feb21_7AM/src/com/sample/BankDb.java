package com.sample;

public class BankDb {
		public static  void saveAccInfo(BankAccount custInfo) {
			
			
			// manuplations
			//custInfo.balance = 500;  // Direct Access
			System.out.println(custInfo.accId);
			System.out.println(custInfo.accName);
		//	System.out.println(custInfo.balance);

			System.out.println("Logic to Save AccInfo In DataBase");
			
		}
}
