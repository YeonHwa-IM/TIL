package com.kh.example.person.controller;

import com.kh.example.person.model.vo.Person;

public class PersonController {
	public void method1() {
		//Person객체가 들어갈 수 있는 5개의 공간 생성
		//아까 작성한 person클래스의 배열을 만든다. 
		Person[] pArr = new Person[5];
	//  클래스명 [공간]배열명 =뉴연산자/생성자 클래스명[배열크기];
		//펄슨이라는 클래스의 객체만 들어갈수있는 배열을 만든다.
		
		System.out.println("pArr : " + pArr);
		//[Lcom.kh.example.person.model.vo.Person;@15db9742
		//person만 들어갈수있는 공간의 주소값을나타냄
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i +"] : " + pArr[i]);
		} /*pArr[0] : null
			pArr[1] : null
			pArr[2] : null
			pArr[3] : null
			pArr[4] : null 아직 개체를 넣어주지 않아서 */
		
		//각 인덱스 별로 객체를 생성하여 대입하기
		pArr[0] = new Person("강건강", 20, '남', 175.8, 66.9);
//클래스객체배열명[공간]=생성자/뉴연산자 클래스명(매개변수);
		pArr[1] = new Person("남나눔", 34, '남', 179.5, 96.1);
		pArr[2] = new Person("도대담", 14, '남', 190.0, 77.3);
		pArr[3] = new Person("류라라", 27, '여', 161.4, 56.8);
		pArr[4] = new Person("문미미", 53, '여', 157.9, 58.3);
	
		for(int i = 0; i < pArr.length; i++) {
			System.out.println("pArr[" + i +"] : " + pArr[i].personInfo());
		}          //pArr의 i번째의, .주소값안에, 메소드안에, personInfo() 정보를 가져오겠다.
		
		/* 내가 생성한 객체의 주소값이 들어감 오른쪽이 왼쪽으로 
		pArr[0] : com.kh.example.person.model.vo.Person@6d06d69c
		pArr[1] : com.kh.example.person.model.vo.Person@7852e922
		pArr[2] : com.kh.example.person.model.vo.Person@4e25154f
		pArr[3] : com.kh.example.person.model.vo.Person@70dea4e
		pArr[4] : com.kh.example.person.model.vo.Person@5c647e05*/
		// 펄슨만 들어갈수있는 객제공간을 만들어놓았고, 배열에 각각은 펄슨의 주소값을 가지고 있다.
		// 포문때문에 0~4까지 돌게되고, 각 배열에 펄슨 객체에 대한 주소값을 가지고 있는 객체가 있고, 
		// 그 객체가 가지고 있는 값을 가져오게 된다. personInfo()
		
		/*
		pArr[0] : 강건강,20,남,175.8,66.9
		pArr[1] : 남나눔,34,남,179.5,96.1
		pArr[2] : 도대담,14,남,190.0,77.3
		pArr[3] : 류라라,27,여,161.4,56.8
		pArr[4] : 문미미,53,여,157.9,58.*/
	}
	public void method2() {
//		pArr[0] = new Person("강건강", 20, '남', 175.8, 66.9);
//		pArr[1] = new Person("남나눔", 34, '남', 179.5, 96.1);
//		pArr[2] = new Person("도대담", 14, '남', 190.0, 77.3);
//		pArr[3] = new Person("류라라", 27, '여', 161.4, 56.8);
//		pArr[4] = new Person("문미미", 53, '여', 157.9, 58.3);
		
		Person[] pArr = {new Person("강건강", 20, '남', 175.8, 66.9),
					 	 new Person("남나눔", 34, '남', 179.5, 96.1),
						 new Person("도대담", 14, '남', 190.0, 77.3),
						 new Person("류라라", 27, '여', 161.4, 56.8),
						 new Person("문미미", 53, '여', 157.9, 58.3)};
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName() + "님의 정보 : " + pArr[i].personInfo());
		}
		/*
		강건강님의 정보 : 강건강,20,남,175.8,66.9
		남나눔님의 정보 : 남나눔,34,남,179.5,96.1
		도대담님의 정보 : 도대담,14,남,190.0,77.3
		류라라님의 정보 : 류라라,27,여,161.4,56.8
		문미미님의 정보 : 문미미,53,여,157.9,58.3*/
	}
		
}
