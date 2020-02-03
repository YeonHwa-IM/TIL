package com.kh.test;

public class MethodPrinter {
	public void methodA() {
		System.out.println("methodA() 호출됨...");
//		return;
		methodB();//Unreachable code 
				  //어차피 도달할수 없는 코드다. 그래서 무조건 갈수 없어서 에러 발생.
				  //리턴 밑에는 코드를 두지 않는다. 어차피 실행되지 않으니까.
		System.out.println("methodA() 끝남...");
		
	}
	public void methodB() {
		System.out.println("methodB() 호출됨...");
		methodC();
		System.out.println("methodB() 끝남...");
		
	}
	public void methodC() {
		System.out.println("methodC() 호출됨...");
		System.out.println("methodC() 끝남...");
	}
}
