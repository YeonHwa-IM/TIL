package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.method1();
		//void com.kh.example.chap06_method.controller.MethodTest.method1()
		//��ȯ���� ���� /                       Ŭ���� Ǯ����                               /�޼ҵ��̸�
		//void �̱⶧���� int dd = mt.method1(); ������ ����. ���ϰ����� �׳� ����.
		
		int result = mt.method2(); //�������� �ƹ��ų� ��ȯ����, �ڷ����� �߿��ϴ�.
		//����Ʈ�ϴ� �ΰ��� ���
		System.out.println(result);
		System.out.println(mt.method2());
		//int com.kh.example.chap06_method.controller.MethodTest.mathod2()
		/*	num1 : 10
			num2 : 20
			sum : 30*/
		
		mt.method3(10, 20);
		
		int result2 = mt.method4(10, 30);// ��ȯ���� �𸣸� ���콺 �����ؼ� �ڷ����� Ȯ���Ѵ�.
		//int com.kh.example.chap06_method.controller.MethodTest.method4(int num1, int num2)
		//����Ʈ�ϴ� �ΰ��� ���
		System.out.println(result2);
		System.out.println(mt.method4(10, 30));
		/* 40
		   40*/
		
		//��ȭ 1
		
		int[] resultArr = mt.method5();
		//int[] com.kh.example.chap06_method.controller.MethodTest.method5()
		System.out.println("Run resultArr : " + resultArr);
		/*methoeTest iArr : [I@15db9742
		  Run resultArr : [I@15db9742*/
		// ���� ���簡 �Ǿ� �ּҰ��� ������ �޾Ҵ�.
		
		//��ȭ2
		User user = mt.method6();
		System.out.println("Run user : "+ user);
		}
		/*MethodTest user : com.kh.example.chap05_constructor.model.vo.User@6d06d69c
		  Run user : com.kh.example.chap05_constructor.model.vo.User@6d06d69c*/

}
