package com.kh.example.set.medel.compare;

import java.util.Comparator;

import com.kh.example.set.medel.vo.Dog;

public class DogComparator implements Comparator<Dog>{ 
	//1. 임플리먼트 2.임폴트 , 제네릭 <dog> 3... 
 
	@Override
	public int compare(Dog o1, Dog o2) {
		// 몸무게에 대해서 오름차순
		// 몸무게 받아오기
		
		double standard =o1.getWeight();
		double object = o2.getWeight();
		
		if(standard > object) {
			return 1;
			
		}else if(standard == object) {
//			return 0;
			//이름도 정렬기준으로 넣어서 로이 찾아주기.
			return o1.getName().compareTo(o2.getName()); 
		}else {
		
		return -1;
	}
	
	}
}
