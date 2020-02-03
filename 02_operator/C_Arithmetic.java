package com.kh.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2)); //나누기 했을 때 몫은 항상 정수일까?
		
		
	}
	public void method2() {
		double num1 = 35.0;
		double num2 = 10.0;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		//나누어 떨어지면, 나누어 떨어지는대로 .0으로 표시된다. 
		//나머지는 더블이든 인트가 되었든 나누어 떨어지든 아니든 몫은 꼭 정수가 아니어도 값이 출력된다.
		
	}

}
