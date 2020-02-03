package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	//if-else if문
	//if(조건식1){
	//		실행할문장1;
	//}	else if(조건식2){
	//		실행할 문장2;
	//} else if(조건식3){
	//		실행할 문장3;
	//} else {
	//		실행할 문장4;
	//}
	// 다중조건을 줄 수 있는 조건문
	//조건식1이 참이면 실행할 문장 1수행
	//조건식2가 참이면 실행할 문장 2수행
	//조건식3이 참이면 실행할 문장 3수행
	//아무조건도 참이 아니라면 실행할 문장4 수행
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수하나입력 : ");
		int num = sc.nextInt();
		
		String result;
		if(num > 0) {
			result = "양수다";
		}else if(num == 0) {
			result = "0이다";
		}else {
			result ="음수다";
		}
		System.out.println(result);
		
	}
		public void method2() {
			//나이를 입력받아 13살 이하면 "어린이", 13초과 19살이하면 "청소년",
			//19살 초과"성인"출력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이");
		int age = sc.nextInt();
		
		if(age <= 13) {
				System.out.println("어린이");
		} else if(age > 19) {
				System.out.println("성인");
		} else {
				System.out.println("청소년");//**꼭 순서대로 조건을 걸지 않아도 된다!
		}
	}
				
		
}

