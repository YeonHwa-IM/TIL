package com.kh.example.chap06_method.model.vo;

public class Trainee {
	//필드선언
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;
	
	public Trainee() {} //기본생성자
	
	public Trainee(String name){
		this.name = name;
	}
	
	
	//초기화 시켜주기
	public Trainee(String name, char classRoom, double score) {
		this.name =name;
		this.classRoom = classRoom;
		Trainee.score = score; //static이라서...
	//	this.score = score; // 프로그램 시작할 때 스타틱 영역에 들어가기때문에 클래스명.
	}
	//세터 만들기
	//필드에 있는 name을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setName(String name) {
		this.name = name;
	}
	//세터만들기2
	//필드에 있는 ClassRoom을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	//세터만들기3
	//필드에 있는 score를 받아온 매개변수를 통해 초기화 시키는 setter
	public static void setScore(double score) {
		Trainee.score = score;
	}
	
	//게터만들기1
	//필드에 있는  name을  반환하는 getter
	public String getName(){//네임만 반환하기 떄문에 매개변수 필요없음
		return name;
	}
	//게터만들기2
	//필드에 있는  ACADEMY를  반환하는 getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	//게터만들기3
	//필드에 있는 classRoom를  반환하는 getter
	public char getClassRoom() {
		return classRoom;
	}
	
	//게터만들기4
	//필드에 있는 score를  반환하는 getter
	public static double getScore() {
		return score;
	}
	
	//게터만들기5
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
	
}
