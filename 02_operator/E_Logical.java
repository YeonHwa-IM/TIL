package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

		//&& : 피연산자가 모두 true 일때 true 반환(그리고, ~면서)
		//|| : 피연산자 중에서 하나라도 true일때 true 반환(또는, ~거나)
		
	public void method1() {
		//입력한 정수 값이 1~100 사이의 숫자인지 확인
		//정수 하나 입력 :
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// 1~100사이의 숫자
		// 숫자가 1보다 크거나 같<<<고>>>,100보다 작거나 같다. ===> and
		
		System.out.println("1부터 100사이의 숫자인지 확인 : " + (num >= 1 && num <= 100));
		
	}
	public void method2() {
	 // 입력한 문자 값이 대문자인지 확인
	 // 문자 하나 입력 :
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("문자 하나 입력 : ");
	 char ch = sc.nextLine().charAt(0); //모르겠당
	 
	 boolean isCap = (ch >= 'A' && ch <= 'Z'); 
	 //문자하나는 숫자로 치환할수있기때문에 크다 작다로 표현할수 있다.
	 System.out.println("영어 대문자가 맞습니까? : " + isCap);
	 
	 //계속하시려면 y 혹은 Y를 입력하세요 :
	 //계속하겠다고 하셨습니까? :_______(결과 값이 보이도록)
	 
	 System.out.println("계속하시려면 y 혹은 Y를 입력하세요 : ");
	 char ch2 = sc.nextLine().charAt(0); 
	 //여기까지는 가능
	 System.out.println("계속 하겠다고 하셨습니까? : " +(ch2 == 'y' || ch2 == 'Y')); 
	 //**반복문에서 많이 쓰임 꼭 숙지하기
	 //	 boolean isCap = (ch2 = "y" && ch2 = 'Y'); 완전 틀림.
	 
	
	 
	 
	 
	 		
	}

}
