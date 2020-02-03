package com.kh.variable;

public class B_Constant {
	public void finalConstant() {
		int age;//일반변수 선언
		final int AGE;//상수선언
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		//변수의 값 변경
		age = 30;
//		AGE = 30; //이미 할당되어 있다는 에러가 뜸.
		//The final local variable AGE may already have been assigned
		//: AGE는 final이 붙은 상수인데, 상수는 한번만 값을 저장할수 있고 값 수정을 불가능함.
		// 그런데 16번째 줄에서 AGE에 30이라는 값으로 수정을 하려고 하니 값에 대해서 수정이 불가능하다면서 에러남.
		//고칠수있는 방법 없음.-> 이 에러는 고칠수 없기 때문에 주석처리.
		
		System.out.println("값 변경 후 age : " + age);
		System.out.println("값 변경 후 AGE : " + AGE);
	
	
	}

}
