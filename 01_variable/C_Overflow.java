package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum + 1);
		//Type mismatch: cannot convert from int to byte
		//���ڴ� ��Ʈ���̶� ������ �߻�
		System.out.println("bNum : " + bNum);//run���� ���� ����
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
//		int result = num1 * num2;		
		long result = (long)num1 * num2; //num1�� ������ �������� ������ num2�� ������ �ڵ���ȯ��.
		System.out.println("����� : " + result);
		//�����÷ο� �Ǳ� ������ ������ �ڷ����� �ٲپ� ����ϸ� �ȴ�.
		
	}
	
	
	
	
	
	
	
}
