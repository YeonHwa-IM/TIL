package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util)
	
	//1
	private String userId; 
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//3
	public User() {}// 기본생성자 : 매개변수가 없는 생성자
	//jvm이 기본적으로 생성해줌
	//매개변수있는 생성자를 만들면 jvm이 자동으로 생성해주지 않기때문에 반드시 명시해야함.
	
	//생성자 사용목적 (객체가 하는일)
	// 1. 객체생성 : 객체를 생성해주기 위한 목적
	// 2. 필드 초기화 : 매개변수(외부에서 던저주는 값을 가져오는 애)로 받아온 값을 필드 초기화
	
	//생성자 사용 규칙
	// 1. 생성자명은 클래스명과 동일해야 한다.
	// 2. 반환형(리턴형)이 존재하지 않음. 기본생성자와 메소드랑 다른점은 반환값이 없다.!!!
	
	//4
//	public User() {}
	//Duplicate method User() in type User
	//메소드 유저가 중복되어 있다. 이유 : 오버로드가 적용되지 않았기 때문에. 
	//같은 이름의 생성자(메소드)가 있을 때 오버로딩이 적용되지 않으면 에러 발생 -> 주석처리
	
	//5 오버로딩 해보기   //9 매개변수의 이름을 객체이름과 동일하게 하면 이름의 수가 줄어든다.
					// 매개변수는 지역변수의 일종이다. 
					//메소드 영역 안에서 매개변수를 사용하고 싶기 때문에 지역변수>광역변수 이다. 지역변수가 우선순위.
					//지역변수의 userId가 우선이다.
	public User(String userId, String userPwd) {
//		System.out.println(id);
//		System.out.println(pwd); 값을 가져오는지 확인한거라서
		//id입니다 pwp입니다-->주석처리
		
		//6
		this.userId = userId; 
			//The assignment to variable userId has no effect
			//같은 매개변수에 매개변수명을 넣고 있는 것뿐이어서 아무효과가 없다고 안내가 뜸.
			//매개변수와 필드의 이름은 같이 쓸수없다.(X) this를 사용.
			//this
		this.userPwd = userPwd; 
		//결과 :id입니다, pwp입니다, null, null
	}
		//7 //10 this해보기
			//User u2라는 객체를 만들때, this가 주소값을 가지고 생성!!
			//매개변수명과 객체명을 동일하게 하려면 this를 써야한다.
	public User(String userId, String userPwd, String userName) {
				//11. 디스 생성자로 
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);
		this.userName = userName;
		//7출력 : id입니다, pwd입니다, 이름입니다., null
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		//1) this를 써서 초기화해주는 방법
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
//		this.enrollDate = enrollDate;
		
		//2) this를 써서 묶어서 초기화해주는 방법
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}
		//8-->주석처리
//	public User(String id, String name) {
//		//Duplicate method User(String, String) in type User
//		//
//		userId =id;
//		userName = name;
	
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
		//2
		//null, null, null, null // 초기화 하지 않아서 기본값이 나온다.
		
	}
}
