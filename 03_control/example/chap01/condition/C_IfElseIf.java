package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	//if-else if��
	//if(���ǽ�1){
	//		�����ҹ���1;
	//}	else if(���ǽ�2){
	//		������ ����2;
	//} else if(���ǽ�3){
	//		������ ����3;
	//} else {
	//		������ ����4;
	//}
	// ���������� �� �� �ִ� ���ǹ�
	//���ǽ�1�� ���̸� ������ ���� 1����
	//���ǽ�2�� ���̸� ������ ���� 2����
	//���ǽ�3�� ���̸� ������ ���� 3����
	//�ƹ����ǵ� ���� �ƴ϶�� ������ ����4 ����
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ϳ��Է� : ");
		int num = sc.nextInt();
		
		String result;
		if(num > 0) {
			result = "�����";
		}else if(num == 0) {
			result = "0�̴�";
		}else {
			result ="������";
		}
		System.out.println(result);
		
	}
		public void method2() {
			//���̸� �Է¹޾� 13�� ���ϸ� "���", 13�ʰ� 19�����ϸ� "û�ҳ�",
			//19�� �ʰ�"����"���
		Scanner sc = new Scanner(System.in);
		System.out.print("����");
		int age = sc.nextInt();
		
		if(age <= 13) {
				System.out.println("���");
		} else if(age > 19) {
				System.out.println("����");
		} else {
				System.out.println("û�ҳ�");//**�� ������� ������ ���� �ʾƵ� �ȴ�!
		}
	}
				
		
}

