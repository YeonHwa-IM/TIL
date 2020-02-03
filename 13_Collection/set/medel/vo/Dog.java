package com.kh.example.set.medel.vo;

public class Dog implements Comparable<Dog> { //- The type Dog must implement the inherited abstract method  Comparable.compareTo(Object)
	// -name : String
	// -weight : double
	
	//+ �⺻ ������
	//+ �Ű����� �ִ� ������(���)
	
	//+ getter/setter()
	// +toString():String
	//  			������ : �̸�(������kg)
	
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
//	@Override //���ø���Ʈ �����Ŀ� ...����� �ߴµ� ���׸� ���� ���׸� Ÿ�������ϰ� �������̵� ����
//	public int compareTo(Object o) {
//		return 0;
//	}
	@Override //Comparable<Dog> ���ְ� �ѹ��� �������̵����ָ� ... 
	public int compareTo(Dog o) {
		//�̸��� ���ؼ� ��������.
		//������ ���� �̸��� �ʿ��ѵ� �ʵ忡 �����ϰ� �ֵ�. ���ǰ͸� �������� �ȴ�.
		String other = o.getName();
		//���̸��� ��Ʈ��, �ƴ��� ��Ʈ���̴ϱ� �񱳸� ���ָ鳡 
		return name.compareTo(other);
	}
}
