package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() { // 유틸패키지로 해줘야 함.
		List list1 = new ArrayList(); // 기본생성자는 초기용량이 10
//		 list1.

		List<Student> list = new ArrayList<Student>(3);//제네릭 지정하기(임폴트)
		//앞에있는 제네릭타입을 보고 뒤에있는 제네릭 타입을 추정한다.new ArrayList<> 이렇게 이름을 생략하는 게 가능할수도 있음.
		//이제 스튜던트관련된 것만 저장가능하게 됨
		// 위와 같이 소괄호 안에 숫자를 넣으면 특정한 초기용량값 지정이 가능.
		
		//add(E e): 리스트 끝에 데이터 e 추가  값을 집어넣는 메소드
		
		list.add(new Student("테스트", 0)); 
		list.add(new Student("도대담", 60));
		
		System.out.println("list : "+ list);
		
		// 컬렉션 장점 1.. 크기의 제약이 없다.
		list.add(new Student("남나눔", 90));
		list.add(new Student("하현호", 85));
		
		System.out.println("현재 list에 담긴 element 개수 : "+ list.size());
		System.out.println("list : "+ list);
		/*현재 list에 담긴 element 개수 : 4
		list : [테스트(0점), 도대담(60점), 남나눔(90점), 하현호(85점)*/
		// 아무 문제없이 4개로 용량이 늘고, 순서도 유지되어 저장되었다.
		
		list.add(new Student("문미미", 66));
		System.out.println("현재 list에 담긴 element 개수 : "+ list.size());
		System.out.println("list : "+ list);
		/*현재 list에 담긴 element 개수 : 5
		list : [테스트(0점), 도대담(60점), 남나눔(90점), 하현호(85점), 문미미(66점)]*/
		
		//컬렉션 장점 2. 추가/삭제/정렬 등의 기능처리 간단
		//add(int index, E e) : index번재 인덱스에 e추가
		list.add(0, new Student("류라라", 100)); //0번재 인덱스에 류라라를 넣어라.
		System.out.println("list : "+list);
		
		list.add(3, new Student("강건강", 40));
		System.out.println("list : "+list); // 추가가 간단하다.
		
		//remove(int index) : 해당 index번째 객체 삭제
		list.remove(1);
		System.out.println("list : "+list); // 1번째 인덱스 삭제됨..
		//list : [류라라(100점), 도대담(60점), 강건강(40점), 남나눔(90점), 하현호(85점), 문미미(66점)]
		
		//remove(Object o) :해당 object객체 삭제
		list.remove(new Student("강건강", 40)); //안지워진다... 왜냐면? 주소값이 달라서! 
		System.out.println("list : "+list);
		// 그렇다면 객체주소를 알아내고 어쩌구 하면 귀찮아진다.
		// 오브젝트 클래스안에 있는 이퀄즈메소드와, 해시코드 메소드를 오버라이딩해서 재정의 해줘야 	객체에서 new해서 만든다고해도 삭제가 된다.
		// 어떻게 하냐면 주소값이 아닌 안에 들어가있는 필드값을 비교할수있게 만들어야한다.
		//  스튜던트클래스에서 스튜던트라는 객체와 주소값으로 넘어온 obj를 비교해주고 나서 다시 출력하면 강건강이 사라진걸 확인할수있다.
		// list : [류라라(100점), 도대담(60점), 남나눔(90점), 하현호(85점), 문미미(66점)]

//정렬 방법 1. collections 클래스 이용
		// 컬렉션을 이용할때 이용하기 좋은 메소드들을 모아놓은것.  (어레이즈 할때 말했었음)
		Collections.sort(list); // 정렬기준이 없어서 정렬할수가 없음. // 기준이 없이 솔트해~ 라고해도 정렬해주지 않는다.
		System.out.println("이름 오름차순 : "+list);		
		//list : [남나눔(90점), 도대담(60점), 류라라(100점), 문미미(66점), 하현호(85점)] 정렬된 모습을 볼수있다.
				
		//둘다 인터페이스이다.comparable, comparator로 정렬기준을 세워주도록할것이다.
		//comparable은 자바.랭 패키지 이기때문에 임폴트가 필요없다.(객체생성 따로 필요없음) **한개의 (기준만) 정렬만 가능하다.
		//comparator 는 랭 패키지가 아니어서 객체생성 따로 필요하고, 여러개의 정렬이 가능하다.
		
		//정렬할 수도 있도록 인터페이스를 상속받을것이다.
		
		//예시
//		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("저녁시간");
//		strList.add("점심시간");
//		strList.add("퇴근시간");
//		strList.add("기상시간");
//		strList.add("점심시간");
//		strList.add("출근시간");
//		strList.add("취침시간");
//		
//		System.out.println(strList); // 스트링은 정렬기준이 있어서 컬렉션즈 숏을 써주면 자동으로 정렬이 되었다.
//		Collections.sort(strList);
//		System.out.println(strList);
//		
		/*
		[저녁시간, 점심시간, 퇴근시간, 기상시간, 점심시간, 출근시간, 취침시간]
		[기상시간, 저녁시간, 점심시간, 점심시간, 출근시간, 취침시간, 퇴근시간]*/
		
		// 실습문제 제네릭 명시하면서 풀기. 컬렉션은 무조건 다 풀기

//정렬 방법 2. List.sort()메소드 이용
		list.add(new Student("박보배", 85));
		list.sort(new StudentComparator()); // 클래스 만들어준다
		System.out.println("점수 오름차순 : "+list);		
		//점수 오름차순 : [도대담(60점), 문미미(66점), 하현호(85점), 박보배(85점), 남나눔(90점), 류라라(100점)]
		 
		//하현호(85점), 박보배(85점) : 박보배가 먼저 나오게 하고싶다면?
		
		//이제 다른 메소드 배운다~~~~
		//set(int index, E e) : index번재 인덱스에 있는 요소를 e로 수정
		list.set(2, new Student("도대담", 31));
		System.out.println("list : "+ list); 
		//박보배가 도대담으로 변경
		
		//get(int index) : index번째 인덱스에 있는 요소를 가지고 옴
		Student s =list.get(2);//제네릭때문에 스튜던트가 반환값됨.
		System.out.println(s);
		System.out.println("list : "+list);
		
		//subList(int index1, int index2) : index1번째 인덱스부터 index2번째 인덱스까지 리스트반환
		System.out.println("list 추출 : "+list.subList(2,5));
		//list 추출 : [도대담(31점), 하현호(85점), 남나눔(90점)]
		
		//contains(Object o) : o가 리스트에 존재한다면 true 반환
		//indexOf(Object o) : o가 리스트에 위치하는 인데스 번호 반환, 없다면 -1반환
		System.out.println("남나눔, 90이 있는가? : "+list.contains(new Student("남나눔", 90)));
		System.out.println("남나눔, 90의 인덱스 위치는? : "+list.indexOf(new Student("남나눔", 90)));
		System.out.println("테스트, 0의 인덱스 위치는? : "+list.indexOf(new Student("테스트", 0)));
		//남나눔, 90이 있는가? : true
		//남나눔, 90의 인덱스 위치는? : 4
		//테스트, 0의 인덱스 위치는? : -1  //인덱스 오브만 많이 사용한다. -1 만 아니면~ 이런식으로... 뭔말인지...
		
		//clear() : 저장된 모든 객체를 삭제
		// isEmpty : 리스트가 비었을때 true 반환

		list.clear();
		System.out.println("list : "+list);
		System.out.println("list 가 비었나요? : "+list.isEmpty());
		//list : []
		//list 가 비었나요? : true
		
		
		//리스트 제일 많이 쓰고  셋하고 멥중에 멥많이쓴다.  메소드 활용법을 봐라.
	}

}
