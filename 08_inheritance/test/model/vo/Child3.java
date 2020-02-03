package com.kh.example.test.model.vo;

public class Child3 extends Parent{
	public Child3() {
//		super.num = 10; // 프라이빗이라서 불가능
//		super.dNum = 90.9; 패키지가 달라서
		super.bool = false; // 상속 받았기 때문에 가능
		super.ch = 'b'; //퍼블릭은 어디에서나 가능하기 때문에 가능
		
		
		
	}

}
