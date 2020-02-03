package com.kh.example.test.model.vo;

public class Parent {
	private int num; //num 필드 private로 묶여있어서 다른클래스에서 가져다 쓸수 없다. 겟셋으로 쓸수있다.
	
	//프라이빗의 접근제한자 확인하자. 확인만 할거라서 아래 셋겟은 패스 
	double dNum;
	protected boolean bool;
	public char ch; 
	
	public void setNum(int num) { //num이 0인 상태에서 set으로 private의 num을 받아옴.
		this.num = num;
	}
	
	public int getNum() { //set을 받아서 num을 요청한 쪽으로 돌려줌. 어떻게? 리턴을 이용해서. 리턴은 자신을 부름
		return num;
	}

}