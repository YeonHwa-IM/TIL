package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User(); // 기본생성자 안만들었지만 jvm이 자동으로 생성자 만들어줬다.
		//5-1
		//매개변수있는 생성자를 만든 상태에서 기본생성자를 지웠을 때 나는 에러
		//The constructor User() is undefined(정의되지 않았다)
		
		u1.inform();
		
		//2-1
		//null, null, null, null // 초기화 하지 않아서 기본값이 나온다.
		
		User u2 = new User("id입니다", "pwp입니다");
		//id입니다
		//pwp입니다  //u2.inform();을 하지않았는데도 매개변수가 값을 받아오기 떄문에 값이 표시됨.
		
		u2.inform();
		//null, null, null, null 표시되는 이유?
		
		User u3 = new User("id입니다", "pwd입니다", "이름입니다.");
		u3.inform();
		//id입니다, pwd입니다, 이름입니다., null
	}

}
