package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("1. 부모타입 레퍼런스로 부모 객체를 다루는 경우");
		Parent p = new Parent(); // 객체생성
		//ㄴ부모타입 레퍼런스     ㄴ부모객체
		p.printParent();//나한테 있는 메소드 가져오기 
		/*
		 나 부모야
		 */
		//-------------------------------------------------------------------------------------
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우 ");
		Child1 c1 = new Child1();// 자식객체 가져오기
		//ㄴ자식타입 레퍼런스       ㄴ 자식객체
		c1.printChild1();// 나한테 있는 메소드라서 가능.
		c1.printParent();// c1은 Parent를 상속받고 있기때문에 가져오기 가능.
		/*
		나 첫번째 자식이야.
		나 부모야*/
		//-------------------------------------------------------------------------------------
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우");
		Parent p2 = new Child2();// 같은이름의 객체를 같은이름의 변수에 집어 넣는 것만 했는데 
								//아얘 다른 이름인데도 가능 = 다형성 적용. = 업캐스팅 
		Parent p3 = new Child1(); // 다형성 적용. = 업캐스팅 
								//다형성이 되려면 상속이 전제가 되어 있어야 한다!

		p2.printParent();// 차일드2를 받아왔는데 왜 차일드는 프린트가 안뜨는건지??
		System.out.println();
		/*나 부모야*/

		//객체를 차일드까지 만들었으니, 차일드의 메소드 부분까지 모두 보고싶다면? p2라고 되어 있는것을 차일드2로 확장시켜라라는 형변환을 하면 보이다라는 것이다.
		((Child2)p2).printChild2(); //형변환이 되었기때문에 차일드의 메소드까지 볼수있게 되었다. = 다운캐스팅 이라고 한다.
		// 자식객체가 부모 레퍼런스에게 담기는것.
		// 업캐스팅 : 부모타입의 참조형 변수가=레퍼런스변수가 모든 자식객체를 받을 수 있는 것.
		// 반대로, 부모타입이 자식으로 내려가는것은? 다운캐스팅 이라고 한다.
		//-------------------------------------------------------------------------------------
		System.out.println("4. 자식타입 레퍼런스로 부모 객체를 다루는 경우"); 
//		Child2 c2 = new Parent();//(X)--> 주석
		//Type mismatch: cannot convert from Parent to Child2
		//new Parent();에 에러가 나는 이유는 Child2 까지 보고싶은데, c2는 ((Child2)p2).printChild2();<-이것으로 다운캐스팅 했기때문에! 페어런트 범위까지만! 볼수있다.
		//그래서 애초에c2가 가지고 있지 않은 c2는 보여줄수도 없다. 
		//자식은 부모를 받을수있으나, 부모는 자식을 받을수없다.

		System.out.println();
		System.out.println("=== 간단 예제 ==="); 
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		//pArr에 담길수있는 것은? 페러언트,차일드1,차일드2
		pArr[0] = new Child1();
		pArr[1]	= new Child2();
		pArr[2]	= new Child1();
		pArr[3] = new Child2();

		for(int i = 0; i<pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i].print(); // 동적 바인딩의 결과 : 자식 객체를 통한 실행 시 후손 것이 우선권을 가짐
		}
		/*
		 나 첫번째 자식이야!!!!!
		나 두번째 자식이야!!!!!!
		나 첫번째 자식이야!!!!!
		나 두번째 자식이야!!!!!!*/


		
		
		
	}

}
