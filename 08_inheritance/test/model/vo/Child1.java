package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { // ������Ű��, Parent�� �ڽ��� �ƴ�.
		Parent p = new Parent();
		
		
//		p.Num = 10; // num�� private���� �ܺο��� ������ ����.
		p.dNum = 0.0; // ���� ��Ű�� �ȿ� �ֱ⶧���� ����
		p.bool = false; //���� ��Ű�� �ȿ� �ֱ� ������ ����
		p.ch ='A';	//���� ��Ű�� �ȿ� �ֱ� ������ ����
		
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
