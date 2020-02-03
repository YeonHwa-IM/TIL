package com.kh.example.chap02.abstractNinterface.family.controller;

import com.kh.example.chap02.abstractNinterface.family.model.vo.Baby;
import com.kh.example.chap02.abstractNinterface.family.model.vo.Basic;
import com.kh.example.chap02.abstractNinterface.family.model.vo.Family;
import com.kh.example.chap02.abstractNinterface.family.model.vo.Mother;

public class FamilyController {
	public void method() {
//		Family f = new Family();
		//Cannot instantiate the type Family
		//객체생성을 할 수 없다.
		//그냥 X로 에러가 뜬다. 추상클래스는 객체생성이 불가능이었기 때문에 당연히 불가능하다고 나온다.
		//추상클래스는 객체생성 불가.
		
		Family f1 = new Mother("어머니",50 ,70, "출산");
		// 문제가 없는데 그 이유는? 다형성이고, 추상클래스는 참조변수로 사용할수있기때문에 문제없이 생성된다.
		Family f2 = new Baby("베이비", 3.5, 70);
		
		System.out.println(f1);
		System.out.println(f2);
		
		/*
		 name=어머니weight=50.0health=70
		 Baby [name=베이비weight=3.5health=70]*/
		
//		Basic b = new Basic(); // 가능한가? 안된다. 인터페이스는 추상메소드 밖에 없기때문에 객체생성 불가능.
		Basic b1 = new Mother("어머니", 50, 70, "출산");
		Basic b2 = new Baby("베이비", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 Mother [name=어머니weight=50.0health=70, babyBirth=출산]
		 Baby [name=베이비weight=3.5health=70]*/
	}

}
