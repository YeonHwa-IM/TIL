package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100;
		// boolean �ڷ����� ������ true, false�� �� �� ����(����ȯ ����)
	
		int num = 'A';//���ڴ� ��� ���ڷ� ȣȯ�� �Ǳ� ������ ���� �ȿ� ���ڰ� �����ִ�.
		System.out.println("num : " + num);
		
		char ch = 97;//���ͷ��� �ְ� �ִ°�.
		System.out.println("ch : " + ch);
		
		char ch2 = (char)num; //������ �ְ� �ִ°�. int�� char�� �ִ°�
		//Type mismatch: cannot convert from int to char
		//:�������� ���� ��ȯ�Ҽ�����.
		//97�� ���ͷ�������, num�� ������. num�� ũ�⸸ �����ִ�.(4����Ʈ)
		//���ڰ� ����� ������ ���� ����ȯ�� ����.(char)�� num�տ� ���̱�.
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3); 
		// ���� ����� �Է��� ���� ������ ���ֱ⶧���� ?�� ��. ����ǥ��� ���� �ߴ°� �ƴϴ�.
}
	public void rule2() {	
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		//Type mismatch: cannot convert from long to int
		// ������ ū �ڷ������� �ڵ� ����Ȳ�� �� �� ����ó���� �Ǳ� ������ 
		//iNum +lNum �� ����� long���� �� ����
		
		// iNum + lNum�� int result �� �����Ҽ��ִ¹��
		//���1.�������� int�� ���� ����ȯ�ϴ� ���
		int result = (int)(iNum + lNum); 
		
		//���2. long���� int�� ��������ȯ��Ű�� ���
		int result2 = iNum + (int)lNum;
		
		//����. ������� �����ϴ� result�� long������ �޴� ���
		long result3 = iNum + lNum;
		
		
	}
	
	
	public void rule3() {
		int iNum = 290;
		
//		byte bNum = iNum;
		//Type mismatch: cannot convert from int to byte
		//��Ʈ��� ū �ڷ����� ���̸��� ���� ������ ������ ��
		byte bNum = (byte)iNum;
		
		System.out.println("bNum : " + bNum);
		//��������� 34�� ������ ������ �ս��� �Ͼ��. �߷��� �κп� �����Ͱ� �־��� ������ ���� 290���� 34�� ��Ÿ��.
		
		// �ٽ�, int�� 4����Ʈ, �̰� byte 1����Ʈ �ڷ����� �������� �ϴ�, ���ִܳٺ��� ������ �ս��� �����Ѵ�.
		//������ �����÷ο찡 �ƴ� ������ �ս��̵Ǿ���.
		
		
	
		
		
		
		
	}

}
