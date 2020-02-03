package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// 객체 생성 : B_KindsOfVariable2
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
		int a = bkv.staticNum;
		//The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		//스테틱넘은 객체생성으로 접근하니, 스테틱 방법으로 접근해야한다고 나온다.
		//위의 방법이 문제는 없으나, 아래의 방법이 가능하다.
		// 노란색 메세지는 당장 프로그램은 문제가 없으나, 나중에 에러가 날 가능성이 있다.
		
		int a1 = B_KindsOfVariable2.staticNum;
		// 스테틱 예약어의 올바른 사용방법 : 클래스 명.변수명.스테틱
		// static영역에 올라가있기 때문에 객체 생성 없이 가능.
		// 공유의 의미를 가진 스테틱은 프로그램 시작할때,
		// 스테틱을 뽑아서 스테틱 영역에 넣어 로드한다.
		// 스테틱의 주소를 전부 가져가서 (풀네임)로드 하기 때문에 
		// 객체 생성을 하지 않고도  클래스 이름.static하는 것만으로 사용이 가능하다.
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		/*testNum : 11
		staticNum : 11
		
		testNum : 11
		staticNum : 12*/
			
		
		
		Product p = new Product(); //객체 생성
		p.inform(); 
		//JVM 기본 값 초기화 : null, null, 0, 0
		// 스트링의 기본값은 null , int의 기본값 0
		// 명시적 초기화 : 초코파이, 오리온, 1500, 100
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		//인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80
		//num이 static이라서 처음에는 100이 올라가지만 한번더 공유해 두번깍인다.
		
		Product p3 = new Product();
		p3.inform();
		//인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 70
		//칸초, 롯데, 1000, 139
		//칸초, 롯데, 1000, 129
		//칸초, 롯데, 1000, 119
		
		
	}

}
