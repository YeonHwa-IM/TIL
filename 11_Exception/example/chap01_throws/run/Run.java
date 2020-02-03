package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run { 
	public static void main(String[] args) /*throws Exception*/ {
		//메인메소드에서도 예외상황을 호출한 쪽(JVM)으로 위임할 수 있음 ==> 비정상종료 됨
		//Unhandled exception type Exception 
		//-> add throws : 메인메소드에 throws Exception가 들어가면 비정상 종료된다.
		
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {
			e.printStackTrace(); // 예외내용과 예외 발생 위치를 콘솔에 출력해주는 메소드.
//			System.out.println("예외상황이 발행하였습니다.");
		} 
		System.out.println("정상적으로 종료 됨...");
	}
}
