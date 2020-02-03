package com.kh.example.set.medel.compare;

import java.util.Comparator;

import com.kh.example.set.medel.vo.Dog;

public class DogComparator implements Comparator<Dog>{ 
	//1. ���ø���Ʈ 2.����Ʈ , ���׸� <dog> 3... 
 
	@Override
	public int compare(Dog o1, Dog o2) {
		// �����Կ� ���ؼ� ��������
		// ������ �޾ƿ���
		
		double standard =o1.getWeight();
		double object = o2.getWeight();
		
		if(standard > object) {
			return 1;
			
		}else if(standard == object) {
//			return 0;
			//�̸��� ���ı������� �־ ���� ã���ֱ�.
			return o1.getName().compareTo(o2.getName()); 
		}else {
		
		return -1;
	}
	
	}
}
