package com.kh.example.chap03_user.controller;

import java.util.Scanner;

import com.kh.example.chap03_user.model.exception.MyException;

public class UserExceptionController {
	public void inputAge() {
		 //사용자 정의 예외 배우기.
//		Exception 클래스를 상속받아 예외 클래스를 작성하는 것으로
//		Exception 발생하는 곳에서 throw new 예외클래스명()으로 발생
		
		
		//나이를 입력하세요 라는 문구가 뜨고 거기에 사용자가 나이를 입력하면 age변수에 입력받은 값 저장

		Scanner sc = new Scanner(System.in); // 자바.유틸.스케너 외우기

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		try {
			checkAge(age);
		} catch(MyException me) {
			System.out.println(me.getMessage());
		}

	}//19미만 입장불가  / 이상 관람
	public void checkAge(int age) throws MyException { 
		if(age <19) {
			throw new MyException("입장불가");

		}else {
			System.out.println("즐감");
		}
	}
}


