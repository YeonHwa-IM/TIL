package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception{ //Exception을 상속받기.
	public CharCheckException() {}
	public CharCheckException(String msg) { //매개변수로 받은 값을 부모 생성자로 넘기는 생성자
		super(msg);
	}
	

}
