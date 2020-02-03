package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator</*<? super*/Student> {

	@Override
	public int compare(Student o1, Student o2) { //스튜던트로 제네릭 지정하지 않았다면 오브젝트였다.
		// 점수 오름차순 해주기 
		// 비교 주체가 비교대상보다 크면 양수
		// 비교 주체가 비교대상보다 작으면 음수
		// 비교 주체가 비교 대상과 같으면 0 반환
		
		//점수를 가져오자
		
		int standard = o1.getScore(); //주체
		int object = o2.getScore(); // 대상
		
		String standardName = o1.getName();
		String objectName = o2.getName();
		
		
		if(standard > object) {  // 내림차순으로 바꾸려면 어떻게 해아할까? 
			return 1;
		}else if(standard == object) {
//			return 0;
			// 점수가 같을때 오름차순해주기
			return standardName.compareTo(objectName);
		}else {
			return -1;
		}
	} // 컴퍼에리터 컴퍼러블 넘기고 디비에서 쉽게 정렬할수있음.

}
