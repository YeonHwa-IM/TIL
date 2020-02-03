package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 for(초기식;조건식;증감식){
	 	실행문장;
	 }
	 초기식 -> 조건식->(조건문이 true일때)실행문장 -> 증감식 -> 조건식 확인 ->(반복)
	 조건식 결과가 false가 될 때까지 반복
	 증감식은 for문을 끝내기위한 장치.
	 
	 for문 안에 있는 초기식, 조건식, 증감식 모두 생략 가능
	  하지만, 모두 생략했을때 반복문이 무한으로 돌기 때문에 
	  for문 안이나 밖에다가 초기식은 무엇인지 조건은 무엇인지 증감은 얼마나 될건지를 모두 표기해야함.
	  즉, for() 안에서만 생략될 뿐 모두 필요한 요소임.
	 	 
	 */
	public void method1() {
		//1부터 5까지 출력
		
		for(int i=1; i <= 5; i++) {
			System.out.println(i+ "번째 반복문 수행");
			
		}
	}
	
	public void method1_1() {
		//자기소개 5번 하기 : 내 이름은 박신우야.
		
		for(int i=0; i <=4; i++) { //시작점이 꼭 1이 아니어도 된다.
			System.out.println("내 이름은 박신우야");//i를 꼭 활용하지 않아도 된다.
		}
	}
	
	public void method2() {
		//5부터1까지 출력하기
		
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}	
//		for(int i=1; i >= 5; i++) {
//			System.out.println(6 - i);
//		}
	}
	public void method2_1() {
		// 8부터 3까지 출력
		
		for(int i=8; i >=3; i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		//1에서 10사이의 홀수만 출력
		// 1 3 5 7 9
		
		for(int i=1; i <= 10; i+= 2) {
			System.out.print(i + " ");
		}//또는 
		for(int i=1; i <= 10; i++) {
			if(i % 2 != 0) { // if(i %2 == 1)
				System.out.print(i + " ");
			}
			
		}
	}
	public void method4() {
		// 정수 두개를 입력받아 그사이 숫자 출력
		/*
		 * 정수 두개를 입력하세요.
		 * 단, 첫번째 숫자가 두번째 숫자보다 작게 입력해주세요.
		 * 첫번째 숫자 : 1
		 * 두번째 숫자 : 5
		 * 1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요. "
				+ "단, 첫번째 숫자가 두번째 숫자보다 작게 입력해주세요.");
		
		System.out.println("첫번째 숫자 : ");
		int start =sc.nextInt();
		System.out.println("두번째 숫자 : ");
		int end =sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max = end;
			min = start;
		}
					
		for(int i = min; i <= max; i++ ) {
			System.out.print(i + " ");
		}
		
//		for(; min <= max; min++) {
//			System.out.print(min + " "); //생략해서 칠수 있다는것 그냥 알아두기.
			
		}
	public void method4_1() {
		//정수 하나를 입력받아 그 수가 1~9 사이의 수일때만 그 수의 구구단 출력
		//조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요 : ");
		int dan = sc.nextInt();
			for(int i =1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		if(dan >= 1 && dan <= 9) {
			
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
		
	}
	public void method5() {
		//1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		//홈페이지 이벤트 페이지 등 만들때 사용.
		
		//Math.random();//임의의 난수(실수)를 반환하는 메소드
		//원래 Math.random()의 범위 : 0 <= Math.random() < 1
		// 10까지 만들기 위해 10곱하기: 0 <= Math.random() * 10 < 10
		// 10을 포함하기 위해 1더하기 : 1 <= Math.random() * 10 + 1 < 11
		//정수로 만들기 위해 int형변환 : 1 <= (int)(Math.random() * 10 + 1) < 11
	
		int random = (int)(Math.random() * 10 + 1);
		//더블을 인트로 받으려해서 에러뜸
//		System.out.println(random);//랜덤 숫자 나옴.
		int sum=0;//정수 합계를 담을 공간 만들기
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지 정수합계 : %d", random, sum);
	}
	public void method6() {
		//2단부터 9단까지 출력 //줄바꿈 %n /n
		
		for(int dan = 2; dan <=9; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
			}
			System.out.println();//줄바꿈만들어준다. **종이에 적으며 이해해보기. **같은 문제를 숨도 안쉬고 쓸수 있는지.
		}		
		
	}
	public void method7() {
		//아날로그 시계 출력 : 0시0분 ~ 23시59분
		//반복되는것 0분~59분, 분을 안쪽에 있어야 한다.
		
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				System.out.printf("%d시 %d분%n", hour, min);
			}
		}
		
		
	}
	public void method8() {
		//한줄에 별(*)표가 5번 출력되는데
		//그 줄은 사용자가 입력한 수만큼 출력
		/*
		 출력할 줄수 :3
		 *****
		 *****
		 *****
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= 5; j++) {
			System.out.print('*');
			
		}
		System.out.println();
		}	
	}
	public void method9() {
		//한 줄에 별표 문자를 입력된 줄 수와 칸 수 만큼 입력
		//단, 줄 수와 칸수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		/*  
		 	줄 수 : 6    줄 수 : 5    줄 수 : 4
		 	칸 수 : 6    칸 수 : 4    칸 수 : 5
		 	1*****   1***		1****
		 	*2****   *2**		*2***
		 	**3***   **3*		**3**
		 	****4**  ***4		***4*
		 	*****5*  ****
		 	******6
		 		 	
		*/
	  Scanner sc = new Scanner(System.in);
	  System.out.print("줄 수 : ");
	  int row = sc.nextInt();
	  System.out.print("칸 수 : ");
	  int lin = sc.nextInt();
	  
	  for(int i = 1; i <= row; i++) {
		  for(int j =1; j <= lin; j++) {
			  if(i == j) {
				  System.out.print(i);
			 }else {
				  System.out.print("*");
			 }
		  }
			  System.out.println();
		  }
	  }
}

