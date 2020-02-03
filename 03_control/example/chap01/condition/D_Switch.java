package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	//조건식의 결과 값을 case에서 찾아 명령을 수행하는 조건문
	//해당하는 값이 case에 없을 경우 default의 명령문 수행
	
	//case와 수행문 사이에는 콜론(;)을 써야하며
	//break가 없으면 멈추지 않고 계속 수행함
	
	public void method1() {
		//정수 두개와 연산 기호 문자 1개를 입력받아서
		//연산 기호 문자에 해당하는 계산을 수행하고 출력하세요
		/*
		 * 첫번째 값 :
		 * 두번째 값 :
		 * 연산자 (+,-,*,/) :
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 : ");
		int first =sc.nextInt();
		
		System.out.print("두번째 값 : ");
		int second =sc.nextInt(); //버터에 줄바꿈이 남아져 있는상태
		sc.nextLine();
		
		System.out.print("연산자(+,-,*,/) : ");
		char op = sc.nextLine().charAt(0);
		//**String str =sc.next();
		// java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//이번에 nextInt에서 남겨놓은 줄바꿈이 nextLine에서 버퍼에 남겨져있는 줄바꿈을 가져와서 에러가남.
		//줄바꿈을 100번해도 줄바꿈은 전에 것 1번만 남겨져 있음
		//OutOfBoundsException 배열에서도 있는 오류.
		//**어플리케이션 만들때에도 종종보는 에러기때문에정리해놓는게 좋음
		//1. 파싱을 하거나 2. 넥스트라인으로 쓰거나..
				
		int result = 0; //연산 결과 저장용 변수 
		
		switch(op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;	
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
		}	
			//마지막이니까 break 안들어가도 된다.
		System.out.println(first + " " + op + " " + second + " = " + result);	
			
		}
	public void method2() {
		//과일을 입력하여 사과는 1000, 바나나는 3000, 복숭아는 2000, 키위는 5000,
		//과일가게에 없는 과일을 입력했을때는 "잘못입력하였습니다." 출력하게 하여라
		//과일 이름을 입력하시오 :
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 이름을 입력하시오 : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "사과":
			price = 1000;
			break;
		case "바나나":
			price = 3000;
			break;
		case "복숭아":
			price = 2000;
			break;
		case "키위":
			price = 5000;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			return; //break에 커서를 오리면 switch에 색이 들어오고 그 케이스 문을 빠져나간다는 뜻.
			//return위에 커서를 올리면 void에 색이 들어온다.
			//"나를 호출한 메소드에게 돌아가는 기능".이때, "값을 가지고 돌아갈수도있고 아무것도 없이 돌아갈수도 있음."
			//리턴뒤에 값을 입력해놓으면 값을 들고 호출한 메소드로 돌아갈수도 있음.
			//리턴문을 아무때나 사용하지는 않는다.
			//컨트롤 커서 올리면 어디로 호출되는지 볼수있음
			//스텍구조에서 , 스텍에 쌓이고 쌓였던 것부터 종료되는 방식을  LIPO 방식 라스트인 펄스트 아웃 라고 한다.
			//기본적으로 리턴 아래에는 코드를 두지 않지만, 조건에 따라 리턴아래 코드에 도달할수 있는경우 에러 발행하지 않는다.
		}
				
		System.out.println(fruit + "의 가격은 " + price + "원입니다.");
	}
	
	public void method3() {
		//사용자가 입력한 메뉴 번호에 따라서 메뉴가 출력되게 하시오.
		/*
		  1. 회원등록
		  2. 회원수정
		  3. 회원삭제
		   메뉴번호를 입력하세요 :
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 회원등록");
		System.out.println("2. 회원수정");
		System.out.println("3. 회원삭제");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("회원등록 메뉴입니다.");
//			method1(); 메소드 호출~
			break;
		
		case 2:
			System.out.println("회원수정 메뉴입니다.");
			break;
	    case 3:
			System.out.println("회원삭제 메뉴입니다.");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
			
	}
	public void method4() {
		//1월부터 12월까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요
		//입력하신 달은 00일까지 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("1월~12월까지 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 4:	case 6:	case 9: case 11:
			System.out.println("입력하신 달은 30일까지 입니다.");			
			break;
		case 2:	
			System.out.println("입력하신 달은 28일 혹은 29일까지 입니다.");
			break;
		default:
			System.out.println("반드시 1~12 사이의 숫자를 입력해 주세요.");
		}//강사님 
				
		switch(num) {
		case 1:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 2:
			System.out.println("입력하신 달은 29일까지 입니다.");
			break;
		case 3:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 4:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 5:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 6:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 7:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 8:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 9:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 10:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		case 11:
			System.out.println("입력하신 달은 30일까지 입니다.");
			break;
		case 12:
			System.out.println("입력하신 달은 31일까지 입니다.");
			break;
		default:
		}
		
		
	}
}

