package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method1() {
		Animal a = new Animal("강아지",9,6.3);
//		System.out.println(a.inform());//객체가 잘 초기화 됐는지 궁금하면? 생성자명 쩜 인폼
		System.out.println(a);
		
		Dog d = new Dog("태양이",8,4.5,40,"장모");
//		System.out.println(d.inform());
		System.out.println(d);
		
		Snake s = new Snake("방울",4,10.2,"빗살");
//		System.out.println(s.inform());
		System.out.println(s);
		
//		 System.out.println(a); //주소값 
//		System.out.println(a.toString); = 주소값
	}

	/*강아지96.3
	태양이84.5 40.0 장모
	방울410.2 빗살*/
}
