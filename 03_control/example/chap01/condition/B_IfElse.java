package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	// if-else문
	// if(조건식){
	//		실행할 문장1;
	//	}else{
	//		실행할 문장2;
	//  }
	// 둘중 한개를 선택하는 조건문
	// 조건식 결과 값이 참(true)이면 if문 안에 있는 실행할 문장1 수행
	// 조건식 결과 값이 거짓(false)이면 if문을 빠져나와 else문 안에 있는 실행할 문장2 수행
	//
	
	public void method1() {
		//키보드로 입력한 숫자가 짝수인지 홀수인지 입력
		
		//'숫자 한개를 입력하세요 : ' 안내문구 출력 후 num 변수에 데이터 저장
		// 짝수이면 "입력하신 숫자는 짝수입니다.", 홀수이면"입력하신 숫자는 홀수입니다. 출력
		// 프로그램이 끝날때 "프로그램 종료"가지 출력 후 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num %2 == 0) {
				System.out.println("입력하신 숫자는 짝수입니다.");
		} else {
				System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램 종료");
	}
	
	public void method2() {
//사용자에게 국어, 영어, 수학 점수를 입력받아서 각각 kor, eng, math 변수에 저장
// 각 과목점수가 40점 이상이고 세과목 평균 점수가 60점 이상일 때 "시험통과",
// 하나라도 기준 미달일 때 "시험 불통과" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		//**형변환 해주기 위해서 3.0으로 입력한다.
		// 모두 end로 엮어야 함.
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("시험통과");			
		} else {
			System.out.println("시험불통과");
		}
	}
	public void method3() {
		//문자열 비교하기 : **String클래스 안에 있는 equals()라는 메소드를 사용해야한다.
		//**boolean java.lang.String.equals(Object object)..나중에..
		//같으면 true, 다르면 false이기때문에 boolean.
		
		//사용자에게 이름을 받는데 내가 지정한 이름과 같으면 "본인입니다."
		//같지 않으면 "본인이 아닙니다." 출력
		
		//** ==, != 문자에서는 ==으로 비교하면 안된다.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();
			//name이랑 박신우를 비교해야함	
		if(name.equals("박신우")) { // 문자열 비교라서 이퀄즈 사용해줘야함
				System.out.println("본인입니다.");
		} else {
				System.out.println("본인이 아닙니다.");
		}					
	}		
}
		
	


