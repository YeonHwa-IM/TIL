package com.kh.example.chap01_encapsulation;

public class Run {
	public static void main(String[] args) {
		Account a = new Account();//��Ʈ��Ʈȭ 
		
		//���� �ܾ� ��ȸ 
		a.displaybalance();
		
		a.deposit(1000000);
		a.displaybalance();
		
		a.deposit(1500000);
		a.displaybalance();
		
		a.withdraw(500000);
		a.displaybalance();
		
//		a.balance -= 2000000;
		//The field Account.balance is not visible
		//private�� �� �ڽ�(Account)������ �� �� �ְԲ� �������ֱ� ������
		// �ܺ� Ŭ������ Run������ �� �� ����
		
		a.withdraw(500000);
		
	}

}
