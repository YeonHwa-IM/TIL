package com.kh.example.animal.model.vo;

public class Dog extends Animal {
	//-name : String
	//-age: int
	//-weight:double
	//-height:double
	//-hair:String
	
	//+Dog()
	//+Dog(name:String, age:int, weight:double, height:double, hair:String)
	
	//+getter/setter
	//+inform():String
	//     ��ȯ���� : �̸� ���� ������ Ű ��
	
//	private String name;
//	private int age;
//	private double weight; 
	private double height;
	private String hair;
	
	public void Dog() {}
	
	public Dog(String name, int age, double weight, double height, String hair) {
//		this.name=name;
//		this.age=age;
//		this.weight=weight;
		super(name, age, weight);
		this.height=height;
		this.hair=hair;
		//�𽺾ȿ� ���̸��̶�� ������ �ʵ忡 ��õǾ� ���� �ʱ⶧���� ������.
		//Q�ʱ�ȭ�� ���Ѿ� �Ѵµ� ���� �ؾ��ұ�.
		//�Ŵϸֿ� �ִ� super(name, age, weight);�� �ʱ�ȭ �����ش�.
	}
//	public void setName(String name) {
//		this.name=name;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setAge(int age) {
//		this.age=age;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setWeight(double weight) {
//		this.weight=weight;
//	}
//	public double getWeight() {
//		return weight;
//	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	public void setHait(String hair) {
		this.hair=hair;
	}
	public String getHair() {
		return hair;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " " + height + " " + hair;
	}
	
//	public String inform() {
//		return super.getName() + " "+ super.getAge()+" " + super.getWeight( )+ " " + height + hair;
//		return super.inform() + " " + height + " " + hair;
	
	}  //�ִϸֿ��� �������µ�, ���⼭ �ִϸ��� super�ϱ� super.get���� �����´�.
		
	


