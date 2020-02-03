package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		//키보드로 문자열 값을 입력받아 출력 반복 실행
		//단, exit가 들어오면 반복 종료
		/*
		 
		 문자열 입력 : 안녕하세요
		 str : 안녕하세요
		 문자열 입력 : apple 
		 str : apple
		 문자열 입력 : exit
		 str : exit
		 		 
		  */
		
		Scanner sc = new Scanner(System.in);
		
//		//1. while
//		System.out.println("문자열 입력 : ");
//		String str = sc.nextLine();
//		System.out.println("str : " + str);
		//여기까지가 기본출력 형식
		// 우선, 반복문 문제 풀때 뭐가 반복되어야 하는지 확인하기
		// exit가 아닐때 까지 반복 한다.
		
////		String str = null; //스트링은 null로 초기와 시켜준다.
//		String str = " ";
//		while(!str.equals("exit")) {
//			System.out.println("문자열 입력 : ");
////			String str = sc.nextLine(); // 와일 위에 
//			str = sc.nextLine();
//			System.out.println("str : " + str);
//		}
//		}
		//2. do~while
//		String str = " ";		
		String str = null;
		do {
			System.out.println("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("str : " + str);
		} while(!str.equals("exit")); //세미콜론까지 잊지말것.
		
	}
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		do {
					
		System.out.println("1. 테스트 1");
		System.out.println("2. 테스트 2");
		System.out.println("3. 테스트 3");
		System.out.println("9. 종료");
		System.out.println("메뉴 선택 : ");
//		int menuNum = sc.nextInt();
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1: System.out.println(1); break;
		case 2: System.out.println(2); break;
		case 3: System.out.println(3); break;
		case 9: System.out.println("종료합니다."); break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}while(menuNum !=9);
		
	}
}
