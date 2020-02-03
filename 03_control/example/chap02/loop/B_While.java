package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/* 
	 
	 While(조건식){
	 	실행문장;
	 	[증감식 or 분기문];(대괄호는 생략이 가능함을 말해준다.)
	 }
	 조건식 확인 -> (조건식 true 일 때) 실행 문장 수행 -> 조건식 확인 -> (반복)
	 조건식 결과가 false가 될 때까지 반복
	 
	 
	 */	
	public void method1() {
		//1부터 5까지 출력
		int i=1;
		while(i <= 5) {
			System.out.println(i + "번째 반복문 수행");
			i++;//증감식을 넣지 않으면 절대 프로그램이 끝나지 않는다.
		}

	}
	public void method1_1() {
		//자기소개 다섯번 하기 : 내이름은 박신우야
		
		int i=0;
		while(i < 5) {
			System.out.println("내이름은 박신우야");
			i++;
		}
	}
	public void method2() {
		//5부터 1까지 출력
		
		int i=5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
	}
	public void method3() {
		//1에서 10사이의 홀수만 출력
		
		int i=1;
		while(i <= 10) {
			System.out.println(i + " ");
			i += 2; 
		}
	}
	public void method4() {
		//정수 두 개를 입력받아 그 사이 숫자 출력
		
		//정수 두개를 입력하세요.
		//단, 첫번째 숫자가 두번재 숫자보다 작게 입력해주세요
		//첫번째 숫자:
		//두번째 숫자:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요."
				+ "단, 첫번째 숫자가 두번재 숫자보다 작게 입력해주세요");
		System.out.print("첫번째 숫자 : ");
		int start =sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int end =sc.nextInt();
		
		int max =0;
		int min =0;
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max =end;
			min =start;
		}
		
		while(min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}
	public void method4_1() {
		//정수를 하나 입력받아 그 수가 1~9 사이의 수 일대만 그 수의 구구단출력
		//조건이 맞지 않으면 1~9 사이의 양수를 입력하여야합니다 출력
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 하나 입력 :");
//		int num1 = sc.nextInt();
//		
//		int i = 1;
//				
//		while(i <= 9) {
//			System.out.println(num1 + "*" + i + "=" + (i * num1));
//			i++;
//		}
				
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 :");
		int dan = sc.nextInt();
		
		if(dan >= 1 && dan <=9) {
			int i =1;
			while (i < 10) {
				System.out.printf("%d * %d = %d%n", dan, i, (dan*1));
				i++;				
			}
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
			
	}
	public void method5() {
		//1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
						
		int random =(int)(Math.random() * 10 )+ 1;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
			System.out.printf("1부터 %d까지의 정수 합계 : %d", random, sum);
		}
	
	public void method6() {
		//사용자에게 문자열을 입력받아 인덱스 별로 문자 출력
		//문자열 입력 : apple
		//0 : a
		//1 : p
		//2 : p
		//3 : l 
		//4 : e
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();//apple
		
		//문자열의 길이를 반환하는 메소드 : length() //문자열을 세어서 몇개인지 알려주는 메소드
		int length = str.length();
		System.out.println(str + "의 길이 : " + length);
		
		//for		
		for(int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			System.out.println(i + ":" + ch);
		}
				
		//while
		int i = 0;
		while(i<length) {
			char ch = str.charAt(i);
			System.out.println(i + ":" + ch);
			i++;
		}
		
	}
	public void method7() {
		//2단부터 9단까지 출력
		
		int dan = 2;
		while(dan <= 9) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%d * %d = %d%n",dan,su,(dan*su));
				su++;	
			}	
				dan++;
					System.out.println();
			}
						
	}
	
	public void method8() {
		//아날로그 시계 
		
		int hour = 0;
		while(hour <= 24) {
			int min = 0;
		 	while(min <= 60) {
		 		System.out.printf("%2d시 %2d분 %n",hour,min);
		 		//%02d를 하게되면 앞에 02가 생성되서 2자리에 맞춰서 표시된다.
		 		//정수를 넣을 건데 2자리를 확보해서 %3d면 3자리를 확보해서 넣겠다.
		 		//빈칸에 대하여 %2d기본적으로 오른쪽 정렬이다. %-2d로 하면 왼쪽정렬이 된다.
		 		min++;			
		 	}
		 		hour++;
			}
	}
	public void method9() {
		//**정~~~~~~~~~~~~~~~~~~~~~말 많이 사용함. 
		//메뉴 반복의 경우 포문보다 와일문을 더 많이 쓴다.
		
		int menuNum = 0;//초기화해준다.
		while(menuNum !=9) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10사리 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴선택 : ");
			menuNum = sc.nextInt();
			//int menuNum = sc.nextInt();
			//스택영역에 변수명의 공간에 같은 이름이 두개라서 에러 뜸.
			//int만 지워주면된다.
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("잘못입력하셨습니다.");
			}
		}
		// 와일문 -> 입력 -> 메뉴선택 -> 스위치 -> 메소드 실행 -> 브레이크 -> 다시 와일문 조건 -> 조건 확인 -> 반복 
		
		
	}
	
}
	
	
