package com.kh.example.chap04_field.controller;

public class A_kindsOfVariable1 { //<== Ŭ���� ������ ����
	
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ� **private ���������ڸ� �ٿ��� �Ѵ�.
	// ==�������
	// ==����ʵ�
	// ==��������
	
	private int glovalNum;
	
	public void mathod1(int num) { //<== �޼ҵ� ������ ����
		//				--------�Ű����� : �޼ҵ��� ����� �� ��ȣ �ȿ� �����ϴ� ����
		
		// �޼ҵ� �������� �ۼ��ϴ� ���� : �������� + �Ű���������
		int localNum;
		// �Ű����� ���� ���������� �������� ������
		// ��ȣ �ȿ� �ִ� �Ű������� �ܺ� Ȥ�� ���� Ŭ�������� ������  ����
		// �״�� �޾ƿ��� ������ �Ѵ�.
		// ex)deposit(int money)<---a.deposit(1000000)
		
		localNum = 10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized
		//: ���������� �ݵ�� �ʱ�ȭ�� �Ǿ�� ��.
		
		System.out.print(num);
		//:num�� ���� �ʱ�ȭ ���� �ʾƵ� ������ �߻����� �ʴ������� �Ű������� num�� �� �ֱ� �����̴�.
		
		System.out.println(glovalNum);
		//:���������̱� ������ �����߻����� �ʴ´�. 10��° ��~ 32��° �ٱ����� ���������� ����.
		
		
		
	} // <==�޼ҵ� ������ ��
	
	public void method2() {
//		System.out.println(localNum);
		//localNum cannot be resolved to a variable 
		//:localNum�� �޼ҵ� ����1 �ȿ����� ����� �����ϴϱ� ������ �߻�.
		// ���������� �ش� ���� �������� ��� ����
		System.out.println(glovalNum);
		// ���������� �ش翵�����̱� ������ ���� ���� ��밡��.
	}
	
} // <== Ŭ���� ������ ��
