package com.kh.variable;

public class A_variable {//Ŭ����
	
	public void declareVariable() { // �޼ҵ�
		//�������� �� �ʱ�ȭ
		//A. �������� : �ڷ��� ������;
		//1.����
		boolean isTrue;
		
		//2.������
		// 2-1. ����
		char ch;
		//2.2. ���ڿ�
		String str; // S�빮�ڷ� �����Ѵ�!!
		
		//3.������
		//3-1. ����
		byte bNum;
		short sNum;
		int iNum;
		long LNum;
		//3-2. �Ǽ�
		float fNum;
		double dNum;
		//B. �ʱ�ȭ : ������=��;
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		LNum = 8L; // ���ΰ��� �˷��ֱ����ؼ� �빮�� L�� ���δ�.
//		fNum = 4.0f; // �Ǽ��� �⺻���� ���ҷ� ����. ������ 8����Ʈ �̱⶧���� 
		// 8����Ʈ¥���� 4����Ʈ�� �����ϱ� �ȵǼ� �����޼����� ���
		// ������ ��ġ���� ���� �ڿ� f�� ���δ�.
		//Type mismatch: cannot convert from double to float
		//4.0�� �Ǽ��ε� �⺻������ �Ǽ��� double�� �⺻���̱� ������ 4.0�� float�� �ƴ� double���� ��������
		//�ٵ� fNum�� �ڷ����� float(4byte)���� �ְ��� �ϴ¤� ������ 8byte�� double���̱� ������ 
		//ū���� ���� ������ ������� �� ���ٸ鼭 ������ ����
		fNum = 4.0f;
		dNum = 8.0;
		
		ch = 'A';
		str = "A";//���ڿ��� ū ����ǥ�� �̿��ؼ� �׾ȿ� ���� �ִ´�."=���� �����̼�
		// �ѱ��ڴ� char str�� "�ѱ����̻�" , ��ǻ� �ѱ��ڸ� ��Ʈ���� �־ �ȴ�.
		// char�� ������ �ѱ���, stirng�� �ѱ���, Ȥ�� �ѱ��� �̻�
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("LNum�� �� : " + LNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		//����޼ҵ带 ���� ������ش�.
	}
	
	public void initVariable() {
		//��������� ���ÿ� �ʱ�ȭ
		//1. ����
		boolean isTrue = false;
		//2. ������
		//2-1. ����
		char ch = '��';
		//2-2. ���ڿ�
		String str = "KH����������";
		//3. ������
		//3-1. ����
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L; //���ΰ��� �˷��ֱ� ���ؼ� L�� �ۼ�
		
		//3-2. �Ǽ�
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("ch�� �� : " + ch);
		System.out.println("Str�� �� : " + str);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);//���԰� ��������.
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		
	}
	
}		
// **���� �߰�ȣ ���ڿ� ���缭 ������ �ݾ������