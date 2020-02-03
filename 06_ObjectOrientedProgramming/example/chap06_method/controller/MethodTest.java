package com.kh.example.chap06_method.controller;

import com.kh.example.chap05_constructor.model.vo.User;

public class MethodTest {
	//매개변수의 유무와 반환 값 유무에 따른 구분
	// 1. 매개변수 없고, 반환 값 없는 메소드
	public void method1() {
		 //반환값이 X     매개변수X
		System.out.println("매개변수와 반환 값 둘다 없는 메소드 입니다.");

	}
	// 2. 매개변수 없고, 반환 값 있는 메소드
	public int method2() {
		// 반환값O      매개변수X
		//This method must return a result of type int
		//반환형이 존재하는 메소드에서 return값을 명시해주지 않았을 떄 나오는 에러.
		//(현재 반환해야 하는 값은 int이기 때문에 type int라고 뜨는것.
		//이 메소드는 반드시 리턴해야한다 타입이다. 인트인것에 대해 결과를 무조건 리턴해야한다고 경고.
		
//		return 0; 단순히 값 자체를 리턴으로 보낼수도 잇지만, 아래 두가지 형태로 돌려보낼수도 있다. 사용빈도는 반반.
		int i = 10;
		return i;
		
	}
	// 3. 매개변수 없고, 반환 값 없는 메소드
	public void method3(int num1, int num2) {
		// 반환값X        매개변수O
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
		/*num1 : 10
		  num2 : 20
		  sum : 30*/
		
//		return;//반환값이 없기때문에 리턴을 쓰더라도 나를 호출한 메소드로 돌아가지만 값을 안가지고 가져간다. 
	}
	// 4. 매개변수 있고, 반환 값 있는 메소드
	public int method4(int num1, int num2) {
		return num1 + num2;// 간단한거라면 그대로 반환 해도 된다.
		// 반환값O 		매개변수O

	}

	//심화1. 반환값이 배열인경우
	public int[] method5() {
		int[] iArr = {1,2,3,4,5};//10씩 증가한다
		for(int i=0; i < iArr.length; i++) {
			iArr[i] *=10;
		}
			System.out.println("methoeTest iArr : " + iArr);
			return iArr;
			/*methoeTest iArr : [I@15db9742
			  Run resultArr : [I@15db9742*/
		}
	
	//심화2. 반환값이 클래스인 경우
	public User method6() {
		User user = new User("user01", "pass01", "박신우");
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
}
	


