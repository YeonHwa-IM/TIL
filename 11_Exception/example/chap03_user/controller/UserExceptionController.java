package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		 //����� ���� ���� ����.
//		Exception Ŭ������ ��ӹ޾� ���� Ŭ������ �ۼ��ϴ� ������
//		Exception �߻��ϴ� ������ throw new ����Ŭ������()���� �߻�
		
		
		//���̸� �Է��ϼ��� ��� ������ �߰� �ű⿡ ����ڰ� ���̸� �Է��ϸ� age������ �Է¹��� �� ����

		Scanner sc = new Scanner(System.in); // �ڹ�.��ƿ.���ɳ� �ܿ��

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();

		try {
			checkAge(age);
		} catch(MyException me) {
			System.out.println(me.getMessage());
		}

	}//19�̸� ����Ұ�  / �̻� ����
	public void checkAge(int age) throws MyException { 
		if(age <19) {
			throw new MyException("����Ұ�");

		}else {
			System.out.println("��");
		}
	}
}


