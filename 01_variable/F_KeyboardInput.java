package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {

	/*public void inputScanner() {
		Scanner sc = new Scanner(System.in);//���������ϸ� �ٷ� ����Ʈ ���ֱ�.
		
		
		System.out.print("�̸��� �Է��ϼ��� : "); //�ȳ� ���� ���� **��������忡�� �������Ѵ�.
		String name = sc.nextLine();//���ڵ带 �Է��ϸ� ����ڰ� ���� �Է��Ҷ����� ��ٸ�
		
		System.out.println(name);
		
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		
		System.out.println(name + "���� " + age + "��");
		
		System.out.print("Ű(�Ҽ��� ù° �ڸ����� �Է�) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm �Դϴ�.");
		//��ĳ�ʸ� ���� �����ؾ� ����.
		
		
		
	}*/
	public void inputScanner2() {
		//����ڿ��� �̸��� ���̸� �Է¹ޱ�
		
		Scanner sc = new Scanner(System.in);//��������
		
		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.nextLine();//����� ���� ��� �Ʒ��� ������, �ٹٲ��� ������ ����
		
		System.out.print("���̸� �Է����ּ��� : ");
//		int age = sc.nextInt();//�ٹٲ��� ���� 
//		
//		System.out.print("�ּҸ� �Է����ּ���(������) : ");
//		String adress = sc.nextLine(); //�ٹٲ��� ����������
		
		
		//�ذ��ϴ� ���
		//���1. �ٹٲ��� ������ �� �ִ� nextLine() �߰�
//		int age = sc.nextInt();
//		sc.nextLine();//���ۿ� �����ִ� �ٹٲ��� ���ִ�, �������ִ� ����.
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
				
		//���2. age�� �������� nextLine()�� ����, int�� �Ľ��ϱ�
		int age = sc.nextInt(); //������ �ȵǴ�, ���ڸ� ���ڿ��� �ְڴٰ� �ϴ°�.//**
		//�Ľ�:���ڿ��� �⺻�ڷ������� �ٲ��ִ� ��.
		//���� ���ڿ��̶� 1, �ڽſ� �� "1"�� ���ڷδ� ���� "�ڽſ�"�� ���ڷ� ���ٲ�
		//true�� ������ �ٲܼ� ������ �ڽſ�� ������ �ٲܼ�����. �ڽſ츦 ����� �ٲ۴ٰų�.
		//�ڽſ츦 ��Ʈ������ �ٲ۴ٰų� �Ұ���. 
		
//		String  userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge); //��.. �����?
//		//���� �ι����� ������ó�� �ٷ� �̾��ټ� �ִ�. **= int age = integer.parseInt(sc.nextLine());
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String adress = sc.nextLine();
		
		//���3. next()�� �ּҸ� �ޱ�
		//�Ѱ� : �ؽ�Ʈ �޼ҵ带 ���⸦ �����ڷ� �ν��ѱ� ������ ���Ⱑ �� ��� ó���� �� ���� �����´�.
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next(); //nextLine���� �����ʰ� next�� �Ѵ�.

		// + �߰� : char���� �ް� ���� ����? �� ����� �ڷ����� �����ϰ������.
		System.out.print("������ �Է��ϼ��� : ");//F��M���� �ޱ�
//		String userGenger = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0);
		//charAt(int index): ���ڿ����� index��°�� ���ڸ� �������ִ� �޼ҵ�
		//�����ε��� ��ݿ� ���� ���ڿ��� 0��°���� �������ڴٴ� ��.
		
//		System.out.println(name + "����" + age + "���̸�, ��� ���� " + address + "�Դϴ�.");
		System.out.println("gender : " + gender);
		
	}

}
