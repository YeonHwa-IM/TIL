package com.kh.example.chap01_encapsulation;

public class Account {
	private String name ="박신우";
	private String phone = "010-9462-8140";
	private String pwd ="1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //잔액
	
	// 입금메소드
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	//출금 메소드
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금 되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다. 잔액을 확인하세요.");	
		}
	}
	//잔액 조회 메소드
	public void displaybalance() {
		System.out.println(name + "님의 계좌의 잔액은 " + balance + "원 입니다.");
	}
	
	
}
