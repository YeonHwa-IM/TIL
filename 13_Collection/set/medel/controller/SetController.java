package com.kh.example.set.medel.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.example.set.medel.compare.DogComparator;
import com.kh.example.set.medel.vo.Dog;

public class SetController {
	public void doset() {
		Set<Dog> set = new HashSet<Dog>(); // 다형성 적용 // 노란줄.. 제네릭 안해서 뜬다. dog 제네릭하고 임폴트하기
		
		set.add(new Dog("샤샤", 4.0));
		set.add(new Dog("호두", 4.5));
		set.add(new Dog("우유", 8.0));
		System.out.println(set); // 순서 유지 못함.
		
		set.add(new Dog("샤샤", 4.0));
		System.out.println(set);//뉴연산자때문에 주소값이 다르다 보니까 안에 값이 같으면 동등객체로 중복저장이 안되게끔 만들어주기 위해서 해쉬코드, 이퀄즈 오버라이딩까지 해줌
		
		
		//무슨말인지 1도 모르겠음~~~~~~
//		Set<String> test = new HashSet<String>(); 
		//이미 오버라이딩 된 해쉬코드와 이퀄즈가 걸러주고있다. 뭐를? 예시2를?
//		test.add("예시1");
//		test.add("예시2");
//		test.add("예시3");
//		System.out.println(test);
//		test.add("예시2");
//		System.out.println(test);
		
		//set은 list와 같으니까 패스한다고 하심.
		//list 모르겠는데요....  ㅜㅜ
		//set에는 인덱스가 없기때문에 리무브 배열로 지우는 클래스는 없음.
		
		//뭐...확인하는 과정이라는데 모르겠음^^
		Set<Dog> set2 = new LinkedHashSet<Dog>();//제네릭 해주고 , 임폴트
		set2.add(new Dog("초코", 2.1));
		set2.add(new Dog("콩이", 8.3));
		set2.add(new Dog("두부", 5.0));
		set2.add(new Dog("초코", 2.1));
		System.out.println(set2);
		//초코는 중복 제거 되었다.
		//[초코(2.1kg), 콩이(8.3kg), 두부(5.0kg)] 순서 유지되면서 중복제거되는 링크드의특징확인. 
		//링크드 특징확인하는거였구나^^...
		
		set2.add(new Dog("로이", 6.1));
		set2.add(new Dog("공주", 5.2));
		set2.add(new Dog("왕자", 9.5));
		set2.add(new Dog("조이", 12.5));
		System.out.println(set2);
		//[초코(2.1kg), 콩이(8.3kg), 두부(5.0kg), 로이(6.1kg), 공주(5.2kg), 왕자(9.5kg), 조이(12.5kg)]
		// 이건 왜한거지?^^.... 그냥 추가한거???
		
		//트리셋 연습!
		Set<Dog> set3 = new TreeSet<Dog>(set2); // 값 가져오는거 귀찮으니까 set2 매개변수로 넣어주기
		System.out.println(set3); 
		// 실행하면 정렬이 안되어 있다는 오류가 나옴. 정렬기준이 없기때문에 오류가 발생.
		//컴퍼러블 혹은 컴퍼레이터 로 정렬기준을 세워주겠음.
		//도그 가서.. =>임플리먼트, 오버라이딩하고, 제네릭하고, 다시 오버라이딩하고 비교할 값 가져오고 비교. 
		
		//[공주(5.2kg), 두부(5.0kg), 로이(6.1kg), 왕자(9.5kg), 조이(12.5kg), 초코(2.1kg), 콩이(8.3kg)]
		
		Set<Dog> set4 = new TreeSet<Dog>(new DogComparator());
		set4.add(new Dog("초코", 6.1));
		set4.add(new Dog("콩이", 8.3));
		set4.add(new Dog("두부", 5.0));
		set4.add(new Dog("초코", 2.1));
		set4.add(new Dog("로이", 6.1));
		set4.add(new Dog("공주", 5.2));
		set4.add(new Dog("왕자", 9.5));
		set4.add(new Dog("조이", 12.5));
		System.out.println(set4); // 이름 오름차순에서 몸무게 차순으로 새로운 정렬기준을 만들자.
		//새로운 정렬기준을 만들기 위해서 컴플레이터 적용한 클래스를 하나 만들기로하자.
		
		// Set<Dog> set4 = new TreeSet<Dog>(new DogComparator()); 로 새로 만든 생성자를 넣어주면 .. 
		//[초코(2.1kg), 두부(5.0kg), 공주(5.2kg), 초코(6.1kg), 콩이(8.3kg), 왕자(9.5kg), 조이(12.5kg)]
		// 로이가 없어졌따.정렬기준을 몸무게로만 하겠다고 해서 , 먼저들어온 초코만 들어가있고, 로이는 같은 몸무게라서 같은 객체로 판단하여 자동 삭제되었다.
		//떄문에 이름이랑 몸무게를 같이 정렬기준 삼아주면 된다... ㅜㅜ 어렵다고요....
		//컴퍼레이터 else if문에서 이름까지 같아야 같은객체라는걸 알려줘야한다.
		//[초코(2.1kg), 두부(5.0kg), 공주(5.2kg), 로이(6.1kg), 초코(6.1kg), 콩이(8.3kg), 왕자(9.5kg), 조이(12.5kg)]
		
		
		//요소 뽑아내기
		// 방법 1. Set을 List화 시키기  : addAll()
		List<Dog> list = new ArrayList<Dog>();// 리트스 만들고 도그 타입제한하기.
		list.addAll(set4);
		System.out.println(list);
		System.out.println(list.get(3));
		//[초코(2.1kg), 두부(5.0kg), 공주(5.2kg), 로이(6.1kg), 초코(6.1kg), 콩이(8.3kg), 왕자(9.5kg), 조이(12.5kg)]
		//로이(6.1kg)

		// 방법2. Iterator 활용하기 : iterator()
		
		Iterator<Dog> it = set4.iterator(); //도그 타입제한, 유틸 선택.
		while(it.hasNext()) {//다음값이 있는지 묻는것. 
			 System.out.println(it.next());//타입을 도그로 제한해서 반환값도 도그로 따라가서 제한되어있다.
		}	 
		/*로이(6.1kg)
		초코(2.1kg)
		두부(5.0kg)
		공주(5.2kg)
		로이(6.1kg)
		초코(6.1kg)
		콩이(8.3kg)
		왕자(9.5kg)
		조이(12.5kg)*/
		while(it.hasNext()) {
			System.out.println("re : " + it.next());
		} // 단방향이라서 이미 끝에 가있어서 읽어올게 없다.
		  // 맵은 리스트나 셋으로 바꿔서 리터레이터 이용해서 값을 읽어오는게 어렵다.
		// 때문에 잘 숙지해두어야 맵에서 하는 리터레이터 부분도 잘 따라갈수있다.
		
	}

}
