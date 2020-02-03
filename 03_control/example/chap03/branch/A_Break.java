package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	//break문은 자신이 포함된 가장가까운 반복문을 나감
	
	public void method1() {
		//문자열을 입력 받아 글자 (Scanner)
		//개수가 출력하는 반복 프로그램 (length())를 출력하는 반복(do~while)프로그램
		// 단, end가 입력되면 반복 종료
		// do~while 사용
		
		String str = " ";
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열을 입력 : ");
			str = sc.nextLine();
		
			if(str.equals("end")) {
				break;//브레이크와 세미콜론 사이에 커서를 두면 어디를 나가는지 표시해준다.
			}
		
			System.out.println(str + "의 글자 개수 : " + str.length());
		
		} while(true); //조건안에 true가 들어가면 무한반복문이라고 한다.
						//다른말로 무한 루프라고도 한다.
		
	}
	public void method2() {
		//1부터 사용자에게 입력받은 숫자까지의 합 출력
		//for문 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1;/* i <= num;*/; i++) {
			sum += i;
			
			if(i == num) {
				break;
			}
		}
		
		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
					
	}
	
}
