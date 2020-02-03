package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();//인트턴트화 
		
		//현재 잔액 조회 
		a.displaybalance();
		
		a.deposit(1000000);
		a.displaybalance();
		
		a.deposit(1500000);
		a.displaybalance();
		
		a.withdraw(500000);
		a.displaybalance();
		
//		a.balance -= 2000000;
		//The field Account.balance is not visible
		//private은 나 자신(Account)에서만 볼 수 있게끔 제한해주기 때문에
		// 외부 클래스인 Run에서는 볼 수 없음
		
		a.withdraw(500000);
		
	}

}
