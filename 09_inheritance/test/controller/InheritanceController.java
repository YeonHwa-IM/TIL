package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		// parent 클래스의 num 필드에 접근 하려면 패어런트 객체 생성
		System.out.println("Parent클래스의 num필드 접근");
		
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		/*Parent클래스의 num필드 접근
		Parent 안에 있는 num : 9*/
		
		
		System.out.println();
		
		System.out.println("Child1클래스의 str필드 접근");
		
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1안에 있는 str : " + c1.getStr());
		/*
		Child1클래스의 str필드 접근
		Child1안에 있는 str : Hello*/
		
		System.out.println("child1클래스의 num필드 접근");
		c1.setNum(99);
		System.out.println("child1안에 있는 num : " + c1.getNum());
		
		//부모클래스와 자식클래스는 같이num을 가지고 있지만 상속되어 있지 않았기 때문에
		// 각각 가져와야했다.
		
		 System.out.println();
		 
		 System.out.println("Child2 클래스의 str필드 접근");
		 Child2 c2 = new Child2(); //객체생성
		 c2.setStr("World");
		 System.out.println("Child2 안에 있는 str : " + c2.getStr());
		 /* Child2 클래스의 str필드 접근
			Child2 안에 있는 str : World*/
		 
		 
		 System.out.println("Child2 클래스가 상속받은 Parent의 필드 접근");
//		 c2.num;
		 // 접근제한자가 private라서 보이지 않는다. 접근이 불가능.
		 c2.setNum(999);
		 System.out.println("Child2 안에 있는 num : " + c2.getNum());
		 /*
			Child2 클래스가 상속받은 Parent의 필드 접근
			Child2 안에 있는 num : 999*/
		 
		 //Q, 그럼 부모의 9도 999로 바뀌었을까? no 상속받은거지, 연결되어 있는게 아니다. 
		 //자식은 부모 이용가능, 부모는 불가능.
		 System.out.println("Child2 안에 있는 num : " + c2.getNum());
		 System.out.println("Parent안에 있는 num : " + p.getNum());
		 /*Child2 안에 있는 num : 999
		   Parent안에 있는 num : 9*/
		 
		
	}

}
