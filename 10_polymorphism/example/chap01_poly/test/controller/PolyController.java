package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		Parent p = new Parent(); // ��ü����
		//���θ�Ÿ�� ���۷���     ���θ�ü
		p.printParent();//������ �ִ� �޼ҵ� �������� 
		/*
		 �� �θ��
		 */
		//-------------------------------------------------------------------------------------
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ��� ");
		Child1 c1 = new Child1();// �ڽİ�ü ��������
		//���ڽ�Ÿ�� ���۷���       �� �ڽİ�ü
		c1.printChild1();// ������ �ִ� �޼ҵ�� ����.
		c1.printParent();// c1�� Parent�� ��ӹް� �ֱ⶧���� �������� ����.
		/*
		�� ù��° �ڽ��̾�.
		�� �θ��*/
		//-------------------------------------------------------------------------------------
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = new Child2();// �����̸��� ��ü�� �����̸��� ������ ���� �ִ� �͸� �ߴµ� 
								//�ƾ� �ٸ� �̸��ε��� ���� = ������ ����. = ��ĳ���� 
		Parent p3 = new Child1(); // ������ ����. = ��ĳ���� 
								//�������� �Ƿ��� ����� ������ �Ǿ� �־�� �Ѵ�!

		p2.printParent();// ���ϵ�2�� �޾ƿԴµ� �� ���ϵ�� ����Ʈ�� �ȶߴ°���??
		System.out.println();
		/*�� �θ��*/

		//��ü�� ���ϵ���� ���������, ���ϵ��� �޼ҵ� �κб��� ��� ����ʹٸ�? p2��� �Ǿ� �ִ°��� ���ϵ�2�� Ȯ����Ѷ��� ����ȯ�� �ϸ� ���̴ٶ�� ���̴�.
		((Child2)p2).printChild2(); //����ȯ�� �Ǿ��⶧���� ���ϵ��� �޼ҵ���� �����ְ� �Ǿ���. = �ٿ�ĳ���� �̶�� �Ѵ�.
		// �ڽİ�ü�� �θ� ���۷������� ���°�.
		// ��ĳ���� : �θ�Ÿ���� ������ ������=���۷��������� ��� �ڽİ�ü�� ���� �� �ִ� ��.
		// �ݴ��, �θ�Ÿ���� �ڽ����� �������°���? �ٿ�ĳ���� �̶�� �Ѵ�.
		//-------------------------------------------------------------------------------------
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���"); 
//		Child2 c2 = new Parent();//(X)--> �ּ�
		//Type mismatch: cannot convert from Parent to Child2
		//new Parent();�� ������ ���� ������ Child2 ���� ���������, c2�� ((Child2)p2).printChild2();<-�̰����� �ٿ�ĳ���� �߱⶧����! ��Ʈ ����������! �����ִ�.
		//�׷��� ���ʿ�c2�� ������ ���� ���� c2�� �����ټ��� ����. 
		//�ڽ��� �θ� ������������, �θ�� �ڽ��� ����������.

		System.out.println();
		System.out.println("=== ���� ���� ==="); 
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		//pArr�� �����ִ� ����? �䷯��Ʈ,���ϵ�1,���ϵ�2
		pArr[0] = new Child1();
		pArr[1]	= new Child2();
		pArr[2]	= new Child1();
		pArr[3] = new Child2();

		for(int i = 0; i<pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i].print(); // ���� ���ε��� ��� : �ڽ� ��ü�� ���� ���� �� �ļ� ���� �켱���� ����
		}
		/*
		 �� ù��° �ڽ��̾�!!!!!
		�� �ι�° �ڽ��̾�!!!!!!
		�� ù��° �ڽ��̾�!!!!!
		�� �ι�° �ڽ��̾�!!!!!!*/


		
		
		
	}

}
