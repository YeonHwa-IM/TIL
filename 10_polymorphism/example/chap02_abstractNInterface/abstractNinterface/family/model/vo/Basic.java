package com.kh.example.chap02.abstractNinterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
							//----------------------> Marker Interface 라고 부른다.
// 마우스로 클릭해서 들어가보면 안에 아무것도 없이 이름만 선언된 것들을 말한다. 
// 마커는 표시라는 뜻.  이 인터페이스를 구현한 클래스는 이런한 특성이 있다고 특성을 나타내주기 위해 쓰였다. 
// 마커 인터페이스는 마커인터페이스를 구현한 클래스가 이런한 특성이 있습니다하고 알려주기 위한 목적으로 사용된다.
// 단지 클래스의 특성을 나타내주기 위해서 사용함.
	//참고로 크로너블은 복제가 가능하다, 시리얼라이저블은 
	
	/*public abstract*/ void eat(); // 인터페이스에서는 생략가능
	/*public abstract*/ void sleep();
	//인터페이스를 마더와 베이비에 적용시켜보자.
	//마더와 베이비에 implements Basic을 붙인다.
	//public class  Mother extends Family implements Basic
}

