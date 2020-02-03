package com.kh.example.person.model.vo;

public class Person { 
	// - name : String // - �� �����̺�
	// - age : int
	// - gender : char
	// - height : double
	// - weight : double
	
	// + Person()  // ���� ���� + () person
	// �⺻������ , �޼ҵ�� �򰥸��ٸ� Ŭ������ �̸��� ����, !!�޼ҵ�� ��ȯ���� ��� void�� ���⶧����!!  void�� ������ ������.
	// + Person(name : String, age : int) 
	// + Person(name : String, age : int, gender :char, height : double, weight : double)
	
	// + getter/setter
	// + personInfo() : String
	//		 ��ȯ �� ���� : �̸�, ����, ����, Ű, ������
	
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public Person() {} // ����
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
	public void setGeight(double height) { // ����
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) { // ����
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
	public String personInfo() { //����
		return name + "," + age+ "," + gender + "," + height+ "," + weight;
	}

}
