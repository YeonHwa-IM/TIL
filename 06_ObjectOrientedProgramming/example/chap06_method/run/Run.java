package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.method1();
		//void com.kh.example.chap06_method.controller.MethodTest.method1()
		//반환값이 없다 /                       클래스 풀네임                               /메소드이름
		//void 이기때문에 int dd = mt.method1(); 같은건 못함. 리턴값없이 그냥 끝남.
		
		int result = mt.method2(); //변수명은 아무거나 상환없고, 자료형이 중요하다.
		//프린트하는 두가지 방식
		System.out.println(result);
		System.out.println(mt.method2());
		//int com.kh.example.chap06_method.controller.MethodTest.mathod2()
		/*	num1 : 10
			num2 : 20
			sum : 30*/
		
		mt.method3(10, 20);
		
		int result2 = mt.method4(10, 30);// 반환값을 모르면 마우스 오버해서 자료형을 확인한다.
		//int com.kh.example.chap06_method.controller.MethodTest.method4(int num1, int num2)
		//프린트하는 두가지 방식
		System.out.println(result2);
		System.out.println(mt.method4(10, 30));
		/* 40
		   40*/
		
		//심화 1
		
		int[] resultArr = mt.method5();
		//int[] com.kh.example.chap06_method.controller.MethodTest.method5()
		System.out.println("Run resultArr : " + resultArr);
		/*methoeTest iArr : [I@15db9742
		  Run resultArr : [I@15db9742*/
		// 얕은 복사가 되어 주소값을 보내고 받았다.
		
		//심화2
		User user = mt.method6();
		System.out.println("Run user : "+ user);
		}
		/*MethodTest user : com.kh.example.chap05_constructor.model.vo.User@6d06d69c
		  Run user : com.kh.example.chap05_constructor.model.vo.User@6d06d69c*/

}
