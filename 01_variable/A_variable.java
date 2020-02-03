package com.kh.variable;

public class A_variable {//클래스
	
	public void declareVariable() { // 메소드
		//변수선언 후 초기화
		//A. 변수선언 : 자료형 변수명;
		//1.논리형
		boolean isTrue;
		
		//2.문자형
		// 2-1. 문자
		char ch;
		//2.2. 문자열
		String str; // S대문자로 들어가야한다!!
		
		//3.숫자형
		//3-1. 정수
		byte bNum;
		short sNum;
		int iNum;
		long LNum;
		//3-2. 실수
		float fNum;
		double dNum;
		//B. 초기화 : 변수형=값;
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		LNum = 8L; // 롱인것을 알려주기위해서 대문자 L을 붙인다.
//		fNum = 4.0f; // 실수의 기본형은 더불로 인지. 더블은 8바이트 이기때문에 
		// 8바이트짜리를 4바이트에 넣으니까 안되서 에러메세지가 출력
		// 에러를 고치려면 숫자 뒤에 f를 붙인다.
		//Type mismatch: cannot convert from double to float
		//4.0은 실수인데 기본적으로 실수는 double이 기본형이기 때문에 4.0을 float가 아닌 double으로 보고있음
		//근데 fNum은 자료현인 float(4byte)인테 넣고자 하는ㄱ ㅏㅄ은 8byte인 double형이기 때문에 
		//큰값을 작은 공간에 집어넣을 수 없다면서 에러가 떴음
		fNum = 4.0f;
		dNum = 8.0;
		
		ch = 'A';
		str = "A";//문자열은 큰 따옴표를 이용해서 그안에 집어 넣는다."=더블 포테이션
		// 한글자는 char str은 "한글자이상" , 사실상 한글자를 스트링에 넣어도 된다.
		// char는 무조건 한글자, stirng은 한글자, 혹은 한글자 이상
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);
		System.out.println("LNum의 값 : " + LNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		//실행메소드를 따로 만들어준다.
	}
	
	public void initVariable() {
		//변수선언과 동시에 초기화
		//1. 논리형
		boolean isTrue = false;
		//2. 문자형
		//2-1. 문자
		char ch = '가';
		//2-2. 문자열
		String str = "KH정보교육원";
		//3. 숫자형
		//3-1. 정수
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L; //롱인것을 알려주기 위해서 L을 작성
		
		//3-2. 실수
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("ch의 값 : " + ch);
		System.out.println("Str의 값 : " + str);
		System.out.println("bNum의 값 : " + bNum);
		System.out.println("sNum의 값 : " + sNum);
		System.out.println("iNum의 값 : " + iNum);//빼먹고 안적었음.
		System.out.println("lNum의 값 : " + lNum);
		System.out.println("fNum의 값 : " + fNum);
		System.out.println("dNum의 값 : " + dNum);
		
	}
	
}		
// **열린 중괄호 숫자에 맟춰서 닫힘을 닫아줘야함