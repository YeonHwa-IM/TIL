package com.kh.example.map.model.vo;

public class Snack { //map연습.
	//-flavor : String
	//-price : int
	
	//+기본생성자
	//+매개변수있는 생성자(전부)
	
	//+getter/setter
	//+toString() : String
	//    ㄴ형식 : 맛[가격원]
	
	private String flavor;
	private int price;
	
	public Snack() {}
	public Snack(String flavor, int price) {
		this.flavor=flavor;
		this.price=price;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor=flavor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return flavor+"["+price+"원]";
	}
	@Override
		public int hashCode() {
			final int prime = 31;
			int result =1;
			result = prime * result + ((flavor == null) ? 0: flavor.hashCode());
			result = prime * result +price;
			return result;
		}
	@Override
		public boolean equals(Object obj) {
		if(this==obj) return true; //if문아래 한줄만 들어가있다면 중괄호 없어도되고, 옆에 붙여도 가능하다.
		if(obj == null)return false;
		if(getClass() != obj.getClass())return false;
		
		Snack other = (Snack)obj;
		if(flavor == null) {
			if(other.flavor != null)return false;
		}else if(!flavor.equals(other.flavor))return false;
		if(price != other.price)return false;
			
		return true; 
		}
}
