package com.kh.operator;

public class D_Comparison {
	public void method1() {
		int a = 10;
		int b = 25;
		
		boolean result = (a == b);
		boolean result2 = (a <= b);
		boolean result3 = (a > b);
		
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		System.out.println("b�� ¦���ΰ�? " + (b % 2 == 0));
		System.out.println("b�� Ȧ���ΰ�? " + (b % 2 != 0));
		System.out.println("b�� Ȧ���ΰ�? " + (b % 2 == 0));
		/*result : false
		result2 : true
		result3 : false
		b�� ¦���ΰ�? false
		b�� Ȧ���ΰ�? true
		b�� Ȧ���ΰ�? false*/
		
		
	}

}
