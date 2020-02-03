package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	//실습문제1
	/*아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
	종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
	ex.
	1. 입력
	2. 수정
	3. 조회
	4. 삭제
	7. 종료
	메뉴 번호를 입력하세요 : 3
	조회 메뉴입니다.*/
	public void practice1() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1. 입력");
	System.out.println("2. 수정");
	System.out.println("3. 조회");
	System.out.println("4. 삭제");
	System.out.println("7. 종료");
	System.out.print("메뉴 번호를 입력하세요 : ");
	int menuNum = sc.nextInt(); 
	
	switch(menuNum) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
		}		
	}
	
	//실습문제2
	/*키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
	짝수가 아니면 “홀수다“를 출력하세요.
	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	ex.
	숫자를 한 개 입력하세요 : -8
	양수만 입력해주세요.*/
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
				
		if(num > 0 && num %2 == 0) {
			System.out.println("짝수다");
		}else if(num %2 !=0) {   // num %2 ==1 도 가능 
			System.out.println("홀수다");
		}else if(num < 0) {
			System.out.println("양수만 입력해 주세요.");
		}		
	}
	
	//실습문제3
	/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
	합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
	불합격인 경우에는 “불합격입니다.”를 출력하세요.
	[출력 예시는 다음 장에]
	*/
	
	public void practice3() {
		//국어 영어 수학 
		// 합계
		// 평균
		//합격 불합격 각각 40점 이상 평균 60점 이상
		//합격 국어, 영어, 수학 점수, 합계, 평균, 축하합니다. 합격
		//불합격 불합격입니다. 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
//		double avg = sum/3; 이것도 가능
		double avg = (kor + math + eng) / 3; 
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
				System.out.println("국어 : " + kor );
				System.out.println("수학 : " + math );
				System.out.println("영어 : " + eng );
				System.out.println("합계 : " + sum );
				System.out.println("평균 : " + avg );
				System.out.println("축하합니다, 합격입니다!");
			}else {
				System.out.println("불합격입니다.");
			}
		}
				

	//실습문제 4
	
	/*수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
	ex 1.
	1~12 사이의 정수 입력 : 8
	8월은 여름입니다.
	ex 2.
	1~12 사이의 정수 입력 : 99
	99월은 잘못 입력된 달입니다.*/
	
	public void practice4() {
		/*
		if(month == 1 || month == 2 || month == 12)
		{
				season = "겨울";
		} else if(month >= 3 && month <= 5) {
				season = "봄";
		} else if(month >= 6 && month <= 8) {
				season = "여름";
		} else if(month >= 9 && month <= 11) {
				season = "가을";
		} else {
				season = "해당하는 계절이 없습니다.";
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
	
		switch(num)	{
		case 1: case 2: case 12: 
			System.out.print(num + "월은 겨울입니다."); break;
		case 3: case 4: case 5: 
			System.out.print(num + "월은 봄입니다."); break;
		case 6: case 7: case 8: 
			System.out.print(num + "월은 여름입니다."); break;
		case 9: case 10: case 11: 
			System.out.print(num + "월은 가을입니다."); break;
		default : 
			System.out.print(num + "월은 잘못 입력된 달입니다.");
		}
	}
	
	//실습문제 5
	
	/*아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
	로그인 성공 시 “로그인 성공”,
	아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
	비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.*/
		
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		
		String ID = "myId";
		String PW = "myPassword12";

//이퀄스 예시
//if(name.equals("박신우"))	
//!str.equals("exit")

		if(id.equals(ID) && pw.equals(PW)){
			System.out.println("로그인 성공");
		}else if(!id.equals(ID)) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(!pw.equals(PW)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
// 이프를 나눠서 사용하는 방법 : 이퀄스에 단축키를 넣어도 되고.
//		if(id.equals("myId") && pw.equals("myPassword12")) {
//			System.out.println("로그인 성공");
//		} 	
//		if(!id.equals("myId")){
//			System.out.println("아이디가 틀렸습니다.");
//		} else if(!pw.equals("myPassword12")) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}				
//	}
	
	//실습문제 6
	/*사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
	단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
	비회원은 게시글 조회만 가능합니다.
	ex.
	권한을 확인하고자 하는 회원 등급 : 관리자
	회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회*/
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str =sc.next();
		
//		String str1 = "회원관리";
//		String str2 = "게시글 관리";
//		String str3 = "게시글 작성";
//		String str4 = "게시글 조회";
//		String str5 = "댓글 작성";
				
		switch(str) {
		case "관리자" :
			System.out.print("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//			System.out.print(str1 + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5);
			break;
		case "회원" :
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
//			System.out.print(str3 + ", " + str4 + ", " + str5);
			break;
		case "비회원" :
			System.out.print("게시글 조회");
//			System.out.print(str4);
			break;
		default:
		}
	}
	//실습문제7
	/*키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	저체중/정상체중/과체중/비만을 출력하세요.
	BMI = 몸무게 / (키(m) * 키(m))
	BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
	BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	BMI가 30이상일 경우 고도 비만
	ex.
	키(m)를 입력해 주세요 : 1.65
	몸무게(kg)를 입력해 주세요 : 58.4
	BMI 지수 : 21.45087235996327
	정상체중*/
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double dnum = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double dnum2 =sc.nextDouble();
		
		double bmi = dnum2 / (dnum * dnum);
		System.out.println("BMI 지수 : "+ bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi <= 18.5 || bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi <= 23 || bmi < 25) {
			System.out.println("과체중");
		}else if(bmi <= 25 || bmi < 30) {
			System.out.print("비만");
		}else if(bmi <= 30){
			System.out.println("고도비만");
		}
	}
	//실습문제 8  **문제풀이
	
	/*키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
	(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
	“잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)
	ex.
	피연산자1 입력 : 15
	피연산자2 입력 : 4
	연산자를 입력(+,-,*,/,%) : /
	15 / 4 = 3.750000*/
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char num3 = sc.next().charAt(0);
		
				
		double result = 0;
	
		if(num1> 0 && num2 > 0) { //**내가 안적은 부분
		
		switch(num3) {
		case '+':
//			System.out.println(num1 " + " num2 " = " (num1+num2)); break;
			result = num1 + num2; break;
		case '-':
			result = num1 - num2; break;	
		case '*':
			result = num1 * num2; break;
		case '/':
			result = (double)num1 / num2; break; // **더블로 안했음
			
			//만약 (double)(num1/num2) 로 하게 되면  인트/인트 를 먼저하고나서 더블을 하기 때문에
			// 결과값이 다를수 있다. 3.00000이 나오는 이유.
		case '%':
			result = num1 % num2;break;
		default : System.out.println("연산자를 잘못 입력했습니다. 프로그램을 종료합니다.");
		}	
		
		if(num3 == '/') {
			System.out.printf("%d %c %d = %f", num1, num3, num2, result);
		} else if(num3 == '+' || num3 == '-' || num3 == '*' || num3 == '%') {
			System.out.printf("%d %c %d = %f", num1, num3, num2, (int)result);
//			System.out.printf(num1 + " " + num3 + " " + num2 + " = " + result);
// 이걸로도 문제값을 나오게 할 수 있지만, 소수점 3.75 이하까지 나오지 않아서 위에 직접 나누기해줌?
		}
	}else {
		System.out.println("양수만을 입력해주세요. 프로그램을 종료합니다.");
		//이건 옵션
	}
		//15, 4, / 입력하면 결과값의 소수점이 부족하다 왜인지 모르겠다. 15 / 4 = 3.0???
	}
	//실습문제 9
	/*중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
	평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
	이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
	70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	[출력 예시는 다음 3장 참고]
	ex 1.
	중간 고사 점수 : 80
	기말 고사 점수 : 30
	과제 점수 : 60
	출석 회수 : 18
	================= 결과 =================
	중간 고사 점수(20) : 16.0
	기말 고사 점수(30) : 9.0
	과제 점수 (30) : 18.0
	출석 점수 (20) : 18.0
	총점 : 61.0
	Fail [점수 미달]
	
	ex 2.
	중간 고사 점수 : 80
	기말 고사 점수 : 90
	과제 점수 : 50
	출석 회수 : 15
	================= 결과 =================
	중간 고사 점수(20) : 16.0
	기말 고사 점수(30) : 27.0
	과제 점수 (30) : 15.0
	출석 점수 (20) : 15.0
	총점 : 73.0
	PASS
	
	ex 3.
	중간 고사 점수 : 100
	기말 고사 점수 : 80
	과제 점수 : 40
	출석 회수 : 10
	================= 결과 =================
	Fail [출석 회수 부족 (10/20)]
	*/
	
	public void practice9() { //**문제풀이
		//70점 이상일 경우 pass, 70점 미만이거나 전체 강의에 30%이상 결석 시 fail을 출력
		//1. 먼저 거르기 : 70점 이상일 경우 + 출석이 30 %이상이어야 함.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin =sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 회수 : ");
		int come = sc.nextInt();
		System.out.println("============= "+"결과"+" =============");
		
		if(!(come < 20*0.7)) { // 출석 점수가 20점 만점에 70퍼센트 미만이 아니면!
			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수(30) : " + hw * 0.3);
			System.out.println("출석 점수(20) : " + (come /20.0 * 100 * 0.2));
			
			double sum = mid * 0.2 + fin * 0.3 + hw * 0.3 + (come /20.0 * 100 * 0.2);
			
			System.out.println("총점 : " + sum);
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail[점수 미달]");
			}
			
		} else {
			System.out.println("Fail [출석 회수 부족] (" + come + "/20)");
		} 
		
	}	
	//과제랑 출석 점수에 띄어쓰기 확보해야하는것 같음.
//		double dnum1 = mid * 20 / 100;
//		double dnum2 = fin * 30 / 100;
//		double dnum3 = hw * 30 / 100;
//		double dnum4 = come * 20 / 20;
//		double sum = dnum1 + dnum2 + dnum3 + dnum4;
				
//		System.out.println("중간 고사 점수(20) : " + dnum1);
//		System.out.println("기말 고사 점수(30) : " + dnum2);
//		System.out.println("과제 점수(30) : " + dnum3);
//		System.out.println("출석 점수(20) : " + dnum4);
//		System.out.println("총점 : " + sum);
		
//		if(sum >= 70.0) {
//			System.out.println("PASS");
//		}
//		if(sum < 70.0 || dnum4 == (come * 30 / 20)) {
//			System.out.println("Fail[점수 미달]");
//		}	
//		else { 
//			System.out.println("Fail [출석 회수 부족] (" + come + "/20)");
//		}

//		if(dnum4 == (come * 30 / 20)) {
//			System.out.println("Fail [출석 회수 부족] (" + come + "/20)");
//		} //ㅋㅋㅋㅋ아~~~좆같다 이거에요~~~~
	
	//실습문제 10
	/*앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요.
	ex.
	실행할 기능을 선택하세요.
	1. 메뉴 출력
	2. 짝수/홀수
	3. 합격/불합격
	4. 계절
	5. 로그인
	6. 권한 확인
	7. BMI
	8. 계산기
	9. P/F
	선택 : 4 (실습문제4 실행)*/
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: practice1();{
			
		}	
			break;
		case 2: practice2();{
			
		}
			break;
		case 3: practice3();{
			
		}
			break;
		case 4: practice4();{
			
		}
			break;
		case 5: practice5();{
			
		}
			break;
		case 6: practice6();{
			
		}
			break;
		case 7: practice7();{
			
		}
			break;
		case 8: practice8();{
			
		}
			break;
		case 9: practice9();{
			
		}
			break;
		default:
		}
			
	}
}
