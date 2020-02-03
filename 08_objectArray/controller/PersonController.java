package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		//Person��ü�� �� �� �ִ� 5���� ���� ����
		//�Ʊ� �ۼ��� personŬ������ �迭�� �����. 
		Person[] pArr = new Person[5];
	//  Ŭ������ [����]�迭�� =��������/������ Ŭ������[�迭ũ��];
		//�޽��̶�� Ŭ������ ��ü�� �����ִ� �迭�� �����.
		
		System.out.println("pArr : " + pArr);
		//[Lcom.kh.example.person.model.vo.Person;@15db9742
		//person�� �����ִ� ������ �ּҰ�����Ÿ��
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i +"] : " + pArr[i]);
		} /*pArr[0] : null
			pArr[1] : null
			pArr[2] : null
			pArr[3] : null
			pArr[4] : null ���� ��ü�� �־����� �ʾƼ� */
		
		//�� �ε��� ���� ��ü�� �����Ͽ� �����ϱ�
		pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
//Ŭ������ü�迭��[����]=������/�������� Ŭ������(�Ű�����);
		pArr[1] = new Person("������", 34, '��', 179.5, 96.1);
		pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
		pArr[3] = new Person("�����", 27, '��', 161.4, 56.8);
		pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);
	
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i +"] : " + pArr[i].personInfo());
		}          //pArr�� i��°��, .�ּҰ��ȿ�, �޼ҵ�ȿ�, personInfo() ������ �������ڴ�.
		
		/* ���� ������ ��ü�� �ּҰ��� �� �������� �������� 
		pArr[0] : com.kh.example.person.model.vo.Person@6d06d69c
		pArr[1] : com.kh.example.person.model.vo.Person@7852e922
		pArr[2] : com.kh.example.person.model.vo.Person@4e25154f
		pArr[3] : com.kh.example.person.model.vo.Person@70dea4e
		pArr[4] : com.kh.example.person.model.vo.Person@5c647e05*/
		// �޽��� �����ִ� ���������� �������Ұ�, �迭�� ������ �޽��� �ּҰ��� ������ �ִ�.
		// ���������� 0~4���� ���Եǰ�, �� �迭�� �޽� ��ü�� ���� �ּҰ��� ������ �ִ� ��ü�� �ְ�, 
		// �� ��ü�� ������ �ִ� ���� �������� �ȴ�. personInfo()
		
		/*
		pArr[0] : ���ǰ�,20,��,175.8,66.9
		pArr[1] : ������,34,��,179.5,96.1
		pArr[2] : �����,14,��,190.0,77.3
		pArr[3] : �����,27,��,161.4,56.8
		pArr[4] : ���̹�,53,��,157.9,58.*/
	}
	public void method2() {
//		pArr[0] = new Person("���ǰ�", 20, '��', 175.8, 66.9);
//		pArr[1] = new Person("������", 34, '��', 179.5, 96.1);
//		pArr[2] = new Person("�����", 14, '��', 190.0, 77.3);
//		pArr[3] = new Person("�����", 27, '��', 161.4, 56.8);
//		pArr[4] = new Person("���̹�", 53, '��', 157.9, 58.3);
		
		Person[] pArr = {new Person("���ǰ�", 20, '��', 175.8, 66.9),
					 	 new Person("������", 34, '��', 179.5, 96.1),
						 new Person("�����", 14, '��', 190.0, 77.3),
						 new Person("�����", 27, '��', 161.4, 56.8),
						 new Person("���̹�", 53, '��', 157.9, 58.3)};
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName() + "���� ���� : " + pArr[i].personInfo());
		}
		/*
		���ǰ����� ���� : ���ǰ�,20,��,175.8,66.9
		���������� ���� : ������,34,��,179.5,96.1
		�������� ���� : �����,14,��,190.0,77.3
		�������� ���� : �����,27,��,161.4,56.8
		���̴̹��� ���� : ���̹�,53,��,157.9,58.3*/
	}
		
}
