package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { // 같은패키지, Parent의 자식이 아님.
		Parent p = new Parent();
		
		
//		p.Num = 10; // num은 private여서 외부에서 볼수가 없다.
		p.dNum = 0.0; // 같은 패키지 안에 있기때문에 가능
		p.bool = false; //같은 패키지 안에 있기 때문에 가능
		p.ch ='A';	//같은 패키지 안에 있기 때문에 가능
		
	}
	
	public void setStr(String str) {
		this.str =str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
