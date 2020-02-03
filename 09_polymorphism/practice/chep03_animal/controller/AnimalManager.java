package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] aArr = new Animal[5];
		
		aArr[0] = new Dog("강아지1", "종류1", 4);
		aArr[1] = new Cat("고양이1", "종류1", "지역1", "빨강");
		aArr[2] = new Dog("강아지2", "종류2", 5);
		aArr[3] = new Cat("고양이2", "종류2", "지역2", "파랑");
		aArr[4] = new Dog("강아지3", "종류3", 2);
		
		
		for(int i=0; i < aArr.length; i++) {
			if(aArr[i] instanceof Dog) {
				((Dog)aArr[i]).speak();
			}else {
				((Cat)aArr[i]).speak();
			}
		}
	}

}
