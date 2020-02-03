package com.kh.example.chap04_io.model.vo;

import java.io.Serializable;

public class Person implements Serializable{ // 직렬과 역직렬
	//-name : String
	//-age : int
	//+기본생성자
	//+매개변수있는 생성자
	//+getter/setter
	//+toString():String
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3591532140703328614L;
	private String name;
	private int age; 
	// Person  커서에서 2번클릭
	
	
	public Person() {}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return name + age;
	}
}
