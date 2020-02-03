package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else��
	// if(���ǽ�){
	//		������ ����1;
	//	}else{
	//		������ ����2;
	//  }
	// ���� �Ѱ��� �����ϴ� ���ǹ�
	// ���ǽ� ��� ���� ��(true)�̸� if�� �ȿ� �ִ� ������ ����1 ����
	// ���ǽ� ��� ���� ����(false)�̸� if���� �������� else�� �ȿ� �ִ� ������ ����2 ����
	//
	
	public void method1() {
		//Ű����� �Է��� ���ڰ� ¦������ Ȧ������ �Է�
		
		//'���� �Ѱ��� �Է��ϼ��� : ' �ȳ����� ��� �� num ������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸�"�Է��Ͻ� ���ڴ� Ȧ���Դϴ�. ���
		// ���α׷��� ������ "���α׷� ����"���� ��� �� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else {
				System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}
	
	public void method2() {
//����ڿ��� ����, ����, ���� ������ �Է¹޾Ƽ� ���� kor, eng, math ������ ����
// �� ���������� 40�� �̻��̰� ������ ��� ������ 60�� �̻��� �� "�������",
// �ϳ��� ���� �̴��� �� "���� �����" ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int kor = sc.nextInt();
		System.out.println("���� ���� : ");
		int eng = sc.nextInt();
		System.out.println("���� ���� : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		//**����ȯ ���ֱ� ���ؼ� 3.0���� �Է��Ѵ�.
		// ��� end�� ����� ��.
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("�������");			
		} else {
			System.out.println("��������");
		}
	}
	public void method3() {
		//���ڿ� ���ϱ� : **StringŬ���� �ȿ� �ִ� equals()��� �޼ҵ带 ����ؾ��Ѵ�.
		//**boolean java.lang.String.equals(Object object)..���߿�..
		//������ true, �ٸ��� false�̱⶧���� boolean.
		
		//����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�."
		//���� ������ "������ �ƴմϴ�." ���
		
		//** ==, != ���ڿ����� ==���� ���ϸ� �ȵȴ�.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
			//name�̶� �ڽſ츦 ���ؾ���	
		if(name.equals("�ڽſ�")) { // ���ڿ� �񱳶� ������ ����������
				System.out.println("�����Դϴ�.");
		} else {
				System.out.println("������ �ƴմϴ�.");
		}					
	}		
}
		
	


