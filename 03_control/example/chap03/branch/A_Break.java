package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	//break���� �ڽ��� ���Ե� ���尡��� �ݺ����� ����
	
	public void method1() {
		//���ڿ��� �Է� �޾� ���� (Scanner)
		//������ ����ϴ� �ݺ� ���α׷� (length())�� ����ϴ� �ݺ�(do~while)���α׷�
		// ��, end�� �ԷµǸ� �ݺ� ����
		// do~while ���
		
		String str = " ";
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("���ڿ��� �Է� : ");
			str = sc.nextLine();
		
			if(str.equals("end")) {
				break;//�극��ũ�� �����ݷ� ���̿� Ŀ���� �θ� ��� �������� ǥ�����ش�.
			}
		
			System.out.println(str + "�� ���� ���� : " + str.length());
		
		} while(true); //���Ǿȿ� true�� ���� ���ѹݺ����̶�� �Ѵ�.
						//�ٸ����� ���� ������� �Ѵ�.
		
	}
	public void method2() {
		//1���� ����ڿ��� �Է¹��� ���ڱ����� �� ���
		//for�� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1;/* i <= num;*/; i++) {
			sum += i;
			
			if(i == num) {
				break;
			}
		}
		
		System.out.println("1����" + num + "������ ����" + sum + "�Դϴ�.");
					
	}
	
}
