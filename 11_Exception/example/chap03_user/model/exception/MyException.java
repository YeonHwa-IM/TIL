package com.kh.example.chap03_user.model.exception;

public class MyException extends Exception{ //Exception을 상속받기.
	public MyException() {}
	public MyException(String msg) {// 메세지라는 뜻.
		super(msg);
	}

}
