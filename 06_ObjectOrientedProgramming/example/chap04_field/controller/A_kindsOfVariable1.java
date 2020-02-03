package com.kh.example.chap04_field.controller;

public class A_kindsOfVariable1 { //<== 클래스 영역의 시작
	
	// 클래스 영역에 작성하는 변수 : 필드 **private 접근제한자를 붙여야 한다.
	// ==멤버변수
	// ==멤버필드
	// ==전역변수
	
	private int glovalNum;
	
	public void mathod1(int num) { //<== 메소드 영역의 시작
		//				--------매개변수 : 메소드의 선언부 중 괄호 안에 선언하는 변수
		
		// 메소드 영역에서 작성하는 변수 : 지역변수 + 매개변수까지
		int localNum;
		// 매개변수 역시 지역변수의 일종으로 생각함
		// 괄호 안에 있는 매개변수는 외부 혹은 내부 클래스에서 보내는  값을
		// 그대로 받아오는 역할을 한다.
		// ex)deposit(int money)<---a.deposit(1000000)
		
		localNum = 10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized
		//: 지역변수는 반드시 초기화가 되어야 함.
		
		System.out.print(num);
		//:num을 따로 초기화 하지 않아도 에러가 발생하지 않는이유는 매개변수로 num이 들어가 있기 때문이다.
		
		System.out.println(glovalNum);
		//:전역변수이기 때문에 에러발생하지 않는다. 10번째 줄~ 32번째 줄까지가 전역변수의 영역.
		
		
		
	} // <==메소드 영역의 끝
	
	public void method2() {
//		System.out.println(localNum);
		//localNum cannot be resolved to a variable 
		//:localNum은 메소드 영역1 안에서만 사용이 가능하니까 에러가 발생.
		// 지역변수는 해당 지역 내에서만 사용 가능
		System.out.println(glovalNum);
		// 전역변수의 해당영역안이기 때문에 에러 없이 사용가능.
	}
	
} // <== 클래스 영역의 끝
