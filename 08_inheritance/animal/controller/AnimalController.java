package com.kh.example.animal.controller;

import com.kh.example.animal.model.vo.Animal;
import com.kh.example.animal.model.vo.Dog;
import com.kh.example.animal.model.vo.Snake;

public class AnimalController {
	public void method1() {
		Animal a = new Animal("������",9,6.3);
//		System.out.println(a.inform());//��ü�� �� �ʱ�ȭ �ƴ��� �ñ��ϸ�? �����ڸ� �� ����
		System.out.println(a);
		
		Dog d = new Dog("�¾���",8,4.5,40,"���");
//		System.out.println(d.inform());
		System.out.println(d);
		
		Snake s = new Snake("���",4,10.2,"����");
//		System.out.println(s.inform());
		System.out.println(s);
		
//		 System.out.println(a); //�ּҰ� 
//		System.out.println(a.toString); = �ּҰ�
	}

	/*������96.3
	�¾���84.5 40.0 ���
	���410.2 ����*/
}
