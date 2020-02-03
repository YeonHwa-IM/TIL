package com.kh.example.set.medel.vo;

public class Dog implements Comparable<Dog> { //- The type Dog must implement the inherited abstract method  Comparable.compareTo(Object)
	// -name : String
	// -weight : double
	
	//+ 기본 생성자
	//+ 매개변수 있는 생성자(모두)
	
	//+ getter/setter()
	// +toString():String
	//  			ㄴ형식 : 이름(몸무게kg)
	
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name=name;
		this.weight=weight;
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
	public void setWeighr(double weight) {
		this.weight=weight;
	}
	@Override
	public String toString() {
		return name+"("+weight+"kg)";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result =1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return super.equals(obj);
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}


		Dog other =(Dog)obj;
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}

		if(weight != other.weight) {  
			return false;
		}
		return true;
	}
//	@Override //임플리먼트 한이후에 ...노란줄 뜨는데 제네릭 으로 도그를 타입제한하고 오버라이딩 해줌
//	public int compareTo(Object o) {
//		return 0;
//	}
	@Override //Comparable<Dog> 해주고 한번더 오버라이딩해주면 ... 
	public int compareTo(Dog o) {
		//이름에 대해서 오름차순.
		//내꺼에 대한 이름이 필요한데 필드에 존재하고 있따. 남의것만 가져오면 된다.
		String other = o.getName();
		//내이름도 스트림, 아더도 스트링이니까 비교만 해주면끝 
		return name.compareTo(other);
	}
}
