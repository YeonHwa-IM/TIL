package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA() ȣ���...");
//		return;
		methodB();//Unreachable code 
				  //������ �����Ҽ� ���� �ڵ��. �׷��� ������ ���� ��� ���� �߻�.
				  //���� �ؿ��� �ڵ带 ���� �ʴ´�. ������ ������� �����ϱ�.
		System.out.println("methodA() ����...");
		
	}
	public void methodB() {
		System.out.println("methodB() ȣ���...");
		methodC();
		System.out.println("methodB() ����...");
		
	}
	public void methodC() {
		System.out.println("methodC() ȣ���...");
		System.out.println("methodC() ����...");
	}
}
