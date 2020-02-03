package com.kh.example.chap02.abstractNinterface.family.model.vo;

public class  Mother extends Family implements Basic{ //family�� ����ϱ�
	//The type Mother must implement the inherited abstract method Family.sleep()
	//�� �йи��� �߻�޼ҵ� �����̶�� �޼ҵ带 ������ �����϶�� ���´�.
	// ������ ���콺 �÷��� �������̵� ���ش�.
	
	// - babyBirth : String
	
	// + Mother()
	// + Mother(name:String, weight:double, health:int, babyBirth:String);
	
	// + getter/setter
	// + toString() : String
	
	private String babyBirth;
	
	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth=babyBirth;
	}
	public String getBabyBirth() {
		return babyBirth;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Mother ["+ super.toString()+", babyBirth=" + babyBirth + "]";
	}
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() -5);
	}
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 10);
		
	}

}