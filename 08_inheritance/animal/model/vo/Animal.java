package com.kh.example.animal.model.vo;

public class Animal {
	//-name : String
	//-age : int 
	//-weight : double
	
	//+Animal():
	//+Animal(name:String, age:int, doulble:weight)
	
	//+getter/setter
	//+inform():String
	//		��ȯ���� : �̸� ���� ������

	//	 System.out.println(a); //�ּҰ� 
	//System.out.println(a.toString); = �ּҰ�
	private String name;
	private int age;
	private double weight;
	
	public void Animal() {}
	
	public Animal(String name, int age, double weight) { //�Ű������� �̿��� �ʱ�ȭ
		this.name=name;
		this.age=age;
		this.weight=weight; // �������� ���� ������, this�� �̿��ؼ� �ʱ�ȭ ���ش�.
	}
	
	public void setName(String name) { //void�� ��ȯ���� ���� ������ this�� ����ؼ� 
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
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
//	public String inform() {
//		return name + age + weight;
	
	
	@Override // ����Ʈ������ �ּҰ��� ������� �ٲٱ� ���� �������̵� �Ѱ��̴�.
	public String toString() {
		// TODO Auto-generated method stub
		return name + age + weight;
	}
		// public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		// super.�� ������Ʈ�� ���� toString�� ���Ѵ�.
	
	//������ �������� ��ü�� �ּҰ��� �����Ծ��µ�,  ����Ʈ���� �������̵��� �Ἥ �θ�Ŭ������ �ּҰ��� �ҷ��� �� �ְ�,
	// ������ ������ ���̻� �����ʰ� ����Ʈ���� ����. ����Ʈ���� �ִ� ���Ͽ��� ������ �ָ�ȴ�.
	// System.out.println(a); //�ּҰ� 
	//	System.out.println(a.toString); = �ּҰ�
	// ����Ʈ���� ���°Ͱ� Ŭ���� ���� �Ἥ �ּҰ��� �������°� �����ϱ� ������ 
	// ����Ʈ��+�������̵�+Ŭ�������� �Ἥ �ּҰ��� �������ָ�ȴ�. 
	
}	

