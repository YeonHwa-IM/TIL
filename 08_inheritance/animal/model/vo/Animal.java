package com.kh.example.animal.model.vo;

public class Animal {
	//-name : String
	//-age : int 
	//-weight : double
	
	//+Animal():
	//+Animal(name:String, age:int, doulble:weight)
	
	//+getter/setter
	//+inform():String
	//		반환형식 : 이름 나이 몸무게

	//	 System.out.println(a); //주소값 
	//System.out.println(a.toString); = 주소값
	private String name;
	private int age;
	private double weight;
	
	public void Animal() {}
	
	public Animal(String name, int age, double weight) { //매개변수를 이용한 초기화
		this.name=name;
		this.age=age;
		this.weight=weight; // 변수값이 같기 때문에, this를 이용해서 초기화 해준다.
	}
	
	public void setName(String name) { //void라서 반환값이 없기 떄문에 this를 사용해서 
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
	
	
	@Override // 투스트링으로 주소값을 마음대로 바꾸기 위해 오버라이딩 한것이다.
	public String toString() {
		// TODO Auto-generated method stub
		return name + age + weight;
	}
		// public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		// super.는 오브젝트에 대한 toString을 말한다.
	
	//기존에 인폼으로 개체의 주소값을 가져왔었는데,  투스트링에 오버라이딩을 써서 부모클래스의 주소값을 불러올 수 있고,
	// 때문에 인폼은 더이상 쓰지않고 투스트링을 쓴다. 투스트링에 있는 리턴옆을 수정해 주면된다.
	// System.out.println(a); //주소값 
	//	System.out.println(a.toString); = 주소값
	// 투스트링을 쓰는것과 클래스 명을 써서 주소값을 가져오는게 동일하기 때문에 
	// 투스트링+오버라이딩+클래스명을 써서 주소값을 가져와주면된다. 
	
}	

