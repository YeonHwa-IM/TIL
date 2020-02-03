package com.kh.example.chap02.abstractNinterface.family.model.vo;

public abstract class Family {
	// - name : String
	// - weight : double
	// - health : int
	
	// + Family()
	// + Family(name:String, weight:double, health:int)
	
	// + getter/setter
	// + toString() : String
	
	private String name;
	private double weight;
	private int health;
	
	public Family() {}
	public Family(String name, double weight, int health) {
		this.name=name;
		this.weight=weight;
		this.health=health;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health=health;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name=" + name +"weight=" + weight + "health=" + health;
	}
	
//	public abstract void eat();//추상메소드는 몸통이 없다.
//	public abstract void sleep();
	
	
	
	
}
