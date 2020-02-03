package com.kh.example.chap02.abstractNinterface.family.controller;

import com.kh.example.chap02.abstractNinterface.family.model.vo.Baby;
import com.kh.example.chap02.abstractNinterface.family.model.vo.Basic;
import com.kh.example.chap02.abstractNinterface.family.model.vo.Family;
import com.kh.example.chap02.abstractNinterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		//Cannot instantiate the type Family
		//��ü������ �� �� ����.
		//�׳� X�� ������ ���. �߻�Ŭ������ ��ü������ �Ұ����̾��� ������ �翬�� �Ұ����ϴٰ� ���´�.
		//�߻�Ŭ������ ��ü���� �Ұ�.
		
		Family f1 = new Mother("��Ӵ�",50 ,70, "���");
		// ������ ���µ� �� ������? �������̰�, �߻�Ŭ������ ���������� ����Ҽ��ֱ⶧���� �������� �����ȴ�.
		Family f2 = new Baby("���̺�", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		
		/*
		 name=��Ӵ�weight=50.0health=70
		 Baby [name=���̺�weight=3.5health=70]*/
		
//		Basic b = new Basic(); // �����Ѱ�? �ȵȴ�. �������̽��� �߻�޼ҵ� �ۿ� ���⶧���� ��ü���� �Ұ���.
		Basic b1 = new Mother("��Ӵ�", 50, 70, "���");
		Basic b2 = new Baby("���̺�", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 Mother [name=��Ӵ�weight=50.0health=70, babyBirth=���]
		 Baby [name=���̺�weight=3.5health=70]*/
	}

}
