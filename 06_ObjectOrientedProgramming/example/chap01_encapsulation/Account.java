package com.kh.example.chap01_encapsulation;

public class Account {
	private String name ="�ڽſ�";
	private String phone = "010-9462-8140";
	private String pwd ="1q2w3e4r";
	private int bankCode = 3030;
	private int balance = 0; //�ܾ�
	
	// �Աݸ޼ҵ�
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	//��� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��� �Ǿ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");	
		}
	}
	//�ܾ� ��ȸ �޼ҵ�
	public void displaybalance() {
		System.out.println(name + "���� ������ �ܾ��� " + balance + "�� �Դϴ�.");
	}
	
	
}
