package com.kh.practice.numRange.exception;

public class NumRangeException extends Exception{//Exception을 상속받기.
	public NumRangeException() {}
	public NumRangeException(String msg) { //매개변수로 받은 값을 부모 생성자로 넘기는 생성자
		super(msg);
 		
	}
	
	

}
