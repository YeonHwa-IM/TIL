package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Dog("������1", "����1", 4);
		aArr[1] = new Cat("�����1", "����1", "����1", "����");
		aArr[2] = new Dog("������2", "����2", 5);
		aArr[3] = new Cat("�����2", "����2", "����2", "�Ķ�");
		aArr[4] = new Dog("������3", "����3", 2);
		
		
		for(int i=0; i < aArr.length; i++) {
			if(aArr[i] instanceof Dog) {
				((Dog)aArr[i]).speak();
			}else {
				((Cat)aArr[i]).speak();
			}
		}
	}

}
