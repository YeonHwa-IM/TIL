package com.kh.example.chap03_assist.part02_object.model.vo;

import java.io.Serializable;

public class Member implements Serializable{ // 직렬화 
	// -userId : String
	// -userPwd : String
	// -userName : String
	// -email: String
	// -gender : char
	// -point : double
	
	// +Member()
	// +Member(userId:String, userPwd:String, userName:String, email:String, age:int,
				//gender:char, point:double)
	// + getter/setter
	// + toString():String
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2381941613205056360L; // 역직렬화 할때 에러가 안난다.
	private String userId;
	private transient String userPwd; // 직렬화에서 제외시키겠다.
	private String userName;
	private String email;
	private int age;
	private char gender;
	private double point;
	
	public Member() {}
	public Member(String userId, String userPwd, String userName, String email, int age, char gender, double point) {
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
		this.email=email;
		this.age=age;
		this.gender=gender;
		this.point=point;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd=userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point=point;
	}
	@Override
	public String toString() {
		return userId + " " + userPwd + " " + userName + " " + email + " " + age + " " + gender+ " " + point;
	}
	
	
}	

