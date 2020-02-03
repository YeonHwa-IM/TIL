package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		// parent Ŭ������ num �ʵ忡 ���� �Ϸ��� �оƮ ��ü ����
		System.out.println("ParentŬ������ num�ʵ� ����");
		
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());
		/*ParentŬ������ num�ʵ� ����
		Parent �ȿ� �ִ� num : 9*/
		
		
		System.out.println();
		
		System.out.println("Child1Ŭ������ str�ʵ� ����");
		
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1�ȿ� �ִ� str : " + c1.getStr());
		/*
		Child1Ŭ������ str�ʵ� ����
		Child1�ȿ� �ִ� str : Hello*/
		
		System.out.println("child1Ŭ������ num�ʵ� ����");
		c1.setNum(99);
		System.out.println("child1�ȿ� �ִ� num : " + c1.getNum());
		
		//�θ�Ŭ������ �ڽ�Ŭ������ ����num�� ������ ������ ��ӵǾ� ���� �ʾұ� ������
		// ���� �����;��ߴ�.
		
		 System.out.println();
		 
		 System.out.println("Child2 Ŭ������ str�ʵ� ����");
		 Child2 c2 = new Child2(); //��ü����
		 c2.setStr("World");
		 System.out.println("Child2 �ȿ� �ִ� str : " + c2.getStr());
		 /* Child2 Ŭ������ str�ʵ� ����
			Child2 �ȿ� �ִ� str : World*/
		 
		 
		 System.out.println("Child2 Ŭ������ ��ӹ��� Parent�� �ʵ� ����");
//		 c2.num;
		 // ���������ڰ� private�� ������ �ʴ´�. ������ �Ұ���.
		 c2.setNum(999);
		 System.out.println("Child2 �ȿ� �ִ� num : " + c2.getNum());
		 /*
			Child2 Ŭ������ ��ӹ��� Parent�� �ʵ� ����
			Child2 �ȿ� �ִ� num : 999*/
		 
		 //Q, �׷� �θ��� 9�� 999�� �ٲ������? no ��ӹ�������, ����Ǿ� �ִ°� �ƴϴ�. 
		 //�ڽ��� �θ� �̿밡��, �θ�� �Ұ���.
		 System.out.println("Child2 �ȿ� �ִ� num : " + c2.getNum());
		 System.out.println("Parent�ȿ� �ִ� num : " + p.getNum());
		 /*Child2 �ȿ� �ִ� num : 999
		   Parent�ȿ� �ִ� num : 9*/
		 
		
	}

}
