package com.kh.example.person.model.vo;

public class Person { 
	// - name : String // - 는 프라이빗
	// - age : int
	// - gender : char
	// - height : double
	// - weight : double
	
	// + Person()  // 적는 순서 + () person
	// 기본생성자 , 메소드와 헷갈린다면 클래스와 이름이 같고, !!메소드는 반환값이 없어도 void를 적기때문에!!  void가 없으니 생성자.
	// + Person(name : String, age : int) 
	// + Person(name : String, age : int, gender :char, height : double, weight : double)
	
	// + getter/setter
	// + personInfo() : String
	//		 반환 값 형식 : 이름, 나이, 성별, 키, 몸무게
	
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public Person() {} // 복습
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Person(String name, int age, char gender, double height, double weight) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public int getGender() {
		return gender;
	}
	public void setGeight(double height) { // 복습
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) { // 복습
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	public String personInfo() { //복습
		return name + "," + age+ "," + gender + "," + height+ "," + weight;
	}

}
