package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age;//�Ϲݺ��� ����
		final int AGE;//�������
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		//������ �� ����
		age = 30;
//		AGE = 30; //�̹� �Ҵ�Ǿ� �ִٴ� ������ ��.
		//The final local variable AGE may already have been assigned
		//: AGE�� final�� ���� ����ε�, ����� �ѹ��� ���� �����Ҽ� �ְ� �� ������ �Ұ�����.
		// �׷��� 16��° �ٿ��� AGE�� 30�̶�� ������ ������ �Ϸ��� �ϴ� ���� ���ؼ� ������ �Ұ����ϴٸ鼭 ������.
		//��ĥ���ִ� ��� ����.-> �� ������ ��ĥ�� ���� ������ �ּ�ó��.
		
		System.out.println("�� ���� �� age : " + age);
		System.out.println("�� ���� �� AGE : " + AGE);
	
	
	}

}
