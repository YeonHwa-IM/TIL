package com.kh.variable;

import java.util.Scanner;

public class F_KeyboardInput {

	/*public void inputScanner() {
		Scanner sc = new Scanner(System.in);//새연산자하면 바로 임폴트 해주기.
		
		
		System.out.print("이름을 입력하세요 : "); //안내 문구 역할 **사용자입장에서 만들어야한다.
		String name = sc.nextLine();//이코드를 입력하면 사용자가 값을 입력할때까지 기다림
		
		System.out.println(name);
		
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		System.out.println(name + "님은 " + age + "세");
		
		System.out.print("키(소수점 첫째 자리까지 입력) : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm 입니다.");
		//스캐너를 쓸때 유의해야 할점.
		
		
		
	}*/
	public void inputScanner2() {
		//사용자에게 이름과 나이를 입력받기
		
		Scanner sc = new Scanner(System.in);//새연산자
		
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();//저장될 곳이 출력 아래에 들어가야함, 줄바꿈을 남기지 않음
		
		System.out.print("나이를 입력해주세요 : ");
//		int age = sc.nextInt();//줄바꿈을 남김 
//		
//		System.out.print("주소를 입력해주세요(구까지) : ");
//		String adress = sc.nextLine(); //줄바꿈을 남기지않음
		
		
		//해결하는 방법
		//방법1. 줄바꿈을 가져갈 수 있는 nextLine() 추가
//		int age = sc.nextInt();
//		sc.nextLine();//버퍼에 남아있는 줄바꿈을 빼주는, 가져와주는 역할.
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
				
		//방법2. age를 받을때도 nextLine()을 쓰되, int로 파싱하기
		int age = sc.nextInt(); //원래는 안되는, 숫자를 문자열에 넣겠다고 하는것.//**
		//파싱:문자열을 기본자료형으로 바꿔주는 일.
		//같은 문자열이라도 1, 박신우 중 "1"을 숫자로는 가능 "박신우"는 숫자로 못바꿈
		//true는 블린으로 바꿀수 있지만 박신우는 블린으로 바꿀수없다. 박신우를 더블로 바꾼다거나.
		//박신우를 인트값으로 바꾼다거나 불가능. 
		
//		String  userAge = sc.nextLine();
//		int age = Integer.parseInt(userAge); //와.. 뭐라고?
//		//위의 두문장을 옆문장처럼 바로 이어줄수 있다. **= int age = integer.parseInt(sc.nextLine());
//		System.out.print("주소를 입력하세요 : ");
//		String adress = sc.nextLine();
		
		//방법3. next()로 주소를 받기
		//한계 : 넥스트 메소드를 띄어쓰기를 구분자로 인식한기 때문에 띄어쓰기가 들어간 경우 처음의 쓴 값만 가져온다.
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next(); //nextLine으로 하지않고 next로 한다.

		// + 추가 : char형을 받고 싶을 때는? 꼭 차라는 자료형에 저장하고싶을때.
		System.out.print("성별을 입력하세요 : ");//F나M으로 받기
//		String userGenger = sc.nextLine();
//		char gender = userGender.charAt(0);
		char gender = sc.nextLine().charAt(0);
		//charAt(int index): 문자열에서 index번째의 문자를 가져와주는 메소드
		//제로인덱스 기반에 따라 문자열의 0번째것을 가져오겠다는 뜻.
		
//		System.out.println(name + "님은" + age + "세이며, 사는 곳은 " + address + "입니다.");
		System.out.println("gender : " + gender);
		
	}

}
