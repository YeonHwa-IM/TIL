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
	//     반환형식 : 이름 나이 몸무게 키 털
	
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
		//디스안에 네이름이라는 변수가 필드에 명시되어 있지 않기때문에 빨간줄.
		//Q초기화를 시켜야 한는데 어디로 해야할까.
		//매니멀에 있는 super(name, age, weight);로 초기화 시켜준다.
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
	
	}  //애니멀에서 가져오는데, 여기서 애니멀을 super니까 super.get으로 가져온다.
		
	


