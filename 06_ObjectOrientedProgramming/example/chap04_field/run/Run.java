package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// ��ü ���� : B_KindsOfVariable2
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
		int a = bkv.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		//����ƽ���� ��ü�������� �����ϴ�, ����ƽ ������� �����ؾ��Ѵٰ� ���´�.
		//���� ����� ������ ������, �Ʒ��� ����� �����ϴ�.
		// ����� �޼����� ���� ���α׷��� ������ ������, ���߿� ������ �� ���ɼ��� �ִ�.
		
		int a1 = B_KindsOfVariable2.staticNum;
		// ����ƽ ������� �ùٸ� ����� : Ŭ���� ��.������.����ƽ
		// static������ �ö��ֱ� ������ ��ü ���� ���� ����.
		// ������ �ǹ̸� ���� ����ƽ�� ���α׷� �����Ҷ�,
		// ����ƽ�� �̾Ƽ� ����ƽ ������ �־� �ε��Ѵ�.
		// ����ƽ�� �ּҸ� ���� �������� (Ǯ����)�ε� �ϱ� ������ 
		// ��ü ������ ���� �ʰ�  Ŭ���� �̸�.static�ϴ� �͸����� ����� �����ϴ�.
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		/*testNum : 11
		staticNum : 11
		
		testNum : 11
		staticNum : 12*/
			
		
		
		Product p = new Product(); //��ü ����
		p.inform(); 
		//JVM �⺻ �� �ʱ�ȭ : null, null, 0, 0
		// ��Ʈ���� �⺻���� null , int�� �⺻�� 0
		// ����� �ʱ�ȭ : ��������, ������, 1500, 100
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		//�ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 80
		//num�� static�̶� ó������ 100�� �ö����� �ѹ��� ������ �ι����δ�.
		
		Product p3 = new Product();
		p3.inform();
		//�ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 70
		//ĭ��, �Ե�, 1000, 139
		//ĭ��, �Ե�, 1000, 129
		//ĭ��, �Ե�, 1000, 119
		
		
	}

}
