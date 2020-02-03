package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTest {
	//�Ű������� ������ ��ȯ �� ������ ���� ����
	// 1. �Ű����� ����, ��ȯ �� ���� �޼ҵ�
	public void method1() {
		 //��ȯ���� X     �Ű�����X
		System.out.println("�Ű������� ��ȯ �� �Ѵ� ���� �޼ҵ� �Դϴ�.");

	}
	// 2. �Ű����� ����, ��ȯ �� �ִ� �޼ҵ�
	public int method2() {
		// ��ȯ��O      �Ű�����X
		//This method must return a result of type int
		//��ȯ���� �����ϴ� �޼ҵ忡�� return���� ��������� �ʾ��� �� ������ ����.
		//(���� ��ȯ�ؾ� �ϴ� ���� int�̱� ������ type int��� �ߴ°�.
		//�� �޼ҵ�� �ݵ�� �����ؾ��Ѵ� Ÿ���̴�. ��Ʈ�ΰͿ� ���� ����� ������ �����ؾ��Ѵٰ� ���.
		
//		return 0; �ܼ��� �� ��ü�� �������� �������� ������, �Ʒ� �ΰ��� ���·� ������������ �ִ�. ���󵵴� �ݹ�.
		int i = 10;
		return i;
		
	}
	// 3. �Ű����� ����, ��ȯ �� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// ��ȯ��X        �Ű�����O
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
		/*num1 : 10
		  num2 : 20
		  sum : 30*/
		
//		return;//��ȯ���� ���⶧���� ������ ������ ���� ȣ���� �޼ҵ�� ���ư����� ���� �Ȱ����� ��������. 
	}
	// 4. �Ű����� �ְ�, ��ȯ �� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		return num1 + num2;// �����ѰŶ�� �״�� ��ȯ �ص� �ȴ�.
		// ��ȯ��O 		�Ű�����O

	}

	//��ȭ1. ��ȯ���� �迭�ΰ��
	public int[] method5() {
		int[] iArr = {1,2,3,4,5};//10�� �����Ѵ�
		for(int i=0; i < iArr.length; i++) {
			iArr[i] *=10;
		}
			System.out.println("methoeTest iArr : " + iArr);
			return iArr;
			/*methoeTest iArr : [I@15db9742
			  Run resultArr : [I@15db9742*/
		}
	
	//��ȭ2. ��ȯ���� Ŭ������ ���
	public User method6() {
		User user = new User("user01", "pass01", "�ڽſ�");
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
}
	


