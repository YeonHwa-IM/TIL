package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이"; //명시적 초기화
	private String brand ="오리온"; 
	private int price=1500;
	private static int num=100;

	{//인스턴스블럭 초기화
		name ="칸초";
		price = 1000;
		brand = "롯데";
		num -= 10; // 이미 스테틱에 올려놓고 그다음에 인스턴스블럭 초기화 하는 것은 가능하다.
	}
	static {
//		name ="홈런볼";
//		brand = "해태";
//		price = 2000;
//		// Cannot make a static reference to the non-static field name
//		// 스타틱이 없기때문에 인스턴스 블럭이다. 인스턴스가 만들어진다는건 객체가 만들어 진다는것
//		// 객체가 만들어 져햐 메모리영역에 올라간다.
//		// 스타틱은 프로그램 시작하자마자 올라간다.
//		// 생성되는 시점이 다르기 때문에 넣을 수가 없다.
		
		num = 150;
		num--;
		//때문에 스사틱 처럼 메모리 영역에 올라가는 시점이 같은 애들만 가능
		
		//스테틱 블록은 시작시 한번만 초기화 된다.
		//num 150 시작, --까지 해서 149 부터 시작  => 인스턴스 객체 초기화 해서  139
		// 인스턴스 블럭은 객체 생성시 마다 초기화 하기때문에!!
		// 객체2 생성 되서 인스턴스 블록 초기화 -10 = 129
		// 객체3 생성 되서 또  인스턴스 블록 초기화 -10 =119
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}

}
